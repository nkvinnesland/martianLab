public class GastroDiseaseDetector implements PatternDetector {

    int indexOfPattern = -1;


    @Override
    public int detect(GenomeAnalyzer analyzer){
        String gene = analyzer.getBuffer();
        for(int i = 0; i < gene.length(); i++){
            if(gene.charAt(i) == 'G'){
                if(findPattern(gene, i)){
                    indexOfPattern = i;
                    return indexOfPattern;
                };
            }
        }
        return -1;
    }


    private boolean findPattern(String gene, int index){
        int i = index + 1;
        boolean foundT = false;

        // Traverse through the 'T's after the initial 'G'
        while (i < gene.length() && gene.charAt(i) == 'T') {
            foundT = true;
            i++;
        }

        // Check if there is a final 'G' after the 'T's
        return foundT && i < gene.length() && gene.charAt(i) == 'G';
    }

    @Override
    public String labelString(){
        return "a martian has gastro disease if it contains a string that begins with G," +
                " followed by one or more Ts, followed by another G. So GTTTG and GTG " +
                "fit the pattern, but GTTTC does not. ";
    }

    @Override
    public String additionalInfo(){
        if (indexOfPattern ==-1){
            return "";
        } else {
            return "Index of Pattern: " + indexOfPattern;
        }
    }
}

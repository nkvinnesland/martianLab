public class RepeaterDetector implements PatternDetector {
    char c;
    int numRepeat;
    int indexOfRepeating = -1;
    String pattern;

    public RepeaterDetector(char c, int numRepeat){
        this.c = c;
        this.numRepeat = numRepeat;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numRepeat; i++){
            sb.append(c);
        }
        this.pattern = sb.toString();

    }

    public int detect(GenomeAnalyzer analyzer){
        indexOfRepeating = analyzer.findSimpleSequence(pattern);
        return indexOfRepeating;
    }

    public String labelString(){
        return "a martian who tends to repeat his words can be detected if, anywhere in his genome, the letter G is repeated five times in a row.  ";
    }

    public String additionalInfo(){
        if (indexOfRepeating==-1){
            return "";
        } else {
            return "Index of Repeating: " + indexOfRepeating;
        }
    }

}

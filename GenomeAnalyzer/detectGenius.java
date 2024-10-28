public class detectGenius implements patternDetector{

//    Todo: datamember for list of things
    int indexOfGaga = -1;

    public int detect(GenomeAnalyzer analyzer){
        indexOfGaga = analyzer.findSimpleSequence("GAGA");
        return indexOfGaga;
    }

    public String labelString(){
        return " a martian is a genius if it has the string, “GAGA” anywhere in its genome. Themethod  findSimpleSequence can be used.";
    }

    public String additionalInfo(){
        if (indexOfGaga==-1){
            return "";
        } else {
            return "Index of GAGA: " + indexOfGaga;
        }
    }

}

public class Test {
    public static void main(String[] args) {
        GeniusDetector geniusDetector = new GeniusDetector();
        RepeaterDetector repeaterDetector = new RepeaterDetector('G',5);
        GastroDiseaseDetector gastroDiseaseDetector = new GastroDiseaseDetector();
        GenomeSeriesAnalyzer genomeSeriesAnalyzer = new GenomeSeriesAnalyzer("myTest.txt");
        genomeSeriesAnalyzer.addDetector(geniusDetector);
        genomeSeriesAnalyzer.addDetector(repeaterDetector);
        genomeSeriesAnalyzer.addDetector(gastroDiseaseDetector);
        genomeSeriesAnalyzer.run();

    }
}

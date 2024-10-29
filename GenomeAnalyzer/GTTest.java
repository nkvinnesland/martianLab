public class GTTest {
    public static void main(String[] args) {
        GeniusDetectorGT geniusDetector = new GeniusDetectorGT();
        RepeaterDetectorGT repeaterDetector = new RepeaterDetectorGT('G',5);
        GastroDiseaseDetectorGT gastroDiseaseDetector = new GastroDiseaseDetectorGT();
        GenomeSeriesAnalyzer genomeSeriesAnalyzer = new GenomeSeriesAnalyzer("myTest.txt");
        genomeSeriesAnalyzer.addDetector(geniusDetector);
        genomeSeriesAnalyzer.addDetector(repeaterDetector);
        genomeSeriesAnalyzer.addDetector(gastroDiseaseDetector);
        genomeSeriesAnalyzer.run();
    }
}

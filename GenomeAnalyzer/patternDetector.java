public interface patternDetector {
    public int detect(GenomeAnalyzer analyzer);
    public String labelString();
    public String additionalInfo();

}

public interface PatternDetector extends BaseDetector {
    public int detect(GenomeAnalyzer analyzer);
    public String labelString();
    public String additionalInfo();

}

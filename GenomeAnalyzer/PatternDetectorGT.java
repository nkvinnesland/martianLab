import java.util.List;

public interface PatternDetectorGT extends BaseDetector {
    public List<Integer> detect(GenomeAnalyzer analyzer);
    public String labelString();
    public String additionalInfo();

}

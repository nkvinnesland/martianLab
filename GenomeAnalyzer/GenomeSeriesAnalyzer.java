import java.util.ArrayList;
import java.util.List;

public class GenomeSeriesAnalyzer extends GenomeAnalyzer{
    List<BaseDetector> list;
    public GenomeSeriesAnalyzer(String filename){
        super(filename);
        list = new ArrayList<>();
    }

    public void addDetector(BaseDetector patternDetector){
        list.add(patternDetector);
    }

    public void run(){
        for(BaseDetector detector: list){
            // Display the common label and info
            System.out.println(detector.labelString());
            System.out.println(detector.additionalInfo());

            // Call the appropriate detect method based on the type of detector
            if (detector instanceof PatternDetector) {
                PatternDetector pd = (PatternDetector) detector;
                int index = pd.detect(this);
                System.out.println("PatternDetector detected at index: " + index);
            } else if (detector instanceof PatternDetectorGT) {
                PatternDetectorGT pdGT = (PatternDetectorGT) detector;
                List<Integer> indices = pdGT.detect(this);
                System.out.println("PatternDetectorGT detected at indices: " + indices);
            }
        }
    }

}

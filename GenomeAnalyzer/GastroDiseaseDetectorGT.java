import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GastroDiseaseDetectorGT implements PatternDetectorGT {

    List<Integer> list;
    String regexPattern;
    public GastroDiseaseDetectorGT(){
        this.list = new ArrayList<>();
        regexPattern = "GT+G";
    }

    @Override
    public List<Integer> detect(GenomeAnalyzer analyzer){
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(analyzer.getBuffer());
        while(matcher.find()){
            list.add(matcher.start());
        }
        return list;
    }

    @Override
    public String labelString(){
        return "a martian has gastro disease if it contains a string that begins with G," +
                " followed by one or more Ts, followed by another G. So GTTTG and GTG " +
                "fit the pattern, but GTTTC does not. ";
    }

    @Override
    public String additionalInfo(){
        if (list.isEmpty()){
            return "";
        } else {
            return "Index of Pattern: " + list.toString();
        }
    }
}

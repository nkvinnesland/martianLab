import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeaterDetectorGT implements PatternDetectorGT{

    List<Integer> list;
    String regexPattern;
    public RepeaterDetectorGT(char c, int numRepeat){
        this.list = new ArrayList<>();
        regexPattern = c + "{" + numRepeat + "}";
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
        return "a martian who tends to repeat his words can be detected if, anywhere in his genome, the letter G is repeated five times in a row.  ";

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

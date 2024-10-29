import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeniusDetectorGT implements PatternDetectorGT {

    List<Integer> list;
    String regexPattern;
    public GeniusDetectorGT(){
        this.list = new ArrayList<>();
        regexPattern = "GAGA";
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
        return " a martian is a genius if it has the string, “GAGA” anywhere in its genome. Themethod  findSimpleSequence can be used.";

    }

    @Override
    public String additionalInfo() {
        if (list.isEmpty()) {
            return "";
        } else {
            return "Index of Pattern: " + list.toString();
        }
    }
}

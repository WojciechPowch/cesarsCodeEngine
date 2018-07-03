import java.util.ArrayList;
import java.util.List;

public class Alfabet {

    public static List<String> getAlfabetList(){
        List<String> alfabet = new ArrayList<>();
        for(char c = 'a'; c <= 'z'; c++){
            alfabet.add(String.valueOf(c));
        }
        return alfabet;
    }

}

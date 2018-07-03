import java.util.ArrayList;
import java.util.List;

public class Alfabet {
    private static List<String> alfabet = new ArrayList<>();
    private Alfabet alfabetSn = new Alfabet();

    private void initializeLatinAlfabet(){
        for(char c = 'a'; c <= 'z'; c++){
            alfabet.add(String.valueOf(c));
        }
    }

    private Alfabet(){
        initializeLatinAlfabet();
    }

    public static List<String> getAlfabetList(){
        return alfabet;
    }

}

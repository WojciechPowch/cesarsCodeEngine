import java.util.ArrayList;

public class Encoder {
    private static ArrayList<String> alf = (ArrayList<String>) Alfabet.getAlfabetList();
    private static int alfLength = alf.size();
    private static int step;

    private static String getEncodeChar(int position){
        int encodeChrPosition = (position + step <= alfLength) ? (position + step)-1 : ((position + step) - alfLength)-1;
        return alf.get(encodeChrPosition);
    }

    public static String encode(String codedWord, int codeStep){

        step = codeStep;

        String encode = "";
        char[] codeArr = codedWord.toCharArray();

        for(int i = 0; i < codeArr.length; i++){
            int position = alf.indexOf(String.valueOf(codeArr[i]));
            encode += getEncodeChar(position);
        }

        return encode;
    }
}

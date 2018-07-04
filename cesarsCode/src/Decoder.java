import java.util.ArrayList;

public class Decoder {
    private static ArrayList<String> alf = (ArrayList<String>) Alfabet.getAlfabetList();
    private static int alfLength = alf.size();
    private static int step;

    private static String getDecodedChar(int position){
        int decodedChrPosition = (position - step >= 0) ? (position - step)+1 : (alfLength - Math.abs(position - step))+1;
        return alf.get(decodedChrPosition);
    }

    public static String decode(String codeWord, int codeStep){
        step = codeStep;

        String decoded = "";
        char[] codeArr = codeWord.toCharArray();

        for(int i = 0; i < codeArr.length; i++){
            int position = alf.indexOf(String.valueOf(codeArr[i]));
            decoded += getDecodedChar(position);
        }

        return decoded;
    }
}

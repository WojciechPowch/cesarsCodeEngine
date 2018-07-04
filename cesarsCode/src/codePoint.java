import java.util.Scanner;

public class codePoint {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String inputForEncoding = null;
        int step = 0;
        System.out.println("Please input string for encoding: ");
        inputForEncoding = scan.nextLine();
        inputForEncoding = inputForEncoding.toLowerCase();
        System.out.println("Please input encoding step: ");
        step = scan.nextInt();

        String result = Encoder.encode(inputForEncoding,step);
        System.out.println("Encodede word looks like: "+result);
        System.out.println("Now we try to decode result");

        String decResult = Decoder.decode(result,step);

        System.out.println("Decoded word look's like: "+decResult);
    }

}

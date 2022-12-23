import java.util.Scanner;

public class CeaserCipher {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encryptData(String inputStr, int shiftKey) {

        inputStr = inputStr.toLowerCase();

        String encryptStr = "";

        for (int i = 0; i < inputStr.length(); i++) {
            int pos = ALPHABET.indexOf(inputStr.charAt(i));

            int encryptPos = (shiftKey + pos) % 26;
            char encryptChar = ALPHABET.charAt(encryptPos);

            encryptStr += encryptChar;
        }

        return encryptStr.toUpperCase();
    }


    public static String decryptData(String inputStr, int shiftKey) {

        inputStr = inputStr.toLowerCase();

        String decryptStr = "";


        for (int i = 0; i < inputStr.length(); i++) {


            int pos = ALPHABET.indexOf(inputStr.charAt(i));


            int decryptPos = (pos - shiftKey) % 26;


            if (decryptPos < 0) {
                decryptPos = ALPHABET.length() + decryptPos;
            }
            char decryptChar = ALPHABET.charAt(decryptPos);


            decryptStr += decryptChar;
        }

        return decryptStr.toUpperCase();
    }

    public static void PrintCeaser(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a string for encryption using Ceaser Cipher : ");
        String str = input.nextLine();

        System.out.println("Please Enter a Key you want to shift with : ");
        int shiftKey = input.nextInt();


        String encrypt = encryptData(str , shiftKey);
        System.out.println("The Encrypted Message is : " + encrypt);
        System.out.println("The Decrypted Message is : " + decryptData(encrypt,shiftKey) );

        input.close();
    }
}

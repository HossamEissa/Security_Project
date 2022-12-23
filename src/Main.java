import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n*********** Hello Every body this is my Project for Security *************");

        int choice;
        do {
            System.out.println("\nWe have three program to help you encrypt or decrypt :\n"
                    + "1- CeaserCipher\n"
                    + "2- VignereCipher\n"
                    + "3- affineCipher\n"
                    + "4- Exit");
            System.out.print("Enter your number : ");

            int num = input.nextInt();
            System.out.println();
            choice = num ;
            while (choice < 1 || choice > 4){
                System.out.println("Oops!!\nPlease Enter a valid number !!");
                System.out.print("Enter your number : ");
                choice = input.nextInt();
                System.out.println();
            }

            switch (choice) {
                case 1:
                    CeaserCipher ceaserCipher = new CeaserCipher();
                    ceaserCipher.PrintCeaser();
                    break;
                case 2:
                    VignereCipher vignereCipher = new VignereCipher();
                    vignereCipher.PrintVignere();
                    break;
                case 3:
                    AffineCipher affineCipher = new AffineCipher();
                    AffineCipher.PrintAffine();
                    break;
                case 4:
                    System.out.println("Thanks for using our program Goodbye !");
                    break;
            }

        }while (choice != 4 );

    }
}

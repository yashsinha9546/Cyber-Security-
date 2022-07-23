
import java.security.Key;
import java.util.*;

class Algo{

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static String Encrypt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text for Encryption: ");
        String text = sc.nextLine();
        int key = 3;
        String cipherText = "";
        for (int i = 0; i < text.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(text.charAt(i));
            int keyVal = (key + charPosition) % 26;
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }

    public static String Decrypt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text for Decryption: ");
        String cipherText = sc.nextLine();
        int key = 3;
        String text = "";
        for (int i = 0; i < cipherText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - key) % 26;
            if (keyVal < 0)
            {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            text += replaceVal;
        }
        return text;
    }

}

public class CeaserCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     Algo ad = new Algo();
        System.out.println("1.Encrypt\n"+"2.Decrypt\n"+"3.Exit\n");
        System.out.println("Enter Your Choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1: {
                System.out.println(ad.Encrypt());
                break;
            }
            case 2:{
                System.out.println("Decrypt!");
                System.out.println(ad.Decrypt());
                break;
            }
            case 3:{
                System.out.println("Exiting...");
                break;
            }
        }
    }
}

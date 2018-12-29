import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string;
        String ch;

        System.out.println("Enter text: ");
        string = new Scanner(System.in).nextLine();

        MorseCodeGenerator generator = new MorseCodeGenerator(string);

        System.out.println("Enter \"Space\" character: ");
        ch = new Scanner(System.in).next();
        generator.setSpaceChar(ch);

        System.out.println("Morse code: " + generator.getMorseCode());
    }
}

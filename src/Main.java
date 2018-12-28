import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string;

        System.out.println("Enter text: ");
        string = new Scanner(System.in).nextLine();

        MorseCodeGenerator generator = new MorseCodeGenerator(string);

        System.out.println("Morse code: " + generator.getMorseCode());
    }
}

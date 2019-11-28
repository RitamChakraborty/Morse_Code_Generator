import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string;
        String ch;
        String shortDelay;
        String longDelay;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        string = scanner.nextLine();

        MorseCodeGenerator generator = new MorseCodeGenerator(string);

        System.out.println("Enter \"Space\" character: ");
        ch = scanner.next();
        generator.setSpaceChar(ch);

        System.out.println("Enter \"Short Delay\" character: ");
        shortDelay = scanner.next();
        System.out.println("Enter \"Long Delay\" character: ");
        longDelay = scanner.next();
        generator.setShortAndLongDelay(shortDelay, longDelay);

        System.out.println("Morse code: " + generator.getMorseCode());
    }
}

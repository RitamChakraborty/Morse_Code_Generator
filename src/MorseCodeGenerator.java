import data.MorseCode;

import java.util.InputMismatchException;

public class MorseCodeGenerator extends MorseCode {
    private final String text;
    private StringBuilder morseCode;
    private char[] charArray;

    public MorseCodeGenerator(String text) {
        this.text = text;
        morseCode = new StringBuilder();
    }

    private void setCharArray() {
        charArray = text.toCharArray();
    }

    private void setMorseCode() {
        for (char ch: charArray) {
            if (morseCodeList.containsKey(Character.valueOf(ch))) {
                morseCode.append(morseCodeList.get(Character.valueOf(ch))).append(" ");
            } else {
                throw new InputMismatchException(ch + " is not found in Morse Code");
            }
        }
    }

    public String getText() {
        return text;
    }

    public String getMorseCode() {
        setCharArray();
        setMorseCode();
        return morseCode.toString();
    }
}

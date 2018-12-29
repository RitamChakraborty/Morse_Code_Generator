import data.MorseCode;

import java.util.InputMismatchException;

public class MorseCodeGenerator extends MorseCode {
    private final String text;
    private StringBuilder morseCode;
    private char[] charArray;

    MorseCodeGenerator(String text) {
        this.text = text;
        morseCode = new StringBuilder();
    }

    private void setCharArray() {
        charArray = text.toCharArray();
    }

    private void setMorseCode() {
        for (char ch: charArray)
            if (morseCodeList.containsKey(ch)) {
                morseCode.append(morseCodeList.get(ch)).append(" ");
            } else {
                throw new InputMismatchException(ch + " is not found in Morse Code");
            }
    }

    public void setSpaceChar(String ch) {
        super.setSpaceChar(ch);
    }

    public String getText() {
        return text;
    }

    String getMorseCode() {
        setCharArray();
        setMorseCode();
        return morseCode.toString();
    }
}

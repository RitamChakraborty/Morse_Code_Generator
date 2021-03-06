package data;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {
    protected Map<Character, String> morseCodeList;

    protected void setSpaceChar(String ch) {
        morseCodeList.replace(' ', ch);
    }

    protected void setShortAndLongDelay(String shortDelay, String longDelay) {
        for (char ch: morseCodeList.keySet()) {
            if (ch != ' ') {
                String morseCode = morseCodeList.get(ch);
                char[] chars = morseCode.toCharArray();
                StringBuilder stringBuilder = new StringBuilder();

                for (char chr: chars) {
                    if (chr == '.') {
                        stringBuilder.append(shortDelay);
                    } else {
                        stringBuilder.append(longDelay);
                    }
                }

                morseCodeList.put(ch, stringBuilder.toString());
            }
        }
    }

    protected MorseCode() {
        morseCodeList = new HashMap<>();

        morseCodeList.put(' ', "/");
        morseCodeList.put('!', "-.-.--");
        morseCodeList.put('"', ".-..-.");
        morseCodeList.put('$', "...-..-");
        morseCodeList.put('&', ".-...");
        morseCodeList.put('(', "-.--.");
        morseCodeList.put(')', "-.--.-");
        morseCodeList.put('+', ".-.-.-");
        morseCodeList.put(',', "--..--");
        morseCodeList.put('-', "-....-");
        morseCodeList.put('.', ".-.-.-");
        morseCodeList.put('/', "-..-.");
        morseCodeList.put('0', "-----");
        morseCodeList.put('1', ".----");
        morseCodeList.put('2', "..---");
        morseCodeList.put('3', "...--");
        morseCodeList.put('4', "....-");
        morseCodeList.put('5', ".....");
        morseCodeList.put('6', "-....");
        morseCodeList.put('7', "--...");
        morseCodeList.put('8', "---..");
        morseCodeList.put('9', "----.");
        morseCodeList.put(':', "---...");
        morseCodeList.put(';', "-.-.-.");
        morseCodeList.put('=', "-...-");
        morseCodeList.put('?', "..--..");
        morseCodeList.put('@', ".--.-.");
        morseCodeList.put('A', ".-");
        morseCodeList.put('B', "-...");
        morseCodeList.put('C', "-.-.");
        morseCodeList.put('D', "-..");
        morseCodeList.put('E', ".");
        morseCodeList.put('F', "..-.");
        morseCodeList.put('G', "--.");
        morseCodeList.put('H', "....");
        morseCodeList.put('I', "..");
        morseCodeList.put('J', ".---");
        morseCodeList.put('K', "-.-");
        morseCodeList.put('L', ".-..");
        morseCodeList.put('M', "--");
        morseCodeList.put('N', "-.");
        morseCodeList.put('O', "---");
        morseCodeList.put('P', ".--.");
        morseCodeList.put('Q', "--.-");
        morseCodeList.put('R', ".-.");
        morseCodeList.put('S', "...");
        morseCodeList.put('T', "-");
        morseCodeList.put('U', "..-");
        morseCodeList.put('V', "...-");
        morseCodeList.put('W', ".--");
        morseCodeList.put('X', "-..-");
        morseCodeList.put('Y', "-.--");
        morseCodeList.put('Z', "--..");
        morseCodeList.put('a', ".-");
        morseCodeList.put('b', "-...");
        morseCodeList.put('c', "-.-.");
        morseCodeList.put('d', "-..");
        morseCodeList.put('e', ".");
        morseCodeList.put('f', "..-.");
        morseCodeList.put('g', "--.");
        morseCodeList.put('h', "....");
        morseCodeList.put('i', "..");
        morseCodeList.put('j', ".---");
        morseCodeList.put('k', "-.-");
        morseCodeList.put('l', ".-..");
        morseCodeList.put('m', "--");
        morseCodeList.put('n', "-.");
        morseCodeList.put('o', "---");
        morseCodeList.put('p', ".--.");
        morseCodeList.put('q', "--.-");
        morseCodeList.put('r', ".-.");
        morseCodeList.put('s', "...");
        morseCodeList.put('t', "-");
        morseCodeList.put('u', "..-");
        morseCodeList.put('v', "...-");
        morseCodeList.put('w', ".--");
        morseCodeList.put('x', "-..-");
        morseCodeList.put('y', "-.--");
        morseCodeList.put('z', "--..");
    }
}

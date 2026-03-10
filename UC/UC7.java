package UC;

class CharacterPatternMap {
    char character;
    String[] pattern;

    CharacterPatternMap(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    char getCharacter() {
        return character;
    }

    String[] getPattern() {
        return pattern;
    }
}

public class UC7 {

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] P = {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };

        String[] S = {
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };

        String[] SPACE = {
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        };

        CharacterPatternMap[] characterPatternMap = new CharacterPatternMap[4];
        characterPatternMap[0] = new CharacterPatternMap('O', O);
        characterPatternMap[1] = new CharacterPatternMap('P', P);
        characterPatternMap[2] = new CharacterPatternMap('S', S);
        characterPatternMap[3] = new CharacterPatternMap(' ', SPACE);

        return characterPatternMap;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (int i = 0; i < charMaps.length; i++) {
            if (charMaps[i].getCharacter() == ch) {
                return charMaps[i].getPattern();
            }
        }

        return new String[]{"     ", "     ", "     ", "     ", "     "};
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        message = message.toUpperCase();

        for (int row = 0; row < 5; row++) {

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                String[] pattern = getCharacterPattern(ch, charMaps);
                System.out.print(pattern[row] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
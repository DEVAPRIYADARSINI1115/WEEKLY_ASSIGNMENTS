public class use_case_7 {
    /**
     * Inner class to store character and its ASCII pattern
     */
    public static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    // Create and initialize character pattern mappings
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] charMaps = new CharacterPatternMap[5];

        // Letter O
        charMaps[0] = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Letter P
        charMaps[1] = new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        // Letter S
        charMaps[2] = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        // Space
        charMaps[3] = new CharacterPatternMap(' ', new String[]{
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
        });

        // Extra (optional duplicate O for safety)
        charMaps[4] = new CharacterPatternMap('o', charMaps[0].getPattern());

        return charMaps;
    }

    // Get pattern for given character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // If character not found, return space pattern
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ' ') {
                return map.getPattern();
            }
        }
        
        // Fallback - create default space pattern
        return new String[]{"   ", "   ", "   ", "   ", "   ", "   ", "   "};
    }

    // Print banner message
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        message = message.toUpperCase();

        // Each character has 7 lines
        for (int row = 0; row < 7; row++) {

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                String[] pattern = getCharacterPattern(ch, charMaps);
                System.out.print(pattern[row] + "  ");
            }

            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}

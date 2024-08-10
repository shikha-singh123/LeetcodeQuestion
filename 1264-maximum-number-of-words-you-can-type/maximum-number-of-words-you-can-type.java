class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[] = text.split(" ");
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean canBeTyped = true;
            for (int j = 0; j < brokenLetters.length(); j++) {
                if (arr[i].contains(Character.toString(brokenLetters.charAt(j)))) {
                    canBeTyped = false;
                    break;
                }
            }
            if (!canBeTyped) {
                count++;
            }
        }
        return arr.length - count;
    }
}

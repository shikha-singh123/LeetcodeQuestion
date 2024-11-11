class Solution {
    public int compress(char[] chars) {
        int ans = 0;  // Pointer to the position to write in the char array
        int i = 0;    // Start from the first character in the array
        
        while (i < chars.length) {
            char letter = chars[i];
            int count = 0;
            
            // Count the frequency of the current character
            while (i < chars.length && chars[i] == letter) {
                count++;
                i++;  // Move to the next character
            }
            
            // Write the current character to the result array
            chars[ans++] = letter;
            
            // If the character appears more than once, write the count
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[ans++] = c;
                }
            }
        }
        
        return ans;  // Return the new length of the array after compression
    }
}

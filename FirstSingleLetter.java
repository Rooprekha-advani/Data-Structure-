public class FirstSingleLetter {
    public static char firstSingleLetter(String text) {
       int n = text.length();
        
        for (int i = 0; i < n; i++) {
            boolean foundDuplicate = false;
            
            // checks if the current character is repeated
            for (int j = 0; j < n; j++) {
                if (i != j && text.charAt(i) == text.charAt(j)) {
                    foundDuplicate = true;
                    break;
                }
            }
              if (!foundDuplicate) {
                return text.charAt(i);
            }
        }
        
        return '0';  
    }

    public static void main(String[] args) {
       String text = "I love you";  
        char result = firstSingleLetter(text);
        
        if (result != '0') {
            System.out.println("First single letter: " + result);
        } else {
            System.out.println("No unique letter found.");
        }
    }
}


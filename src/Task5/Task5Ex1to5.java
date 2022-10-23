package Task5;


public class Task5Ex1to5 {
    public static void main(String[] args) {

        String text = "Бяка Lorem ipsum dolor sit amet, consectetur бяка adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia бяка deserunt mollit anim id est laborum!";
        String palindrome = "Live on time, emit no evil";
        String notPalindrome = "Live on time";
        String testString = "This is a test string";

        System.out.println("Упр 1. Самое длинное слов - " + Ex1LongestWord(text));
        System.out.println();
        System.out.println("Упр 2:");
        System.out.println(Ex2isPalindrome(palindrome));
        System.out.println(Ex2isPalindrome(notPalindrome));
        System.out.println();
        System.out.println("Упр 3:");
        System.out.println(Ex3Replace(text));
        System.out.println();
        System.out.println("Упр 4:");
        System.out.println(Ex4CountSubstring(text, "lor"));
        System.out.println();
        System.out.println("Упр 5:");
        System.out.println(Ex5Reverse(testString));

    }

    public static String Ex1LongestWord(String text) {

        int max = 0;
        String LongestWord = new String();

        String modifiedText;
        modifiedText = text.replaceAll("\\.", "");
        modifiedText = modifiedText.replaceAll(",", "");
        modifiedText = modifiedText.replaceAll("!", "");
        modifiedText = modifiedText.replaceAll("\\?", "");
        modifiedText = modifiedText.replaceAll(":", "");
        modifiedText = modifiedText.replaceAll(";", "");
        modifiedText = modifiedText.replaceAll("\"", "");
        modifiedText = modifiedText.replaceAll("\\(", "");
        modifiedText = modifiedText.replaceAll("\\)", "");

        String[] Words = modifiedText.split(" ");
        for (String word: Words) {
            if (word.length()>max) {
                max = word.length();
                LongestWord = word;
            }
        }
        return(LongestWord);
    }

    public static boolean Ex2isPalindrome(String text) {
        String modifiedText = text.replaceAll(" ","");
        modifiedText = modifiedText.toLowerCase();
        StringBuilder builder = new StringBuilder(modifiedText);
        builder.reverse();
        return(modifiedText.equals(builder.toString()));
    }

    public static String Ex3Replace(String text) {

        String modifiedText;
        modifiedText = text.replaceAll("бяка", "[вырезано цензурой]");
        modifiedText = modifiedText.replaceAll("Бяка", "[вырезано цензурой]");
        return(modifiedText);
    }

    public static int Ex4CountSubstring(String text, String subString) {
        int count = 0;
        String modifiedText = new String(text);
        while (modifiedText.matches("(.*)"+subString+"(.*)")) {
            count++;
            modifiedText = modifiedText.replaceFirst(subString, "");
        }
        return count;
    }

    public static String Ex5Reverse(String text) {
        StringBuilder builder =new StringBuilder();
        StringBuilder wordBuilder = new StringBuilder();

        String[] Words = text.split(" ");
        for (String word: Words) {
            wordBuilder.setLength(0);
            wordBuilder.append(word);
            wordBuilder.reverse();
            builder.append(wordBuilder.toString());
            builder.append(" ");
        }
        return(builder.toString().trim());
    }
}

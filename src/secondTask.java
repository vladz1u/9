import java.util.Locale;

public class secondTask {
    public static void main(String[] args) {
        String sentence = "Yoy";
        isPalindrom(sentence);
    }

    public static String reverse(String row){
        StringBuilder reversed = new StringBuilder();
        for (int i = row.length() - 1; i >= 0; i--) {
            reversed.append((row.charAt(i)));
        }
        return reversed.toString();
    }

    public static void isPalindrom(String row){
        row = row.toLowerCase();
        if (row.equals(reverse(row))){
            System.out.println("Це паліндром");
        } else
            System.out.println("Це не паліндром");
    }
}
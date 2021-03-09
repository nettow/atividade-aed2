import java.util.Scanner;

public class PalindromoIterativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        while (!text.equals("FIM")) {
            if (isPalindrome(text))
                System.out.println("SIM");
            else
                System.out.println("NAO");
            text = input.nextLine();
        }
        input.close();
    }

    private static boolean isPalindrome(String text) {
        String textFlipped = "";
        for (int i = 0; i < text.length(); i++)
            textFlipped += text.charAt(text.length() - (i + 1));
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) != textFlipped.charAt(i))
                return false;

        return true;
    }
}

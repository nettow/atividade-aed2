import java.util.Scanner;
class CiframentoDeCesarIterativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        while(!text.equals("FIM")){
            System.out.println(cryptography(text,3));
            text = input.nextLine();
        }
        input.close();
    }

    private static String cryptography(String text,int key){
        String textEncrypted = "";
        for(int i=0; i < text.length(); i++)
            textEncrypted += (char)(text.charAt(i)+key);
        return textEncrypted;
    }
}
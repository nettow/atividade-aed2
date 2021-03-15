import java.util.Scanner;
import java.util.Random;
public class AlteracaoAleatoria {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = "";
        while(!text.equals("FIM")){
            System.out.println(alteracaoAleatoria(input.nextLine()));
        }

        input.close();
    }

    private static String alteracaoAleatoria(String text){
        Random rnd = new Random();
        String textWithRandomLetters = "";
        rnd.setSeed(4);
        int rnd1 = rnd.nextInt(25) + 97;
        int rnd2 = rnd.nextInt(25) + 97;
        for(int i=0; i < text.length(); i++)
            if((int)text.charAt(i) == rnd1)
                textWithRandomLetters += (char)rnd2;
            else
                textWithRandomLetters += text.charAt(i);

        return textWithRandomLetters;
    }
}


import java.util.Random;
public class AlteracaoAleatoria {
    public static void main(String[] args){
        String text = "";
        do{
            text = MyIO.readLine();
            
            if(!text.equals("FIM"))
                MyIO.println(alteracaoAleatoria(text));
            
        }while(!text.equals("FIM"));
    }

    private static String alteracaoAleatoria(String text){
        Random rnd = new Random();
        rnd.setSeed(4);

        String textWithRandomLetters = "";
        int rnd1 = ('a' + Math.abs(rnd.nextInt()) % 26);
        int rnd2 = ('a' + Math.abs(rnd.nextInt()) % 26);

        for(int i=0; i < text.length(); i++)
            if((int)text.charAt(i) == rnd1)
                textWithRandomLetters += (char)rnd2;
            else
                textWithRandomLetters += text.charAt(i);

        return textWithRandomLetters;
    }
}

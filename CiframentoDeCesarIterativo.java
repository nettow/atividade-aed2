class CiframentoDeCesarIterativo {
    public static void main(String[] args) {
        
        String text = MyIO.readLine();
        while(!text.equals("FIM")){
            MyIO.println(cryptography(text,3));
            text = MyIO.readLine();;
        }

    }

    private static String cryptography(String text,int key){
        String textEncrypted = "";
        for(int i=0; i < text.length(); i++)
            textEncrypted += (char)(text.charAt(i)+key);
        return textEncrypted;
    }
}
import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static String currentLanguage;
    public static String newLanguage;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree<Word> bt = new BinaryTree<Word>();
        String ansn = "";
        String ansd = "";


        boolean run = true;
        while (run){
            System.out.println("Ingresse el idioma con el que esta escrito el texto\n");
            System.out.println(" - a para ingles");
            System.out.println(" - b para espanol");
            System.out.println(" - c para frances");
            ansn = sc.nextLine();
            ansn = ansn.toLowerCase();

            if(ansn.equals("a") || ansn.equals("b") || ansn.equals("c")){
                run = false;
            } else {
                System.out.println("Dato invalido.");
            }
        }


        run = true;
        while (run){
            System.out.println("A que idioma desa traducirlo?.");
            System.out.println(" - a para ingles");
            System.out.println(" - b para espanol");
            System.out.println(" - c para frances");
            ansd = sc.nextLine();
            ansd = ansd.toLowerCase();

            if(ansd.equals("a") || ansd.equals("b") || ansd.equals("c")){
                run = false;
            } else {
                System.out.println("DATO INVALIDO.");
            }
        }

        switch (ansn) {
            case "a" -> currentLanguage = "english";
            case "b" -> currentLanguage = "spanish";
            case "c" -> currentLanguage = "french";
        }
        switch (ansd) {
            case "a" -> newLanguage = "english";
            case "b" -> newLanguage = "spanish";
            case "c" -> newLanguage = "french";
        }

        try {
            File myObj = new File("C:\\Users\\Estefania\\OneDrive\\Escritorio\\Hoja 7\\palabras\\Diccionario.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] words = data.split(",");
                Word w = new Word(words[0],words[1],words[2]);
                bt.add(w);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR.");
            e.printStackTrace();
        }

        try {
            File myObj = new File("C:\\Users\\Estefania\\OneDrive\\Escritorio\\Hoja 7\\palabras\\oracion.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println("\nTexto");
                System.out.println(data);
                data=data.replace("*","");
                String[] words = data.split(" ");
                for (int i=0;i<words.length;i++){
                    if (bt.locate(new Word(words[i])) != null){
                        words[i] = bt.locate(new Word(words[i])).value.getWord(newLanguage);
                    }
                }
                data = String.join(" ",words);
                System.out.println("\nTexto traducido:");
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR.");
            e.printStackTrace();
        }


    }
}

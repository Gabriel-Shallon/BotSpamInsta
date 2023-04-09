import java.awt.AWTException;

public class botexe{

            public static void main(String[] args) {
            try {



                int delay = 2900; // intervalo entre os cliques
                int repeat = 9999; //repetições
                String text = "info"; //texto
                 //hashtag
                bot clicker = new bot(delay, repeat, text); //adiciona a hashtag antes do texto
                clicker.run(); 
            } catch (AWTException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
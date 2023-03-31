import java.awt.AWTException;

public class botexe {
    
    public static void main(String[] args) {
        try {
            int delay = 1000; // intervalo entre os cliques
            int repeat = 9999;

            ; //repetições
            String text = "MARCELO"; //texto
            bot clicker = new bot(delay, repeat, text); 
            clicker.run(); 
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }


}

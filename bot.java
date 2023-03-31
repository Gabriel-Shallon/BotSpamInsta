import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class bot {

    private Robot robot;
    private int delay; 
    private int repeat; 
    private String text; 

    public bot(int delay, int repeat, String text) throws AWTException {
        robot = new Robot();
        this.delay = delay;
        this.repeat = repeat;
        this.text = text;
    }

    public void run() throws InterruptedException {
        System.out.println("Iniciando a execução do Clicker...");
        for (int i = 0; i < repeat; i++) {
            robot.delay(delay); 
            System.out.println("Clicando no mouse...");
            robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK); 
            robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK); 
            robot.delay(delay); 
            System.out.println("Digitando o texto...");
            for (char c : text.toCharArray()) { 
                robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
                robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c)); 
                robot.delay(50); 
            }
            robot.delay(500); 
            System.out.println("Pressionando a tecla ENTER...");
            robot.keyPress(KeyEvent.VK_ENTER); 
            robot.keyRelease(KeyEvent.VK_ENTER); 
        }
        System.out.println("Execução do Clicker finalizada.");
    }

    
}

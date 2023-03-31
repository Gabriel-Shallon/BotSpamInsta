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
        
        for (int i = 0; i < repeat; i++) {
            robot.delay(delay); 
            
            robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK); 
            robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK); 
            robot.delay(delay); 
           
            for (char c : text.toCharArray()) { 
                robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
                robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c)); 
            }
            robot.delay(1); 
            
            robot.keyPress(KeyEvent.VK_ENTER); 
            robot.keyRelease(KeyEvent.VK_ENTER); 
   
        }
    }
}
        
       
        
        
        
        
        
        

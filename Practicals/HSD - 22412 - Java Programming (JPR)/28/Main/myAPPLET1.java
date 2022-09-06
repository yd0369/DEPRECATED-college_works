import java.awt.*;
import java.applet.*;

public class myAPPLET1 extends Applet{
    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(0,0,getWidth(),getHeight());
	g.drawString("Applet 1"
                ,0,(getHeight()/2));
    }
}

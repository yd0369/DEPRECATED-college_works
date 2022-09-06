import java.awt.*;
import java.applet.*;

public class myAPPLET2 extends Applet{
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(0,0,getWidth(),getHeight());
	g.drawString("Applet 2"
                ,0,(getHeight()/2));
    }
}

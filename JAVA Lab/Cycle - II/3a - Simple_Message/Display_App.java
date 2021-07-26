import java.applet.*;
import java.awt.*;
public class Display_App extends Applet{
    public void paint(Graphics g){
			setForeground(Color.blue);
			setBackground(Color.pink);
			g.drawString("Welcome to applet", 50, 60);
		}
	}

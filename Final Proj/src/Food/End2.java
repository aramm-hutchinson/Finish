package Food;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class End2 extends JFrame {
	private int xsize;
	public int ysize;
	public int x=0;
	public JFrame mywindow;
	
	private JLabel label1;
	
	public End2 (int x, int y) {
		Icon bug = new ImageIcon(getClass().getResource( "vegcheese.jpg"));
		label1 = new JLabel("TACO", bug, SwingConstants.LEFT);

		mywindow = new JFrame();
		xsize = x;
		ysize = y;
		add(label1);
		mywindow.add(label1);
	}
	
	public void mydrawJFrame (String passedTitle, int x, int y) {
		System.out.println(x);
		this.x =x+10;
		mywindow.setSize(xsize, this.ysize);
		mywindow.setLocation(drive.x,this.x);
		mywindow.setTitle(passedTitle);
		mywindow.setAlwaysOnTop(true);

		mywindow.setVisible(true);
		return;
	}	
	public void setmyJFrameTitle ( String passedTitle) {
		mywindow.setTitle(passedTitle);
		return;
	}
	public void closeit(JFrame mywindow){
		mywindow.dispose();
		return;
		}
	
}

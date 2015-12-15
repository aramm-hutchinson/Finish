package Food;

import javax.swing.*;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class End extends JFrame  {
	private int xsize;
	public int ysize;
	public int x=0;
	public JFrame mywindow;
	
	private JLabel label2;
	
	public End (int x, int y) {
		Icon bug = new ImageIcon(getClass().getResource( "download.jpg"));
		label2 = new JLabel("BURRITO", bug, SwingConstants.LEFT);

		mywindow = new JFrame();
		xsize = x;
		ysize = y;
		add(label2);
		mywindow.add(label2);
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

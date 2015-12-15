package Food;

import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.security.*;



public class drive {
	
	public static int x=100;
	
	public static String[] meat = new String[2];
	
	
	public static void main(String[] args)
	{

	meat[0] = "Beef";
	meat[1] = "Chicken";

	String food =
			JOptionPane.showInputDialog("Welcome to food place. Would you like a burrito(1), or a taco(2)?");
	int boop = Integer.parseInt(food); //the order number
	
	String meats =
			JOptionPane.showInputDialog("Welcome to food place. Would you like Beef(1), Chicken(2), or no meat(3)?");
	int eats = Integer.parseInt(meats); //the meat number
	
	if (boop == 1){
		
		if (eats == 1)
		{
			JOptionPane.showMessageDialog(null, "Order up!", "cool", JOptionPane.PLAIN_MESSAGE); //https://www.youtube.com/watch?v=8eYVPw9r_Vw
			Team1 tee=new Team1(meat[0], "Soft", "Lettuce", "Cheddar");
			tee.ingredients1();
			tee.extraIngredients();
	
			End mainJFrame;
			mainJFrame = new End (300,300);
	
			String mytitle;
			mytitle = "Burrito!!!";
	
			x=100;
			int y=100;

			y=y+100;
			mainJFrame.mydrawJFrame(mytitle, x, y);
			try {Thread.sleep(100);} catch (Exception e){}
		
			Scanner scan = new Scanner(System.in);
		
			File outFile = new File("order.txt"); //help from Cordell?
			FileOutputStream outFileStream;
		
			try 
			{
			
				outFileStream = new FileOutputStream(outFile);
				PrintWriter outStream = new PrintWriter(outFileStream);
			
				System.out.println("Can I get a name for that?");
				String name = scan.next();
				outStream.println(name+ " want's a Burrito");
				
				outStream.close();
				scan.close();
			
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
		}
		else if (eats == 2)
		{
			JOptionPane.showMessageDialog(null, "Order up!", "cool", JOptionPane.PLAIN_MESSAGE);
			Team1 tee=new Team1(meat[1], "Soft", "Lettuce", "Cheddar");
			tee.ingredients1();
			tee.extraIngredients();
	
			End mainJFrame;
			mainJFrame = new End (300,300);
	
			String mytitle;
			mytitle = "Burrito!!!";
			
			x=100;
			int y=100;

			y=y+100;
			mainJFrame.mydrawJFrame(mytitle, x, y);
			try {Thread.sleep(100);} catch (Exception e){}
		
			Scanner scan = new Scanner(System.in);
		
			File outFile = new File("order.txt"); //help from Cordell?
			FileOutputStream outFileStream;
		
			try 
			{
				
				outFileStream = new FileOutputStream(outFile);
				PrintWriter outStream = new PrintWriter(outFileStream);
			
				System.out.println("Can I get a name for that?");
				String name = scan.next();
				outStream.println(name+ " want's a Burrito");
			
			
				outStream.close();
				scan.close();
			
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
		}
		else if (eats == 3)
		{
			JOptionPane.showMessageDialog(null, "Go Away", "Not Cool", JOptionPane.PLAIN_MESSAGE);
		}
	}
	else if (boop == 2)
	{
		if (eats == 1)
		{
			JOptionPane.showMessageDialog(null, "Order up!", "cool", JOptionPane.PLAIN_MESSAGE);
			Team2 twe=new Team2(meat[0], "Soft", "Lettuce", "Cheddar");
			twe.ingredients1();
			twe.extraIngredients();
	
			End2 mainJFrame;
			mainJFrame = new End2 (300,300);
	
			String mytitle;
			mytitle = "Taco!!!";
	
			x=100;
			int y=100;

			y=y+100;
			mainJFrame.mydrawJFrame(mytitle, x, y);
			try {Thread.sleep(100);} catch (Exception e){}
	
			Scanner scan = new Scanner(System.in);
		
			File outFile = new File("order.txt");
			FileOutputStream outFileStream;
		
			try 
			{
			
				outFileStream = new FileOutputStream(outFile);
				PrintWriter outStream = new PrintWriter(outFileStream);
			
				System.out.println("Can I get a name for that?");
				String name = scan.next();
				outStream.println(name+ " want's a Taco");
			
			
				outStream.close();
				scan.close();
			
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
		}
		if (eats == 2)
		{
			JOptionPane.showMessageDialog(null, "Order up!", "cool", JOptionPane.PLAIN_MESSAGE);
			Team2 twe=new Team2(meat[1], "Soft", "Lettuce", "Cheddar");
			twe.ingredients1();
			twe.extraIngredients();
	
			End2 mainJFrame;
			mainJFrame = new End2 (300,300);
	
			String mytitle;
			mytitle = "Taco!!!";
	
			x=100;
			int y=100;

			y=y+100;
			mainJFrame.mydrawJFrame(mytitle, x, y);
			try {Thread.sleep(100);} catch (Exception e){}
	
			Scanner scan = new Scanner(System.in);
		
			File outFile = new File("order.txt");
			FileOutputStream outFileStream;
		
			try 
			{
			
				outFileStream = new FileOutputStream(outFile);
				PrintWriter outStream = new PrintWriter(outFileStream);
			
				System.out.println("Can I get a name for that?");
				String name = scan.next();
				outStream.println(name+ " want's a Taco");
			
			
				outStream.close();
				scan.close();
			
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
		}
		else if (eats == 3)
		{
			JOptionPane.showMessageDialog(null, "Go Away", "Not Cool", JOptionPane.PLAIN_MESSAGE);
		}
	}
	

	}
	
}

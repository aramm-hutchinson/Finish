package Food;

import java.util.*;

public class Team2 extends Over {


    public static Scanner myscan = new Scanner(System.in);
    public String veggies;
    public String cheese;

 
    public Team2(String theMeat, 
    				String theShell, 
    				String theVeggies, 
    				String theCheese) {
        super(theMeat, theShell);
        veggies = theVeggies;
        cheese = theCheese;
    }   
        
   
    public void setVeggies(String newValue) {
    	veggies = newValue;
//      System.out.println("Would you like veggies");
 //     veggies = myscan.next();
 //     return;
    }   
    public void setCheese(String newValue) {
        cheese = newValue;
    }  
	public void extraIngredients(){
		System.out.println("veggies " + veggies);
		System.out.println("cheese:"+cheese);
	}
}

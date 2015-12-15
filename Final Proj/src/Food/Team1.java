package Food;

import java.util.*;

public class Team1 extends Over {


    public static Scanner myscan = new Scanner(System.in);
    public String veggies;
    public String cheese;

 
    public Team1(String theMeat, 
    				String theShell, 
    				String theVeggies, 
    				String theCheese) {
        super(theMeat, theShell);
        veggies = theVeggies;
        cheese = theCheese;
    }   
        
   
    public String getVeggies() {
    	return veggies;
    }   
    
    public void setVeggies(String youVeggies){
    	veggies = youVeggies;
    }
    
    public void setCheese(String newValue) {
        cheese = newValue;
    }  
	public void extraIngredients(){
		System.out.println("veggies " + veggies);
		System.out.println("cheese:"+cheese);
	}
	
}

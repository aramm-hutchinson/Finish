package Food;

//import java.util.Scanner;

public class Over {


  public String meat;
  public String shell;
  public Over(String theMeat, String theShell) {
      meat = theMeat;
      shell = theShell;
  }
  
  
  
  public void setMeat(String newValue) {
      meat = newValue;

//		Scanner meat = new Scanner(System.in);
//		System.out.println("What kind of meat?");
//		String input = meat.nextLine();
  }
      
  public void setShell(String newValue) {
      shell = newValue;
  }	
  
  public void ingredients1(){
  	System.out.println("meat:"+meat);
  	System.out.println("shell:"+shell);
  }
  
}

package studio7;

public class Die {

private int dieSides;//CONSTRUCTOR


	Die(int n){
		
		dieSides = n;	
		
	}
	
	public int getNumber() { //METHOD
	
		return ((int)Math.random()*dieSides)+1;
	}

	
	
	
	
}

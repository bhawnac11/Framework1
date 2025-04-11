package inheritance;

public class ConstructorOverloading {
	
	int x=12;
	int y=13;
	String name="Bhawna";

	public static void main(String[] args) {
		
		ConstructorOverloading cons=new ConstructorOverloading(13,16);
		ConstructorOverloading cons1=new ConstructorOverloading("yogesh");
		System.out.println(cons.x);
		System.out.println(cons1.name);
		System.out.println(cons.y);
		

		
	    
	

	}
	
	ConstructorOverloading(int x , int y){
		this.x=x;
		this.y=y;
	}
	
	ConstructorOverloading(String name){
		this.name=name;
	}

}

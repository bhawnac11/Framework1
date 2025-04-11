package inheritance;

public class Mammel extends Animal{
	
	void cry() {
		System.out.println("mammel is crying");
	}
	
	public static void main(String[]args) {
		
		Mammel m=new Mammel();
		m.bark();
	
		m.cry();
		
		System.out.println(m.y);
	
		System.out.println(m.name);
		
		Mammel.cat();
	
	}

}

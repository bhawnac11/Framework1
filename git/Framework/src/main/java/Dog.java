
public class Dog extends Animal {
	
	int y=12;
	static void cat(){
		System.out.println("cat crying");
	}
	public static void main(String[]args) {
		
		Dog d=new Dog();
		
		Dog.cat();
		Dog.dog();
		System.out.println(d.x);
		System.out.println(d.y);
	}
	

}

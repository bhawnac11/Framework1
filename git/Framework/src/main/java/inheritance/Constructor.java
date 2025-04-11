package inheritance;

public class Constructor {

	public static void main(String[] args) {
	
Data d=new Data(3,5);
Data d1=new Data(3,"bhawna");
Data d2=new Data("yogesh");

System.out.println(d.x + "," + d.y);
System.out.println(d1.x + ","+ d.name);
System.out.println(d2.name);
	}

}

class Data{
	int x=12;
	int y=13;
	String name="bhawna";
	int age=18;
	
	Data(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	Data(int x, String name){
		this.x=x;
		this.name=name;
	}
	Data( String name){

		this.name=name;
	}
	
	Data(String name, int x){
		this.x=x;
		this.name=name;
	}
}
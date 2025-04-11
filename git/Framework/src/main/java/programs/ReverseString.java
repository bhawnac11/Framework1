package programs;

class ReverseString{
public static void main(String[]args){

String name="Bhawna";

String rev="";
char[]ch=name.toCharArray();

for(int i=name.length()-1;i>=0;i--){

rev=rev+name.charAt(i);
}
System.out.println(rev);

if(rev.equals(name)){
System.out.println("palindrome");}
else{System.out.println("not palindrome");}
}


}
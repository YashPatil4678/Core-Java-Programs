import java.util.Scanner;
class StringConcatenation{
	public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter First String:");
	String str1= sc.nextLine();
	System.out.print("Enter Second String:");
	String str2= sc.nextLine();
	String result = str1 + str2;
	System.out.print("Concatenated String:"+result);

	}

}
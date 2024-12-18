import java.util.Scanner;
class CharCategory{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any character:");
	char ch = sc.next().charAt(0);
	if(ch>='A' && ch<='B'){
		System.out.println("Capital letters");
	}
	else if(ch>='a' && ch<='b'){
		System.out.println("Small Case letters");
	}
	else if(ch>='0' && ch<='9'){
		System.out.println("Number");
	}
	else{
		System.out.println("Special Character");
	
		}
	}
}
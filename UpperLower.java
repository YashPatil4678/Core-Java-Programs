import java.util.Scanner;
class UpperLower{
	public static void main(String [] args){
	char ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Character :");
	ch = sc.next().char();
	if(ch>='a' && ch<='z'){
			System.out.println("Not a Alphabet");
		}
	else{
		System.out.println("Alphabet");
		}
	
	}
}
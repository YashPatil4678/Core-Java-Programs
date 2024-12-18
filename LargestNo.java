import java.util.Scanner;
class LargestNo{
	public static void main(String [] args){
	int a, b, c;
	Scanner sc = new Scanner(System.in);
	System.out.println("a = ");
	a = sc.nextInt();
	System.out.println("b = ");
	b = sc.nextInt();
	System.out.println("c = ");
	c = sc.nextInt();
	if(a>=b && a>=c){
		System.out.println("a is the largest No.");
	}
	else if(b>=c){
		System.out.println("b is the largest No.");
	}
	else
	{
		System.out.println("c is the largest No.");
	}

	}
}
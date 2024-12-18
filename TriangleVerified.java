import java.util.Scanner;
class TriangleVerified{
	public static void main(String [] args){
	int a, b, c;
	Scanner sc = new Scanner(System.in);
	System.out.println("First angle of Tri. = ");
	a = sc.nextInt();
	System.out.println("Second angle of Tri. = " );
	b = sc.nextInt();
	System.out.println("Third angle of Tri. = " );
	c = sc.nextInt();
	if(a + b + c == 180){
		System.out.println("Triangle");
	}
	else{
		System.out.println("Not Triangle");
	    }
	
	
	}
}
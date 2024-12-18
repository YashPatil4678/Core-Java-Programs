import java.util.Scanner;
class Calculator{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int ch;
	int num1,num2;
	System.out.println("Enter First No:");
	num1 = sc.nextInt();
	System.out.println("Enter Second No:");
	num2 = sc.nextInt();


	do{
		System.out.println("1. Addition ");
		System.out.println("2. Multiplication ");
		System.out.println("3. Subtraction ");
		//System.out.println("4. Division ");
		//System.out.println("5. Remainder ");
		System.out.println("4. Exit");
		ch= sc.nextInt();
		
		switch(ch) {

			
			case 1:
				int Addition = num1 + num2;
				System.out.println("Addition of Numbers = " +Addition);
				break;
			case 2:	
				int Multiplication = num1 * num2;
				System.out.println("Multiplication of Numbers = " +Multiplication);
				break;
			case 3:
				int Subtraction = num1 - num2;
				System.out.println("Subtraction of Numbers = " +Subtraction);
				break;
		
			}

		}while (ch != 4);
			System.out.println("Exit");
	}
}
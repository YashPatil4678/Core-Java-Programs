import java.util.Scanner;
class IncomeTax{
	public static void main(String [] args){
	int income,tax;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Income = ");
	income = sc.nextInt();
	if(income<500000){
		tax = 0;
	}
	else if(income>=500000 && income<100000){
		tax = (int) (income * 0.2);
	}
	else{
		tax = (int) (income * 0.3);
		}
	System.out.println("Your Tax : " +tax);
	}
}
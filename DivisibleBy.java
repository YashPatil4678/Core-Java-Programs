import java.util.Scanner;
class DivisibleBy{
	public static void main(String [] args){
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number : ");
	num = sc.nextInt();
	if(num % 5 == 0 && num % 11 == 0){
		System.out.println("No. Divisible by 5 & 11");
		}
		else{
		System.out.println("Not Divisible by 5 & 11");
		}
	
	}
}
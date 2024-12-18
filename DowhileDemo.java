import java.util.Scanner;
class DowhileDemo{
	public static void main(String [] args){
	int sum = 0;
	char ch;
	int no;
	Scanner sc = new Scanner(System.in);
	do{
		System.out.println("Enter any no:");
		no = sc.nextInt();
		sum = sum + no;
		System.out.println("You want to add another no: y/n");
		ch = sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.println("Sum of all Entered No: " +sum);
	}
}
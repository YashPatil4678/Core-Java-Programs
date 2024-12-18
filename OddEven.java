import java.util.Scanner;
class OddEven{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int no;
	System.out.println("Enter no: ");
	no = sc.nextInt();
	if(no%2==0){
		System.out.println("No is Even");
	}else
		{
		System.out.println("No is Odd");
	}
	
	} 

}
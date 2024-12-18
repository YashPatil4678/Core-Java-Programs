import java.util.Scanner;
class SolutionTemp{
	public static void main(String [] args){
	double temp;
	Scanner sc =  new Scanner(System.in);
	System.out.println("Write Temperature of Body=");
	temp = sc.nextDouble();
	if(temp > 100){
		System.out.println("You have fever");
		}
	else{
		System.out.println("You don't have fever");
		}

	}
}
 
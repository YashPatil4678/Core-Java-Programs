import java.util.Scanner;
class ArraySum{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);

	int [] a = new int[10];
	int sum = 0;
	System.out.println("Enter Array Elements:");
	
	for(int i=0;i<a.length;i++){
		a[i]= sc.nextInt();
		sum = sum+a[i];
		}
	System.out.println("Sum of all Nos: "+sum);

	}

}
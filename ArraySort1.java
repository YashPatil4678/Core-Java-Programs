import java.util.Scanner;
import java.util.Arrays;
class ArraySort1{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int [] a = new int[10];
	System.out.println("Enter Elements of an Array:");

	for(int i=0; i<a.length; i++){
	a[i]= sc.nextInt();
		}
	Arrays.sort(a);
	System.out.println("Sorted Array: "+Arrays.toString(a));
	
	}

}
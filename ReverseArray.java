import java.util.Scanner;
class ReverseArray{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int [] a = new int[10];
	
	System.out.println("Enter 10 Elements of the array: ");
	for(int i =0; i<a.length;i++){
		a[i] = sc.nextInt();
		}
	System.out.println("Array in Reverse Order:");
	for(int i = a.length - 1; i>=0 ;i--){
		System.out.println(a[i] + " ");
		}

	}
}
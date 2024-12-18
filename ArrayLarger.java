import java.util.Scanner;
class ArrayLarger{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int [] a = new int[10];
	System.out.println("Enter Array Elements:");
	
	for(int i=0; i<10; i++){
		a[i]= sc.nextInt();
		}		
	int largest = a[0];
	for(int i =1; i<a.length; i++){
		if(a[i] > largest){
		largest = a[i];
		}
	}
	System.out.println("The largest No. is : "+largest);

	}

}
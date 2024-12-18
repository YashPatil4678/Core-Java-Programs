import java.util.Scanner;
class ArraySort{
public void bubblesort(int[] a){
	int temp;
	for(int i=0;i<10;i++){
		for(int j=0;j<9-i;j++){
					if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					}
			}
		}
	}
	public void printArray(int []a){
					for(int i=0;i<10;i++){
					System.out.println(a[i]+" ");
					}
			}
	public static void main(String [] args){
	ArraySort as = new ArraySort();
	Scanner sc = new Scanner(System.in);
	int [] a = new int[10];
	System.out.println("Enter any 10 elements");
	for(int i=0;i<10;i++){
		a[i]=sc.nextInt();
		}
		System.out.println("Array:");
		as.printArray(a);
		as.bubblesort(a);
		System.out.println("\nArray After Sorting :");
		as.printArray(a);
	}

}
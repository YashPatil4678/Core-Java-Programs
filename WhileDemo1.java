import java.util.Scanner;
class WhileDemo1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter number =");
		a = sc.nextInt();
		System.out.println("Enter number =");
		b = sc.nextInt();
		if(a > b){
			while(a >= b){
				if (a%2==0){
					System.out.println(a);
				}
				a = a - 1;
			}

		}
		else{
			while(a <= b){
				if (a%2==0){
					System.out.println(a);
				}
				a = a + 1;
			}
		}

	}

}
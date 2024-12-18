import java.util.Scanner;
class ProfitLoss{
	public static void main(String [] args){
	int sp,cp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Selling Price = " );
	sp = sc.nextInt();
	System.out.println("Cost Price = " );
	cp = sc.nextInt();
	if(sp>cp){
		System.out.println("Profit");
	}
	else{
		System.out.println("Loss");
	    }
	
	}
}
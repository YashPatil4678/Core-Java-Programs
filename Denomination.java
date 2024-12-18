class Denomination{
	public static void main(String [] args){
	int amt = 3578;
	int n = amt / 1000;
	System.out.println("1000 x " +n);
	amt = amt % 1000;
	n = amt / 500;
	System.out.println("500 x " +n);
	amt = amt % 500;
	n = amt / 200;
	System.out.println("200 x " +n);
	amt = amt % 200;
	n = amt / 100;
	System.out.println("100 x " +n);
	amt = amt % 100;
	n = amt / 50;
	System.out.println("50 x " +n);
	amt = amt % 50;
	n = amt / 20;
	System.out.println("20 x " +n);
	amt = amt % 20;
	n = amt / 10;
	System.out.println("10 x " +n);
	amt = amt % 10;
	n = amt / 5;
	System.out.println("5 x " +n);
	amt = amt % 5;
	n = amt / 2;
	System.out.println("2 x " +n);
	amt = amt % 2;
	n = amt / 1;
	System.out.println("1 x " +n);
	amt = amt % 1;
	

	}
}

	
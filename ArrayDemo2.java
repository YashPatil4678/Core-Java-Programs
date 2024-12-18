class ArrayDemo2{
	public static void main(String [] args){
	int [] a = {10,20,30,40,50};
	int sum = 0;
	int i;
	System.out.println("Array Length: " +a.length);
	for(i=0;i<a.length;i++){
		System.out.println(a[i]);
		sum = sum+a[i];
	}
	
	System.out.println("Sum of all Nos: "+sum);

	}

}
class ArraytoSingleNum{
	public static void main(String [] args){
	int a [] ={8, 6, 2, 4, 5};
	int num = 0;

	for(int i=0;i<a.length;i++){
	num = num*10+a[i];
	}
	System.out.println(num);

	}
}
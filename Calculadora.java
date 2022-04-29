class Calculadora{
	public static void main(String [] args){
		int a, b;
		a = 20;
		b = 10;
		System.out.println("La suma de : " + a + " + " + b + " = " + add(a,b));
	}
	public static int add(int a, int b){return a+b;}
	public static int sub(int a, int b){return 0;}
	int mul(int a, int b){return 0;}
	int div(int a, int b){return 0;}
	int mod(int a, int b){return 0;}
}

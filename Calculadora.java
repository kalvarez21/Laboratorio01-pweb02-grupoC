class Calculadora{
	public static void main(String [] args){
		int a, b;
		a = 20;
		b = 10;
		System.out.println("La suma de : " + a + " + " + b + " = " + add(a,b));
		System.out.println("La resta de : " + a + " - " + b + " = " + sub(a,b));
		int x, y;
		x = 15;
		y = 3;
		System.out.println("El producto de: "+ x +" * " + y +" = " + mul(x,y));
		System.out.println("El cociente de: "+ x +" / " + y +" = " + div(x,y));
		System.out.println("El modulo de: "+ x +" mod " + y +" = " + mod(x,y));

	}
	public static int add(int a, int b){return a+b;}
	public static int sub(int a, int b){return a-b;}
	public static int mul(int a, int b){return a*b;}
	public static int div(int a, int b){return a/b;}
	public static int mod(int a, int b){return a%b;}
}

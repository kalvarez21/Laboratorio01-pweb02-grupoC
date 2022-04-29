class Calculadora{
	public static void main(String [] args){
		int x, y;
		x = 15;
		y = 3;
		System.out.println("El producto de: "+ x +" * " + y +" = " + mul(x,y));
	}
	int add(int a, int b){return 0;}
	int sub(int a, int b){return 0;}
	public static int mul(int a, int b){return a*b;}
	int div(int a, int b){return 0;}
	int mod(int a, int b){return 0;}
}

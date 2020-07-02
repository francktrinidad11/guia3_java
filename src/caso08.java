import java.util.Scanner;

public class caso08 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese numero: ");
		int num=sc.nextInt();
		System.out.println("Tabla de multiplicar del "+num);
		System.out.println("=========================");
		for(int i=1; i <=15; i++) {
			
			System.out.println(num+" x "+ i+ " = "+ (num*i));
		}
			
	}

}

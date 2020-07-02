import java.util.Scanner;
public class caso03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int c=1, factorial =1;
		
		System.out.print("Ingrese numero: ");
		int num=sc.nextInt();
		
		while(c <= num) {
			
			factorial=factorial*c;
			c++;
		}
		
		System.out.println("El factorial de "+num+" es: "+factorial);
		

	}

}

import java.util.Scanner;
public class caso02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int c=1, suma=0;
		
		System.out.print("Ingrese numero: ");
		int num=sc.nextInt();
		
		while(c <= num) {
			
			suma+=c; //suma=suma+c
			c++;
		}
		
		System.out.println("La sumatoria es: "+suma);
	}

}

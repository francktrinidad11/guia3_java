import java.util.Scanner;
public class caso07 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Ingrese Nombre: ");
		String nom=sc.nextLine();
		
		for(int i=1;i <=10 ; i++)
			System.out.println(i+" Bienvenido "+nom+" al curso.");

	}

}

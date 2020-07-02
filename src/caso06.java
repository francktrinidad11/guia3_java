import java.util.Scanner;
public class caso06 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int c=0,aptos=0,edad=0;
		String rpta="S",nombre="",estado="";
		
		while(rpta.equals("S") || rpta.equals("s")) {
			
			c++;
			System.out.println("Datos del Registro "+c);
			System.out.println("===================");
			
			System.out.print("Ingrese nombre: ");
			nombre=sc.nextLine();
			System.out.print("Ingrese edad: ");
			edad=sc.nextInt();
			
			if(edad>=18) {
				estado="Apto para votar";
				aptos++;
			}
			else
				estado="Menor de edad";
			//reiniciar lectura
			
			sc.nextLine();
			
			System.out.print("¿Desea continuar? [S/N]: ");
			rpta=sc.nextLine();
			}
		
		System.out.println("Resumen");
		System.out.println("========");
		System.out.println("Numero de participante....:" + c);
		System.out.println("Numero de aptos para votar:"+aptos);
	}
}
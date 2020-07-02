import java.util.Scanner;
public class caso05 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int c=1, num=0 , num_menor=10000000;
		
		while (c <= 4) {
			
			System.out.print("Ingrese numero "+ c+": ");
			num=sc.nextInt();
			
			if(num<num_menor)
				num_menor=num;
			c++;
			
		}
		
		System.out.println("El numero menor es: "+num_menor);
	}

}

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso09 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		
		
		float prom=0,porasist=0,may_prom=0,min_prom=1000000;
		int not1=0,not2=0,not3=0,numa=0,c=0,Cs=0,Sc=0,m=1;
		String nom="",rpta="S",estado="";
		
		while(rpta.equals("S") || rpta.equals("s")) {
			c++;
			System.out.println("===================");
			System.out.println("Datos del Registro "+c);
			System.out.println("==========asd=========");
			
			System.out.print("Mombre del alumno: ");
			nom=sc.nextLine();
			System.out.print("Nota1: ");
			not1=sc.nextInt();
			System.out.print("Nota2: ");
			not2=sc.nextInt();
			System.out.print("Nota3: ");
			not3=sc.nextInt();
			System.out.print("Asistencia [1-12]: ");
			numa=sc.nextInt();
			
			prom=not1*0.2f+not2*0.3f+not3*0.5f;
			porasist=numa*100/12;
			
			if(prom>13 && porasist>=70) {
				estado="Obtiene Certificado";
				Cs++;
			}
			else 
				estado="Sin Certificado";
				
			if(prom>may_prom) {
				
				may_prom=prom;
				m++;
			}	
			else
				min_prom=prom;
				
			System.out.println("Promedio: "+df.format(prom));
			System.out.println("Porcentaje de asistencia: "+porasist+"%");
			System.out.println("Estado: "+estado);
			
			sc.nextLine();
			System.out.print("¿Desea continuar? [S/N]: ");
			rpta=sc.nextLine();	
			
		}
		
		System.out.println("Resumen");
		System.out.println("========");
		System.out.println("Numero de alumnos....:" + c);
		System.out.println("Mayor promedio: "+ may_prom);
		System.out.println("Menor promedio: "+ min_prom);
		System.out.println("Numero de alumnos certificados: "+Cs);
		
		
			
		
			
	}

}
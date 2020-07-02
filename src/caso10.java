import java.text.DecimalFormat;
import java.util.Scanner;

public class caso10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		

		float tp=0,sueb=0,bon=0,desc=0,sn=0,poralc=0,may_suel=0,min_suel=1000000;
		int ht=0,min=0,c=0,m=1,cp=0;
		String nom="",rpta="S";
		
		while(rpta.equals("S") || rpta.equals("s")) {
			c++;
			System.out.println("===================");
			System.out.println("Datos del Registro "+c);
			System.out.println("===================");
			
			System.out.print("Empleado: ");
			nom=sc.nextLine();
			System.out.print("Horas trabajadas: ");
			ht=sc.nextInt();
			System.out.print("Tarifa por horas: ");
			tp=sc.nextFloat();
			System.out.print("Minutos de tardanza: ");
			min=sc.nextInt();
			//sueldo bruto
			sueb=ht*tp;
			//bonificacion
			if(ht<=50)
				bon=0;
			else if(ht>50 && ht<=60)
				bon=sueb*0.02f;
			else if(ht>60 && ht<=70)
				bon=sueb*0.08f;
			else if(ht>70 && ht<=80)
				bon=sueb*0.13f;
			else
				bon=sueb*0.15f;
			
			//descuento
			
			if(min<15)
				desc=0;
			else if(min>15 && min<=30)
				desc=sueb*0.03f*(min);
			else 
				desc=sueb*0.05f*(min);
			
			
			//sueldo neto
			
			sn=sueb+bon-desc;
			if(sn>may_suel) {
				
				may_suel=sn;
				m++;
			}	
			else
				min_suel=sn;
			
			//%alcanzado
			
			poralc=(ht*100)/80;
			
			if (poralc>90)
				cp++;
			
			
			System.out.println("Resultados");
			System.out.println("============");
			System.out.println("Sueldo bruto: "+sueb);
			System.out.println("Bonificacion: "+bon);
			System.out.println("Descuento: "+desc);
			System.out.println("Sueldo Neto: "+sn);
			System.out.println("% Alcanzado: "+df.format(poralc)+"%");
			
			
			sc.nextLine();
			System.out.print("¿Desea continuar? [S/N]: ");
			rpta=sc.nextLine();

		}
		
		
		System.out.println("Resumen");
		System.out.println("========");
		System.out.println("Numero de empleados: " + c);
		System.out.println("Sueldo neto Mayor: "+ may_suel);
		System.out.println("Sueldo neto Menor: "+ min_suel);
		System.out.println("Cantidad de empleados con mas del 90% de la meta: "+cp);
		
	}

	
	
}
package cuenta.de.ahorros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ERIKA
 */
public class CuentaDeAhorros {

    public static void main(String[] args) {


        int salario = 0;
        int gastos = 0;
        int cuotam = 0;
        double interes = 1.1;
        double total1;
        double total2=0;
        int mes;

        ArrayList<String> meses = new ArrayList<String>();


        Scanner vmes = new Scanner(System.in);
        System.out.println("Por favor digite el mes (Con un rango entre 1 y 12)");
        mes=vmes.nextInt();
        
      
            for(int i=1;i<=mes;i++){

            Scanner entrada1 = new Scanner(System.in);                    //guarde la variable salario tipo int en entrada1    
            System.out.println("Ingrese el valor del salario del mes: " + i);
            salario = entrada1.nextInt();

            Scanner entrada2 = new Scanner(System.in);                    //guarde la variable gastos tipo int en entrada2    
            System.out.println("Ingrese el valor de los gastos" + i);
            gastos = entrada2.nextInt();

            Scanner entrada3 = new Scanner(System.in);                    //guarde la variable cuotam tipo int en entrada3    
            System.out.println("Ingrese el valor de la cuota de manejo" + i);
            cuotam = entrada3.nextInt();

            while (salario != -1) {

                total1 = ((salario - gastos - cuotam) * interes);
                System.out.println("El resultado para el mes es:  " + total1+i);//-cuotam*interes;
                total2=total1+total2;
                
                break;                                              // elimina el buble infinito
            }
        }
        System.out.println("El resultado para el mes es:  " + total2);//-cuotam*interes;
    }
}

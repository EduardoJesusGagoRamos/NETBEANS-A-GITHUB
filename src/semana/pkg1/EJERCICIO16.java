/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana.pkg1;
import java.util.Scanner;
/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Programa que solicita ingresar un número favorito por teclado y luego el computador debe mostrar el mensaje “Tu numero favorito es <numero ingresado>”.
        
        System.out.print("INGRESE SU NUMERO FAVORITO: ");
        Scanner numf = new Scanner(System.in);
        int num = numf.nextInt();
        System.out.println("TU NUMERO FAVORITO ES " +num);
    }
    
}

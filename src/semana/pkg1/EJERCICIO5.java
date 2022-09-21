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
public class EJERCICIO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Realizar un programa que calcule el perímetro y area de las siguientes figuras geométricas: 
        
        int a;
  
        System.out.print("Ingresa el lado: ");
        Scanner numa = new Scanner(System.in);
        a = numa.nextInt();
        int per = 4 * a;
        System.out.println("El perimetro del cuadrado es: " + per);
        int are = a * a;
        System.out.println("El area del cuadrado es: " + are);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana.pkg1;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Calcular la suma de las áreas de 3 círculos cuyos radios son 8.9, 6.7 y 7.9
        
        double pi = 3.14159265;
        double r1 = 8.9;
        double r2 = 6.7;
        double r3 = 7.9;
        
        double are = (pi * r1 * r1) + (pi * r2 * r2) + (pi * r3 * r3);
        System.out.println("La suma de las areas de 3 circulos es: " + are);
    }
}

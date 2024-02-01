/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {
        
        SopaLetras s1 = new SopaLetras(8);
        
        s1.mostrarMatriz();
        System.out.println("-------------------------------");
        
        String palabra = "HOLAS";
        s1.colocarPalabraHorizontal(2, 3, palabra);
        
        s1.mostrarMatriz();
        System.out.println("-------------------------------");
        s1.colocarPalabraHorizontalInvertida(2, 3, palabra);
        s1.mostrarMatriz();
    }
}

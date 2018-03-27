package aula01;

import java.util.Scanner;

/**
 *
 * @author 201711140010
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        int numero = scan.nextInt();
        
        if (numero > 30){
        System.out.println("Tá velho");
        } else {
            if(numero <15){
            
                System.out.println("Tá novo");
                
            }
            
        }
    }
}

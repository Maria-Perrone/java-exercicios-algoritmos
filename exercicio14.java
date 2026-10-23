
package excercicios;
import java.util.Scanner;
/**
 *
 * @author Maria Perrone
 */
public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Informe o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.println("Informe o segundo: ");
        int n2 = sc.nextInt();
        
        //calculos
        System.out.println("A soma deles é: "+(n1+n2));
        System.out.println("A subtração do primeiro número pelo segundo: " +(n1-n2));  
        System.out.println("A multiplicação dos dois números: " + (n1*n2));
        System.out.println("A divisão do primeiro número pelo segundo: "+(n1/n2));
    }
}

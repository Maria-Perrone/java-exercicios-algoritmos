
package excercicios;
import java.util.Scanner;
/**
 *
 * @author Maria Perrone
 */
public class exercicio28 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Escolha o valor a ser calculado: ");
        int numero = sc.nextInt();
        int alg = 0;
          do{
        int resultado = numero*alg;
        System.out.println("resultado "+alg +"x" +numero +"="+resultado);
        alg++;
        } while (alg <= 10); {
        System.out.println("Fim da aplicação");
    }
        }
    }
    

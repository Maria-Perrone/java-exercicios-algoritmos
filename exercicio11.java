
package excercicios;
import java.util.Scanner;
/**
 *
 * @author Maria Perrone
 */
public class exercicio11 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.println("Digite o valor em reais: ");
        float reais = sc.nextFloat();
        //dados
        float dolar = 5;
        float euro = 6;
        
        System.out.println("O valor de R$" +reais
                + " Em dolar é de "+reais*dolar
                + " E em euro é de : "+reais*euro);             
    }
 
}

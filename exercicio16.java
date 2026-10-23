
package excercicios;
import java.util.Scanner;

/**
 *
 * @author Maria Perrone
 */

public class exercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.println("Informe o valor da compra: ");
        double valCompra = sc.nextDouble();
    if (valCompra >150){
        System.out.println(" Desconto aplicado! ");
        double desconto = valCompra /1.15;
        System.out.printf("Sua compra com o desconto aplicado ficou: "
                + (valCompra-desconto));    
    }else
        System.out.println("Sem desconto");
    }
    }
    

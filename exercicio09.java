
package excercicios;
import java.util.Scanner;
/**
 *
 * @author Maria Perrone
 */
public class exercicio09 {
    public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
        System.out.println("Insira a metragem: ");
        float metros =sc.nextFloat();
        double dados = 3.28;
        double pes = dados*metros;
        System.out.println("a metragem em pes é de: " +pes);
        
    }
}

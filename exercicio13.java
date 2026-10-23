
package excercicios;
import java.util.Scanner;
/**
 *
 * @author adm
 */
public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Quantos graus está hoje: ");
        double graus = sc.nextDouble();
        double farinha = (graus*1.8)+32;
        System.out.println(graus +"°C equivale a "+farinha +"°F");
        
    }
}

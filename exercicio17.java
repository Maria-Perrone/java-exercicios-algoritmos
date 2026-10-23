
package excercicios;
import java.util.Scanner;
/**
 *
 * @author Maria Perrone
 */
public class exercicio17{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.println("Digite seu numero: ");
        double n = sc.nextDouble();
                
    if (n >1){
    System.out.println("Este numero é positivo");
    }else if (n <0){
    System.out.println("Este numero é negativo");
    }else{
    System.out.println("O valor é zero");
    }
}
}
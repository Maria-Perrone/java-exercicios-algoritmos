
package excercicios;
import java.util.Scanner;
/**
 *
 * @author Maria Perrone
 */
public class exercicio10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.println("Insira um numero");
        int n1 = sc.nextInt();
        System.out.println("segundo numero: ");
        int n2 = sc.nextInt();
        System.out.println("Terceiro: ");
        int n3 = sc.nextInt();
        System.out.println("Ultimo ");
        int n4 = sc.nextInt();
        //calculo
        int media = n1+n2+n3+n4/4;
        System.out.println("A media dos valores digitados é de : "+media);
        
    }
}

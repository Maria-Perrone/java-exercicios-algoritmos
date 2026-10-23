
package excercicios;
import java.util.Scanner;
/**
 *
 * @author adm
 */
public class exercicio12 {
    public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
        System.out.println("Digite o valor do salario: ");
        float salario = sc.nextFloat();
        //calculos
                double add = salario*0.4; //adiantamento40%
                double desc= salario*0.08;//desconto em folha -8%
                double fim = salario-desc-add;
                System.out.println("O valor do adiantamento é de : "+add);
                System.out.println(" o valor do desconto é de : " + desc
                        + "e por fim, o valor liquido é de : "+fim);
                
    }
}

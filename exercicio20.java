
package excercicios;
import java.util.Scanner;
/**
 *
 * @author Maria Perrone
 */
public class exercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Digite o valor 1");
    double n1 = sc.nextDouble();    
    System.out.println("Digite o valor 2");
    double n2 = sc.nextDouble();
    System.out.println("Digite o valor3 ");
    double n3 = sc.nextDouble();
    System.out.println("Digite o valor4 ");
    double n4 = sc.nextDouble();
     
    double media = n1+n2+n3+n4/4;
    
    if (media >= 7 && media <= 10){
        System.out.println("Aluno aprovado, a media foi de: "+media);
    }
    else if (media < 3){
        System.out.println("Aluno reprovadoa media foi de: "+media);
    }
    else if (media <7 && media >= 3){
        System.out.println("“Aluno em recuperaçãoa media foi de: "+media);
    } 
    else {
        System.out.println("Valores invalidos, confirme os dados e digite novamente ");
    }
    }
    
}

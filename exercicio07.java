
package excercicios;
import java.util.Scanner;
/**
 *
 * @author Maria Perrone
 */
public class exercicio07 {
    public static void main(String[] args) {
//imput de dados
    Scanner sc = new Scanner (System.in);
        System.out.println("Digite seu nome ");
        String nome = sc.nextLine();
        System.out.println("Agora informe seu ano de nascimento: "); 
        int ano = sc.nextInt();
//calculo
int idade = 2026-ano;

System.out.println(nome +" voce tem, "+idade +" anos vividos");
    }
    
}

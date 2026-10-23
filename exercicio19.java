
package excercicios;
import java.util.Scanner;
/**
 *
 * @author Maria Perrone
 */
public class exercicio19 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println ("Informe a sua idade: ");
int idade = sc.nextInt();
int falta = 16 - idade;

if (idade >= 18 && idade <= 70){
System.out.println("voto obrigatorio");
}else if(idade >=16 && idade >70){
System.out.println("voto facultativo"); 
}else if (idade <16){
System.out.println("Idade não permitida para o voto, faltam "+falta +"anos para voce votar");

 }   
}
}

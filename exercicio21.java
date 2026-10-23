
package excercicios;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String categoria = "nada";
    
        System.out.println("Informe o nome do jogador: ");
        String nome = sc.nextLine();
        System.out.println("Informe a idade: ");
        int idade = sc.nextInt();
    if (idade <= 10){
        categoria = "Infantil";
    }else if (idade<=18){
        categoria = "Juvenil";
    }else if (idade > 18 && idade <=40){
        categoria= "Profissional"; 
    }else if (idade >40){
    categoria = "Master";}
        System.out.println(nome+" você entrou na categoria " +categoria);
    }    
    }
  

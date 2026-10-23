
package excercicios;
import java.util.Scanner;

/**
 *
 * @author Maria Perrone
 */
public class exercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // titulo
        System.out.println("====================="
                + "de visual para Java"
                + "=====================");
        
        System.out.println("digite o nome da cidade");
        String cid = sc.nextLine();
        switch (cid){
            case "Jundiai" -> {
                System.out.println("É uma cidade de São Paulo");   
            }
            case "Santos" -> {
                System.out.println("É uma cidade de São Paulo");   
            }
            case "Maua" ->{
                System.out.println("É uma cidade de São Paulo");   
            }
            case "Diadema"-> {
                System.out.println("É uma cidade de São Paulo");   
            }
            default ->
                System.out.println("É uma cidade não listada no programa");
        }
    switch (cid){
        case "Monte Verde" -> {
            System.out.println("É uma cidade de Minas Gerais");      
            }
        case "Camanducaia" -> {
            System.out.println("É uma cidade de Minas Gerais"); 
        }
        case "Pouso Alegre" -> {
            System.out.println("É uma cidade de Minas Gerais"); 
        }
        default ->
                System.out.println("É uma cidade não listada no programa");
        }
    }
}    


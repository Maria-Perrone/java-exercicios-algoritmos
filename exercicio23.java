
package excercicios;
import java.util.Scanner;

/**
 *
 * @author Maria Perrone
 */
public class exercicio23 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        //titulo programa
        System.out.println("========================"
                + "Índice de Massa Corporal IMC "
                +"========================");
        System.out.println("Insira seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Informe sua altura: ");
        double altura = sc.nextDouble();
        
        //calculos
        double imc = peso/(altura*altura);
        
        if (imc <18.5){
            System.out.println("você está abaixo do peso ideal");
        }else if (imc >=18.5 && imc <= 24.9){
            System.out.println("Parabens, voce está em seu peso normal!");
        }else if (imc >= 25 && imc <= 29.9){
            System.out.println("Voce está acima do seu peso(sobrepeso)");
        }else if (imc >= 30 && imc <= 34.9){
            System.out.println("Obsidade Grau 1");
        }else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obsidade Grau 2");
        }else{
            System.out.println("Obsidade Grau 3");
        }
    }
}

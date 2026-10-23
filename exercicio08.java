
package excercicios;
import java.util.Scanner;
/**
 *
 * @author Maria Perrone
 */
public class exercicio08 {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("insira a tensao");
int tensao = sc.nextInt();
System.out.println ("agora informe a corrente ");
int corrente = sc.nextInt();
int potenciaConsumida = tensao*corrente;
        System.out.println("Potência consumida: "+potenciaConsumida);
 }
}

package excercicios;

/**
 *
 * @author Maria Perrone
 */
public class exercicio01 {
public static void main (String[] args){   
//dados
int chuveiro1 = 8500;
int chuveiro2 = 5000;
int chuveiro3 = 7500;
int volts = 220;
//contas
int amperagem1 = chuveiro1/volts;
int amperagem2 = chuveiro2/volts;
int amperagem3 = chuveiro3/volts;
System.out.println ("Para um chuveiro de "+chuveiro1 +"watts, disjuntor de: " +amperagem1);
System.out.println ("Para um chuveiro de "+chuveiro2 +"watts, disjuntor de: " +amperagem2);
System.out.println ("Para um chuveiro de "+chuveiro3 +"watts, disjuntor de: " +amperagem3);
}
}
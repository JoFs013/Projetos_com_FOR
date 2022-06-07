import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class exemplo1{
    public static void main(String[] args){
 
        int nota1, nota2;
        double media;
        //int por double = double

        int quantalunos = parseInt(showInputDialog("Quantos alunos você tem, professor? "));
        int contador = 1;
        String resultado = " ";
        while(contador <= quantalunos){

            showMessageDialog(null,"Aluno " + contador);
            nota1 = parseInt(showInputDialog("Digite a primeira nota"));
            nota2 = parseInt(showInputDialog("Digite a segunda nota"));
    
            //PROCESSAMENTO
    
            media = (nota1 + nota2) / 2.0;
    
            //Saida
    
            //showMessageDialog(null, "A média é: " + media);
            resultado = resultado + " Aluno " + contador + ": " + media + "\n";

            contador = contador + 1;
        }
        showMessageDialog(null, resultado);
       
    }


}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introdução.ao.java;
import javax.swing.JOptionPane;

public class introduçãoaojava {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome para efetuar login");
        
        String senha = JOptionPane.showInputDialog("Digte sua senha: ");
        
        if(nome.equals("joao") && senha.equals("123456")){
            JOptionPane.showMessageDialog(null, "Acesso Permitido");
        }
        else{
            JOptionPane.showMessageDialog(null, "Acesso Negado");
        }
    }
    
}



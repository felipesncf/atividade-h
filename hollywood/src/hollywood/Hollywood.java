/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hollywood;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Hollywood {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Diretor diretor1 = new Diretor();
        diretor1.setNome("Felipe");
        diretor1.setCPF("08545012586");
        diretor1.setNivel(10);
        
        Filme filme1 = new Filme();
        filme1.setTitulo("O Fotografo de Mauthausen");
        filme1.setDuracao(300);
        filme1.setCensura(16);
        filme1.setGenero("Suspense");
        filme1.setAnoLancamento(2018);
        
        diretor1.setFilme(filme1);
        Filme filmes;
        
        int controle=100;
        
        while(controle!=0){
            controle=Integer.parseInt(JOptionPane.showInputDialog("Pacara cadastrar um filme digite 1. \n Para sair digite 0"));
            if (controle==1){
                filmes=new Filme();
                filmes.setTitulo(JOptionPane.showInputDialog("Insira o nome do filme: "));
                filmes.setDuracao(Integer.parseInt(JOptionPane.showInputDialog("Insira a duracao do filme: ")));
                filmes.setCensura(Integer.parseInt(JOptionPane.showInputDialog("Insira a censura do filme: ")));
                filmes.setGenero(JOptionPane.showInputDialog("Insira o genero do filme: "));
                filmes.setAnoLancamento(Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de lacamento do filme: ")));
                diretor1.setFilme(filmes);
            }
            else{
                JOptionPane.showMessageDialog(null,"Voce saiu");
            }
        }
        for(controle=0;controle<diretor1.getFilmes().size();controle++){
            JOptionPane.showMessageDialog(null,"Titulo: "+diretor1.getFilmes().get(controle).getTitulo());
            JOptionPane.showMessageDialog(null,"Duracao: "+diretor1.getFilmes().get(controle).getDuracao());
        }
    }
    
}

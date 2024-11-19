/*Crie a classe BlocoDeNotas que possui como atributo um ArrayList<String>
chamado notas. Crie métodos para inserir, remover e buscar notas. Crie um método
que imprima todas as notas.*/

import java.util.ArrayList;
class BlocoDeNotas 
{
    ArrayList<String> notas;

    public BlocoDeNotas() {
        this.notas = new ArrayList<String>();
    }

    public void inserirNota(String nota) 
    {
        this.notas.add(nota);
    }

    public boolean removerNota(String nota) 
    {
        return this.notas.remove(nota);
    }

    public int buscarNota(String nota) {
        for (int i = 0; i < this.notas.size(); i++) 
        {
            if (this.notas.get(i).equals(nota)) 
            {
                return i;
            }
        }
        return -1;
    }

    public void imprimirNotas() 
    {
        for (String nota : this.notas) 
        {
            System.out.println(nota);
        }
    }
}

/*b) Crie a classe AppBloco, com um método main, e um menu que 1) Insira uma nota,
2) Remova uma nota, 3) Altere uma nota, 4) Listar todas as notas e 5) Saia do
sistema.*/

import javax.swing.JOptionPane;
public class AppBloco 
{
    public static void main(String[] args) 
    {
        BlocoDeNotas bloco = new BlocoDeNotas();
        int opcao;

        do 
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1) Inserir nota\n2) Remover nota\n3) Alterar nota\n4) Listar todas as notas\n5) Sair"));
            if (opcao == 1) 
            {
                String novaNota = JOptionPane.showInputDialog("Digite a nota a ser inserida:");
                bloco.inserirNota(novaNota);
            } 
            
            else if (opcao == 2) 
            {
                String notaRemover = JOptionPane.showInputDialog("Digite a nota a ser removida:");
                if (bloco.removerNota(notaRemover)) 
                {
                    JOptionPane.showMessageDialog(null, "Nota removida com sucesso!");
                } 
                
                else 
                {
                    JOptionPane.showMessageDialog(null, "Nota não encontrada!");
                }
            } 
            
            else if (opcao == 3) 
            {
                String notaAntiga = JOptionPane.showInputDialog("Digite a nota que deseja alterar:");
                int posicao = bloco.buscarNota(notaAntiga);
                
                if (posicao != -1) 
                {
                    String notaNova = JOptionPane.showInputDialog("Digite a nova nota:");
                    bloco.notas.set(posicao, notaNova);
                } 
                
                else 
                {
                    JOptionPane.showMessageDialog(null, "Nota não encontrada!");
                }
                
            } 
            
            else if (opcao == 4) 
            {
                bloco.imprimirNotas();
            } 
            
            else if (opcao == 5) 
            {
                JOptionPane.showMessageDialog(null, "Saindo do sistema...");
            } 
            
            else 
            {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 5);
    }
}
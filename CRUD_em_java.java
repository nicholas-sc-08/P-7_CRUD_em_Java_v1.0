import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

public class CRUD_em_java {


    public static void main(String[] args){

        ArrayList<String> usuarios = new ArrayList<>();
        JOptionPane.showMessageDialog(null, "Seja bem-vindo ao CRUD!");

        boolean fim_do_loop = false;

        while(!fim_do_loop) {

            int resposta = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções a seguir:\n1º Cadastrar\n2º Atualizar\n3º Deletar\n4º Visualizar\n5º Sair"));

            switch (resposta) {

                case 1:

                    cadastrar(usuarios);
                    break;

                case 2:

                    atualizar();
                    break;

                case 3:

                    deletar();
                    break;

                case 4:

                    visualizar(usuarios);
                    break;

                case 5:

                    fim_do_loop = true;
                    break;

                default:

                    JOptionPane.showMessageDialog(null, "Favor selecionar uma das 4 opções");
            };
        };
    };

    private static void cadastrar(ArrayList<String> usuarios){

        String nome = JOptionPane.showInputDialog("Insira seu nome:");

        usuarios.add(nome);

    };

    private static void atualizar(){

    };

    private static void deletar(){
        
        
    };

    private static void visualizar(ArrayList<String>usuarios){
        JOptionPane.showMessageDialog(null, "Usuários cadastrados: "+ usuarios.toString());
    };

}

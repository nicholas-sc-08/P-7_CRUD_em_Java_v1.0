import javax.swing.JOptionPane;
import java.util.ArrayList;

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

                    atualizar(usuarios);
                    break;

                case 3:

                    deletar(usuarios);
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

        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
    };

    private static void atualizar(ArrayList<String>usuarios){

        boolean usuario_atualizado = false;

        String usuario_a_atualizar = JOptionPane.showInputDialog("Digite o nome de usuário que queira atualizar.");

        for(int i = 0; i < usuarios.size() ; i++){

            if(usuario_a_atualizar.equals(usuarios.get(i))){

                String novo_usuario = JOptionPane.showInputDialog("Digite um novo nome:");

                usuarios.set(i, novo_usuario);
                JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso!");
                usuario_atualizado = true;
            };
        };

        if(!usuario_atualizado){

            JOptionPane.showMessageDialog(null, "Usuário não existente");
        };
    };

    private static void deletar(ArrayList<String>usuarios){

        boolean usuario_deletado = false;

        String usuario_a_deletar = JOptionPane.showInputDialog("Digite o nome de usuário que queira deletar:");

        for(int i = 0; i < usuarios.size(); i++){


            if(usuario_a_deletar.equals(usuarios.get(i))){

                usuarios.remove(i);
                usuario_deletado = true;

                JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso!");
            };
        };

        if(!usuario_deletado){

          JOptionPane.showMessageDialog(null, "Usuário não existente!");
        };
     };

    private static void visualizar(ArrayList<String>usuarios){

        if(usuarios.isEmpty()){

            JOptionPane.showMessageDialog(null, "Nenhum usuário cadastrado!");

        } else {

            JOptionPane.showMessageDialog(null, "Usuários cadastrados: "+ usuarios.toString());

        };
    };

}

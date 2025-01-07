import javax.swing.JOptionPane;

public class CRUD_em_java {

    public static void main(String[] args){

        JOptionPane.showMessageDialog(null, "Seja bem-vindo ao CRUD!");


       boolean fim_do_loop = false;

       while(!fim_do_loop) {

           int resposta = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções a seguir:\n1º Cadastrar\n2º Atualizar\n3º Deletar\n4º Visualizar\n5º Sair"));

           switch (resposta) {

               case 1:

                   cadastrar();
                   fim_do_loop = true;
                   break;

               case 2:

                   atualizar();
                   fim_do_loop = true;
                   break;

               case 3:

                   deletar();
                   fim_do_loop = true;
                   break;

               case 4:

                   visualizar();
                   fim_do_loop = true;
                   break;

               case 5:

                   fim_do_loop = true;
                   break;

               default:

                   JOptionPane.showMessageDialog(null, "Favor selecionar uma das 4 opções");
           };
       };
    };

    private static void cadastrar(){

        System.out.println("entrando na função");
    };

    private static void atualizar(){

    };

    private static void deletar(){

    };

    private static void visualizar(){

    };

}

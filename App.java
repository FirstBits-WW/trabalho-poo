import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final Scanner scannerKeybord = new Scanner(System.in);
        LoginSenha.Logar(scannerKeybord);

        Carrinho carrinhoDoCliente = new Carrinho();
        System.out.println("Carrinho criado!");

        System.out.println("----------------Bem vindo ao cinema (nome do cinema)!----------------");
        System.out.println("oque desejas fazer?");
        System.out.println("as atuais funções disponíveis são:");

        String opcao = null;
        do {
            System.out.println("1) Checar Login");
            System.out.println("2) Adicionar Pipoca ao carrinho ");
            System.out.println("3) Adicionar Refrigerante ao carrinho ");
            System.out.println("4) checar o carrinho");
            System.out.println("5) esvaziar o carrinho");

            System.out.println("0) Sair");

            opcao = scannerKeybord.nextLine();
            switch (opcao) {
                case "1":
                    LoginSenha.getLogin();
                    break;
                case "2":
                    System.out.println("por favor, indique o tamanho da pipoca(pequeno,medio,grande):");
                    String tamanho = scannerKeybord.nextLine();
                    Pipoca pipoca = new Pipoca("pipoca", tamanho, "salgada");
                    pipoca.setValorProduto();
                    carrinhoDoCliente.adicionarProduto(pipoca);
                    System.out.println(carrinhoDoCliente.toString());
                    break;
                case "3":
                    System.out.println("por favor, indique o tamanho do refrigerante(pequeno,medio,grande):");
                    String tamanho2 = scannerKeybord.nextLine();
                    Refrigerante refri = new Refrigerante("Refribala", "Coca-cola Espuma", tamanho2);
                    refri.setValorProduto();
                    carrinhoDoCliente.adicionarProduto(refri);
                    System.out.println(carrinhoDoCliente.toString());

                    break;
                case "4":
                    System.out.println(carrinhoDoCliente.toString());
                    System.out.println("o valor total do carrinho é: \n" + carrinhoDoCliente.valorDoCarrinho() + "R$");

                    break;
                case "5":
                    carrinhoDoCliente.esvaziarCarrinho();
                    System.out.println("Carrinho esvaziado!!!!");
                    break;

            }
        } while (!opcao.equals("0"));
    }
}

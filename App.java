
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final Scanner scannerKeybord = new Scanner(System.in);
        String[] LogSen = LoginSenha.Logar(scannerKeybord);
        String Login = LogSen[0];
       // String Senha = LogSen[1];
        boolean ingressoVendido = false;


        Carrinho carrinhoDoCliente = new Carrinho();
        System.out.println("Carrinho criado!");
        ClienteVip clienteVipTeste = new ClienteVip(Login, carrinhoDoCliente, true);
        System.out.println("Cliente teste instânciado!");
        Sessao filmeTeste = new Sessao(30);     
        System.out.println("filme teste criado!");
        Ingresso ingresso = null;

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
            System.out.println("6) comprar ingresso");
            System.out.println("7) checar preço do ingresso");

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
                case "6":
                System.out.println("------------ Processando seu ingresso ------------");
                    if (ingressoVendido == false) {
                        ingresso =  new Ingresso(50.00);
                        ingresso.venderIngresso(filmeTeste, clienteVipTeste);
                        System.out.println("O valor do ingresso é: " + ingresso.getValorIngresso() + "R$ ");
                        ingressoVendido = true;
    
                    }else{
                        System.out.println("Você já comprou 1 ingresso!!!");
                    }

                    break;
                case "7":
                System.out.println("O valor do ingresso é: " + ingresso.getValorIngresso() + "R$ ");
                    break;


            }
        } while (!opcao.equals("0"));
    }
}

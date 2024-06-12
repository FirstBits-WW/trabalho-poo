import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LoginSenha {
    
    public static String[] Logar(Scanner scannerKeybord) throws Exception {
        String loginString;
        String senhaString;
        FileWriter loginESenha = new FileWriter("LoginESenha.txt", false);
        // Inserção do login
        System.out.println("Por favor, digite seu login");
        loginString = scannerKeybord.nextLine();
        System.out.println("por favor, digite sua senha");
        senhaString = scannerKeybord.nextLine();

        String[] LogSen = new String[2];

        loginESenha.write(loginString);
        loginESenha.write("\n");
        loginESenha.write(senhaString);
        loginESenha.close();



        File file = new File("LoginESenha.txt");

        Scanner scannerArquivo = new Scanner(file);
        System.out.println("Seu login e Senha é:");
        while (scannerArquivo.hasNextLine()) {

            System.out.println("'" + scannerArquivo.nextLine() + "'");
        }
        
        scannerArquivo.close();
        return LogSen;

    }

    public static void getLogin() throws Exception {
        File file = new File("LoginESenha.txt");

        Scanner scannerArquivo = new Scanner(file);
        System.out.println("Seu login e Senha é:");
        while (scannerArquivo.hasNextLine()) {

            System.out.println("'" + scannerArquivo.nextLine() + "'");
        }

        scannerArquivo.close();

    }

}

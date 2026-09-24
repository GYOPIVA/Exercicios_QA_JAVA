package QA;

import java.util.Scanner;

public class ValidadorCadastro {
    public static boolean emailPreenchido(String email) {
        return email != null && !email.trim().isEmpty();
    }

    public static boolean idadePermitida(int idade) {
        return idade >= 18;
    }

    public static boolean senhaValida(String senha) {
        return senha != null && senha.length() >= 8;
    }

    public static boolean termosAceitos( String termos ){
        return termos.equalsIgnoreCase("S");
    }

    public static String avaliarCadastro(
            String email,
            int idade,
            String senha,
            String termos) {

        if (!emailPreenchido(email)) {
            return "E-MAIL OBRIGATORIO";
        }

        if (!idadePermitida(idade)) {
            return "IDADE NAO PERMITIDA";
        }

        if (!senhaValida(senha)) {
            return "SENHA INVALIDA";
        }

        if (!termosAceitos(termos)) {
            return "TERMOS INVALIDOS";
        }

        return "CADASTRO PERMITIDO";
    }

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu email: ");
        String email = input.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        input.nextLine(); // limpa o buffer

        System.out.println("Digite sua senha: ");
        String senha = input.nextLine();

        while (senha.length() < 8) {
            System.out.println("A senha deve ter no mínimo 8 caracteres.");
            senha = input.nextLine();
        }

        System.out.println("Aceita os termos? 'S' ou 'N'");
        String termos = input.nextLine();

        while (!termos.equalsIgnoreCase("S") &&
                !termos.equalsIgnoreCase("N")) {

            System.out.println("Digite apenas S ou N");
            termos = input.nextLine();
        }

        String resultado = avaliarCadastro(email, idade, senha, termos);

        System.out.println("Resultado: " + resultado);
        }
}



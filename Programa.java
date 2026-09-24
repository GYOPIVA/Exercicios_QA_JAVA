package QA;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome= sc.nextLine();
        System.out.println("Digite seu e-mail: ");
        String email = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade= sc.nextInt();
        System.out.println("Curso matriculado: \n[1] ADS\n[2]Gestão de TI\n[3]Engenharia de IA ");
        String cursoMatriculado= sc.next();
        while (!cursoMatriculado.equals("1") &&  !cursoMatriculado.equals("2") && !cursoMatriculado.equals("3")){
            System.out.println("Digite um dos cursos citados: ");
            cursoMatriculado= sc.next();
        }
        double cargaHoraria = 0;

        switch (cursoMatriculado) {
            case "1":
                cursoMatriculado = "Curso escolhido: ADS";
                cargaHoraria = 40;
                break;

            case "2":
                cursoMatriculado = "Curso escolhido: Gestão de TI";
                cargaHoraria = 40;
                break;

            case "3":
                cursoMatriculado = "Curso escolhido: Engenharia de IA";
                cargaHoraria = 60;
                break;

            default:
                System.out.println("Opção inválida!");
        }

        System.out.println("Carga horária: " + cargaHoraria + " horas");

        ContaUsuario conta1 = new ContaUsuario(nome,email,idade);

        PlanoCurso planoA = new PlanoCurso(cursoMatriculado,160);

        System.out.println("Usuário: "+ conta1.getNome());

        System.out.println("Ativo: " + conta1.isAtivo());

        conta1.registrarTentativaInvalida();
        conta1.registrarTentativaInvalida();
        conta1.registrarTentativaInvalida();

        conta1.desbloquear();

        System.out.println("Tentativas: " + conta1.getTentativasInvalidas());
        System.out.println(
                "Bloqueada: " + conta1.isBloqueado()
        );

        System.out.println(
                "Pode acessar: " + conta1.podeAcessar()
        );

        System.out.println(planoA.getNomeCurso());
        System.out.printf("Carga horaria: %.0f horas\n", planoA.getCargaHoraria());
        System.out.println("Status: "+ planoA.ativo());

    }
}

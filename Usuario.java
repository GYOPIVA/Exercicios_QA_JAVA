package QA;

public class Usuario {

    private String nome;
    private String email;
    private int idade;
    private boolean ativo;

    public Usuario(
            String nome,
            String email,
            int idade,
            boolean ativo) {

        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.ativo = true;
    }

    public boolean podeAcessar() {
        return ativo && idade >= 18;
    }
}
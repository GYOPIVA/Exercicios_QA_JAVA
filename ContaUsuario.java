package QA;

public class ContaUsuario {

    private String nome,email;
    private byte tentativasInvalidas;
    private int idade;
    private boolean ativo,bloqueado;

    public ContaUsuario(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.ativo = true;
        this.bloqueado = false;
        this.tentativasInvalidas = 0;
    }



    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public int getTentativasInvalidas() {
        return tentativasInvalidas;
    }

    public boolean podeAcessar(){
        return ativo && idade >= 18 && !bloqueado;
    }

    public void registrarTentativaInvalida(){
        tentativasInvalidas++;
        if (tentativasInvalidas >=3){
            bloqueado = true;
        }
    }

    public void registrarLoguinComSucesso(){
        tentativasInvalidas = 0;
    }

    public void desativar(){
        ativo = false;
    }

    public void ativar(){
        ativo = true;
    }

    public void desbloquear() {
        bloqueado = false;
        tentativasInvalidas = 0;
    }

    public void alterarEmail(String novoEmail) {

        if (novoEmail == null) {
            return;
        }

        if (novoEmail.trim().isEmpty()) {
            return;
        }

        if (!novoEmail.contains("@")) {
            return;
        }

        email = novoEmail.trim();
    }

    public void alterarNome(String novoNome) {

        if (novoNome == null) {
            return;
        }

        novoNome = novoNome.trim();

        if (novoNome.isEmpty()) {
            return;
        }

        nome = novoNome;
    }
}


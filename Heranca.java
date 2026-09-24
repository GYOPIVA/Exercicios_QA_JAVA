package QA;

public class Heranca {

    public class Usuario {

        protected String nome;

        public Usuario(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
    }

    public class Aluno extends Usuario {

        private String matricula;

        public Aluno(
                String nome,
                String matricula) {

            super(nome);
            this.matricula = matricula;
        }

        public String getMatricula() {
            return matricula;
        }
    }

}

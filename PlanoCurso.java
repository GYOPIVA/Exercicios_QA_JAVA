package QA;

public class PlanoCurso {
    private String nomeCurso;
    private double cargaHoraria;
    private boolean ativo,desativo;

    public PlanoCurso(String nomeCurso, double cargaHoraria) {
        this.nomeCurso = nomeCurso;
        this.cargaHoraria = cargaHoraria;
        this.ativo = true;
        this.desativo = false;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }


    public boolean ativo() {
        return ativo;
    }

    public boolean desativo() {
        return desativo;
    }

    public boolean podeSerOfertado() {
        return ativo && cargaHoraria > 0;
    }
}

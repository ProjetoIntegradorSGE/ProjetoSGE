package sge.model;

public class aluno {
    private int id;
    private String nomeAluno;
    private String matricula;
    private int idTurma;

    public aluno(int id, String nomeAluno, String matricula, int idTurma) {
        this.id = id;
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
        this.idTurma = idTurma;
    }

    public int getId() { return id; }
    public String getNomeAluno() { return nomeAluno; }
    public String getMatricula() { return matricula; }
    public int getIdTurma() { return idTurma; }
}
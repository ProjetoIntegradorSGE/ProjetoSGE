
package sge.model;


public class turma {
    private int id;
    private String nomeTurma;
    
    public turma(int id, String nomeTurma) {
        this.id = id;
        this.nomeTurma = nomeTurma;
    }
    
    public int getId() { return id; }
    public String getNomeTurma() { return nomeTurma; }
    
}

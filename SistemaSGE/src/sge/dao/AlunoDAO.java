package sge.dao;

import sge.model.aluno;
import sge.util.conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    public void salvar(aluno a) {
        String sql = "INSERT INTO alunos (nome_aluno, matricula, id_turma) VALUES (?, ?, ?)";
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, a.getNomeAluno());
            stmt.setString(2, a.getMatricula());
            stmt.setInt(3, a.getIdTurma());
            stmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM alunos WHERE id_aluno = ?";
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public List<aluno> listar() {
        List<aluno> lista = new ArrayList<>();
        String sql = "SELECT * FROM alunos";
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                lista.add(new aluno(
                    rs.getInt("id_aluno"),
                    rs.getString("nome_aluno"),
                    rs.getString("matricula"),
                    rs.getInt("id_turma")
                ));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return lista;
    }
}
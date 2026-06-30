package sge.dao;

import sge.model.turma;
import sge.util.conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TurmaDAO {

    public void salvar(turma t) {
        String sql = "INSERT INTO turmas(nome_turma) VALUES (?)";
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, t.getNomeTurma());
            stmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM turmas WHERE id_turma = ?";
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public List<turma> listar() {
        List<turma> lista = new ArrayList<>();
        String sql = "SELECT * FROM turmas";
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                lista.add(new turma(rs.getInt("id_turma"), rs.getString("nome_turma")));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return lista;
    }
}
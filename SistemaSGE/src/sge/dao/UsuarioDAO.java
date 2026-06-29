package sge.dao;

import sge.model.usuario;
import sge.util.conexao;
import java.sql.*;

public class UsuarioDAO {
    public usuario autenticar(String login, String senha) {
        String sql = "SELECT * FROM usuarios WHERE nome = ? AND senha = ?";
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new usuario(
                    rs.getInt("id_usuario"),
                    rs.getString("nome"),
                    rs.getString("nome"),
                    rs.getString("perfil")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

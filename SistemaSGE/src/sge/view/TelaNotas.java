package sge.view;

import sge.util.conexao;
import java.sql.*;

public class TelaNotas extends javax.swing.JFrame {
    
private sge.model.usuario usuarioLogado;

    public TelaNotas(sge.model.usuario u) {
        this.usuarioLogado = u;
        initComponents();
    }

    private void carregarTabela(int idAluno) {
    jTextArea1.setText("");
    
    String sql = "SELECT id_nota, valor_nota, descricao FROM notas WHERE id_aluno = ?";
    
    try (Connection conn = conexao.conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        stmt.setInt(1, idAluno);
        ResultSet rs = stmt.executeQuery();
        
        jTextArea1.append("--- NOTAS DO ALUNO ---\n\n");
        boolean temNotas = false;
        
        while (rs.next()) {
            temNotas = true;
            int idNota = rs.getInt("id_nota");
            double valor = rs.getDouble("valor_nota");
            String desc = rs.getString("descricao");
            
            if (desc == null || desc.isEmpty()) {
                desc = "Sem descrição";
            }
            
            // Adiciona como texto linha por linha
            jTextArea1.append("ID Nota: " + idNota + " | Valor: " + valor + " | Desc: " + desc + "\n");
            jTextArea1.append("--------------------------------------------------\n");
        }
        
        if (!temNotas) {
            jTextArea1.append("Nenhuma nota encontrada para este aluno.");
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdAluno = new javax.swing.JLabel();
        lvlNota = new javax.swing.JLabel();
        lblDescrição = new javax.swing.JLabel();
        txt_aluno = new javax.swing.JTextField();
        txt_nota = new javax.swing.JTextField();
        txt_desc = new javax.swing.JTextField();
        btn_notas = new javax.swing.JButton();
        btn_ADnotas = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIdAluno.setText("ID Aluno");

        lvlNota.setText("Valor Nota");

        lblDescrição.setText("Descrição");

        btn_notas.setText("Ver Notas");
        btn_notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_notasActionPerformed(evt);
            }
        });

        btn_ADnotas.setText("Adicionar Notas");
        btn_ADnotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ADnotasActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdAluno)
                                    .addComponent(lvlNota)
                                    .addComponent(lblDescrição))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_aluno)
                                    .addComponent(txt_nota)
                                    .addComponent(txt_desc, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                            .addComponent(btn_ADnotas)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(74, Short.MAX_VALUE)
                        .addComponent(btn_notas)
                        .addGap(49, 49, 49)
                        .addComponent(btnVoltar)))
                .addGap(493, 493, 493))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdAluno)
                    .addComponent(txt_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lvlNota)
                    .addComponent(txt_nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescrição)
                    .addComponent(txt_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ADnotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btn_notas))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ADnotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ADnotasActionPerformed
    String idAlunoTexto = txt_aluno.getText().trim();
    String valorNotaTexto = txt_nota.getText().trim();
    String descricao = txt_desc.getText().trim(); // Pode ser vazia

 
    if (idAlunoTexto.isEmpty() || valorNotaTexto.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, preencha o ID do Aluno e o valor da Nota!");
        return;
    }
    String sql = "INSERT INTO notas (id_aluno, valor_nota, descricao) VALUES (?, ?, ?)";

    try (java.sql.Connection conn = sge.util.conexao.conectar();
         java.sql.PreparedStatement stmt = conn.prepareStatement(sql)) {

        if (conn == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao conectar com o banco de dados.");
            return;
        }

        int idAluno = Integer.parseInt(idAlunoTexto);
        double valorNota = Double.parseDouble(valorNotaTexto.replace(",", ".")); 
        stmt.setInt(1, idAluno);
        stmt.setDouble(2, valorNota);
        
        stmt.setString(3, descricao); 

        int linhasAfetadas = stmt.executeUpdate();

        if (linhasAfetadas > 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Nota adicionada com sucesso!");
            
            // Limpa os campos da tela
            txt_aluno.setText("");
            txt_nota.setText("");
            txt_desc.setText("");
        }

    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro: Certifique-se de que o ID é um número inteiro e a Nota é um número decimal válido!");
    } catch (java.sql.SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao salvar nota no banco: " + e.getMessage());
        e.printStackTrace();
    }
       

    }//GEN-LAST:event_btn_ADnotasActionPerformed

    private void btn_notasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_notasActionPerformed
          jTextArea1.setText(""); 

    String sql = "SELECT id_aluno, valor_nota, descricao FROM notas";

    try (java.sql.Connection conn = sge.util.conexao.conectar();
         java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
         java.sql.ResultSet rs = stmt.executeQuery()) {

        jTextArea1.append("--- LISTA DE NOTAS ---\n\n");

        while (rs.next()) {
            int id = rs.getInt("id_aluno");
            double nota = rs.getDouble("valor_nota");
            String desc = rs.getString("descricao");

            if (desc == null || desc.isEmpty()) {
                desc = "Sem descrição";
            }

            jTextArea1.append("ID Aluno: " + id + " | Nota: " + nota + " (" + desc + ")\n");
            jTextArea1.append("--------------------------------------------------\n");
        }

    } catch (java.sql.SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao listar: " + e.getMessage());
        e.printStackTrace();
    }
                                           

    }//GEN-LAST:event_btn_notasActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaDiretor(usuarioLogado).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new TelaNotas((sge.model.usuario) null).setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btn_ADnotas;
    private javax.swing.JButton btn_notas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblDescrição;
    private javax.swing.JLabel lblIdAluno;
    private javax.swing.JLabel lvlNota;
    private javax.swing.JTextField txt_aluno;
    private javax.swing.JTextField txt_desc;
    private javax.swing.JTextField txt_nota;
    // End of variables declaration//GEN-END:variables

}
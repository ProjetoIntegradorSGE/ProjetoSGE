package sge.view;

public class TelaUsuarios extends javax.swing.JFrame {
    private sge.model.usuario usuarioLogado;

    public TelaUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnInserir = new javax.swing.JButton();
        txt_ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_Deletar = new javax.swing.JButton();
        lblUsuarios = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Senha");

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        jLabel3.setText("id");

        btn_Deletar.setText("deletar");
        btn_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeletarActionPerformed(evt);
            }
        });

        lblUsuarios.setFont(new java.awt.Font("Sitka Display", 3, 36)); // NOI18N
        lblUsuarios.setText("Gestão de usuários");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Cadastro");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Exclusão");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(lblUsuarios)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInserir)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(txtSenha))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Deletar)
                            .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInserir)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Deletar)
                .addGap(26, 26, 26)
                .addComponent(btnVoltar)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeletarActionPerformed
    String idTexto = txt_ID.getText().trim(); 
    if (idTexto.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, digite o ID do usuário que deseja deletar!");
        return;
    }

    int resposta = javax.swing.JOptionPane.showConfirmDialog(this, 
            "Tem certeza que deseja deletar o usuário com o ID " + idTexto + "?", 
            "Confirmar Exclusão", 
            javax.swing.JOptionPane.YES_NO_OPTION);
    
    if (resposta != javax.swing.JOptionPane.YES_OPTION) {
        return; 
    }

    String sql = "DELETE FROM usuarios WHERE id_usuario = ?";

    try (java.sql.Connection conn = sge.util.conexao.conectar();
         java.sql.PreparedStatement stmt = conn.prepareStatement(sql)) {

        if (conn == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao conectar com o banco de dados.");
            return;
        }

        int idUsuario = Integer.parseInt(idTexto);
        stmt.setInt(1, idUsuario);


        int linhasAfetadas = stmt.executeUpdate();

        if (linhasAfetadas > 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Usuário deletado com sucesso!");
            txt_ID.setText("");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Nenhum usuário encontrado com o ID informado.");
        }

    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, digite apenas números no campo de ID!");
    } catch (java.sql.SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao deletar no banco: " + e.getMessage());
        e.printStackTrace();
    }                  

   

  
    }//GEN-LAST:event_btn_DeletarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
                                          

    String nomeInserido = txtNome.getText().trim();
    
    String senhaInserida = txtSenha.getText().trim();
   
    String perfilInserido = "Aluno"; 


    if (nomeInserido.isEmpty() || senhaInserida.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos!");
        return;
    }


    String sql = "INSERT INTO usuarios (nome, senha, perfil) VALUES (?, ?, ?)";

    try (java.sql.Connection conn = sge.util.conexao.conectar();
         java.sql.PreparedStatement stmt = conn.prepareStatement(sql)) {

        if (conn == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao conectar com o banco de dados.");
            return;
        }
        stmt.setString(1, nomeInserido);
        stmt.setString(2, senhaInserida);
        stmt.setString(3, perfilInserido);

        int linhasAfetadas = stmt.executeUpdate();

        if (linhasAfetadas > 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Usuário inserido com sucesso!");
            txtNome.setText("");
            txtSenha.setText("");
        }

    } catch (java.sql.SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao salvar no banco: " + e.getMessage());
        e.printStackTrace();
    }

 
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
            new TelaDiretor(usuarioLogado).setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btn_Deletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txt_ID;
    // End of variables declaration//GEN-END:variables
}



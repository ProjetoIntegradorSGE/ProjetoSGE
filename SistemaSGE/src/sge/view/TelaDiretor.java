
package sge.view;

import sge.model.usuario;


public class TelaDiretor extends javax.swing.JFrame {
    private usuario usuarioLogado;
    
    public TelaDiretor(usuario u) {
        this.usuarioLogado = u;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        lblDiretor = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        btnTurmas = new javax.swing.JButton();
        btnAlunos = new javax.swing.JButton();
        btnNotas = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));

        btnLogout.setText("Voltar");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblDiretor.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lblDiretor.setText("Painel do Diretor");

        btnUsuarios.setText("Gestão de usuários");

        btnTurmas.setText("Gestão de turmas");
        btnTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurmasActionPerformed(evt);
            }
        });

        btnAlunos.setText("Gestão de aluno");

        btnNotas.setText("Lançamento de notas");

        btnRelatorios.setText("Relatórios");
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout)
                    .addComponent(btnUsuarios)
                    .addComponent(lblDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTurmas)
                    .addComponent(btnAlunos)
                    .addComponent(btnNotas)
                    .addComponent(btnRelatorios))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarios)
                .addGap(18, 18, 18)
                .addComponent(btnTurmas)
                .addGap(18, 18, 18)
                .addComponent(btnAlunos)
                .addGap(18, 18, 18)
                .addComponent(btnNotas)
                .addGap(18, 18, 18)
                .addComponent(btnRelatorios)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void btnTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurmasActionPerformed
            new TelaTurmas(usuarioLogado).setVisible(true);
            this.dispose();
        ;
    }//GEN-LAST:event_btnTurmasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlunos;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNotas;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnTurmas;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel lblDiretor;
    // End of variables declaration//GEN-END:variables
}

package sge.view;

import sge.dao.AlunoDAO;
import sge.dao.TurmaDAO;
import sge.model.aluno;
import sge.model.turma;
import java.util.List;


public class TelaAlunos extends javax.swing.JFrame {
    private sge.model.usuario usuarioLogado;

    public TelaAlunos(sge.model.usuario u) {
        this.usuarioLogado = u;
        initComponents();
        carregarComboTurmas();
        carregarTabela();
    }

    private void carregarComboTurmas() {
        TurmaDAO dao = new TurmaDAO();
        List<turma> lista = dao.listar();
        cmbTurma.removeAllItems();
        for (turma t : lista) {
            cmbTurma.addItem(t.getId() + " - " + t.getNomeTurma());
        }
    }

    private void carregarTabela() {
        AlunoDAO dao = new AlunoDAO();
        List<aluno> lista = dao.listar();
        String[] colunas = {"ID", "Nome do Aluno", "Matrícula", "ID Turma"};
        Object[][] dados = new Object[lista.size()][4];
        for (int i = 0; i < lista.size(); i++) {
            dados[i][0] = lista.get(i).getId();
            dados[i][1] = lista.get(i).getNomeAluno();
            dados[i][2] = lista.get(i).getMatricula();
            dados[i][3] = lista.get(i).getIdTurma();
        }
        tblRelatorio.setModel(new javax.swing.table.DefaultTableModel(dados, colunas));
    }





    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNomeAlunos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRelatorio = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        txtMatricula = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        cmbTurma = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sitka Display", 3, 36)); // NOI18N
        jLabel1.setText("Gestão de Alunos:");

        txtNomeAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAlunosActionPerformed(evt);
            }
        });

        tblRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Aluno", "Nome ALuno", "Matricula", "ID Turma"
            }
        ));
        jScrollPane1.setViewportView(tblRelatorio);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblNome.setText("Nome");

        lblMatricula.setText("Matricula");

        cmbTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(lblMatricula))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNomeAlunos)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(278, 278, 278)
                                            .addComponent(jLabel2))
                                        .addComponent(jLabel1))
                                    .addComponent(btnSalvar))))
                        .addGap(84, 84, 84)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatricula)
                    .addComponent(cmbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnExcluir))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaDiretor(usuarioLogado).setVisible(true);
        this.dispose();

    
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    String nome = txtNomeAlunos.getText().trim();
    String matricula = txtMatricula.getText().trim();
    

    if (nome.isEmpty() || matricula.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
        return;
    }
    
    // 3. Captura o ID da turma selecionada na ComboBox
    String itemSelecionado = (String) cmbTurma.getSelectedItem();
    if (itemSelecionado == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione uma turma válida!");
        return;
    }
    
    try {
        // Divide a String para pegar apenas o número antes do traço (ex: "1 - 1º Ano")
        int idTurma = Integer.parseInt(itemSelecionado.split(" - ")[0]);
        
        // 4. Cria a instância do modelo do aluno
        sge.model.aluno a = new sge.model.aluno(0, nome, matricula, idTurma);
        
        // 5. Envia os dados para salvar através do AlunoDAO
        sge.dao.AlunoDAO dao = new sge.dao.AlunoDAO();
        dao.salvar(a);
        
        // Mensagem de sucesso!
        javax.swing.JOptionPane.showMessageDialog(this, "Aluno salvo com sucesso!");
        
        // 6. Limpa as caixas de texto de forma correta
        txtNomeAlunos.setText("");
        txtMatricula.setText("");
        
        // Atualiza os dados da tabela na tela
        carregarTabela();
        
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao salvar o aluno: " + e.getMessage());
        e.printStackTrace();
    }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAlunosActionPerformed
 
    }//GEN-LAST:event_txtNomeAlunosActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tblRelatorio.getSelectedRow();
        if (linha == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um aluno!");
            return;
        }
        int id = (int) tblRelatorio.getValueAt(linha, 0);
        new AlunoDAO().excluir(id);
        carregarTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblRelatorio;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNomeAlunos;
    // End of variables declaration//GEN-END:variables
}

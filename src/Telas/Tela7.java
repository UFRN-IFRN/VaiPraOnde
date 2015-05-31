package Telas;

import java.sql.Connection;import java.sql.PreparedStatement;
;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Tela7 extends javax.swing.JFrame {
    
    static String item;

    public Tela7() {
        initComponents();
        carregarEmpresas();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_empresas = new javax.swing.JList();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(133, 166, 202));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 490));

        lista_empresas.setBackground(new java.awt.Color(205, 217, 216));
        lista_empresas.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        lista_empresas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lista_empresas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lista_empresasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lista_empresas);

        btnCadastrar.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        btnCadastrar.setText("Cadastre sua empresa");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        btnExcluir.setText("Exclua sua empresa");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(142, 230, 218));
        jPanel2.setPreferredSize(new java.awt.Dimension(403, 88));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel1.setText("Empresas Cadastradas");

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnAtualizar.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        btnAtualizar.setText("Atualize sua empresa");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Tela6 sexta = new Tela6();
        sexta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String senha = JOptionPane.showInputDialog("Digite a senha da sua empresa: ");
               
        String comando1 = "SELECT id_empresa FROM empresa WHERE senha = ?";
        
        ResultSet result1;
               
        int op  = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja exculir sua empresa?","Excluir" ,JOptionPane.YES_NO_OPTION);
        if(op == 0){
            try {
                Connection conn = new Conexao().doConnection();
                PreparedStatement stmt = conn.prepareStatement(comando1);
                stmt.setString(1, senha);
                result1 = stmt.executeQuery();
                              
                long id = 0;        
                while(result1.next()){
                    id = result1.getLong("id_empresa"); 
                }
                
                deletarEmpresa(id);           
                
            } catch (SQLException e) {
                System.out.println("Algo está impedindo que você exclua esta empresa\n"+e.getMessage());
            }
        }       
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        
        try{
            String resposta = JOptionPane.showInputDialog(rootPane,"1- Inserir nova linha\n2- Atualizar linha existente\n3- Excluir Linha");
        
            if (resposta.equals("1")){
                Tela3 terceira = new Tela3();
                terceira.setVisible(true);
                this.dispose();
            }   
            if (resposta.equals("2")) {
                Tela8 oitava = new Tela8();
                oitava.setVisible(true);
                this.dispose();
            }
             if (resposta.equals("3")) {
                
                String num = null;
                num = JOptionPane.showInputDialog("Digite o número da linha que deseja excluir");
                String sen = JOptionPane.showInputDialog("Digite a senha de sua empresa");
                int op  = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja exculir essa linha?","Excluir" ,JOptionPane.YES_NO_OPTION);

                String comando1 = "DELETE FROM linhas WHERE numero = '"+num+"'";
                String comando2 = "DELETE FROM rotas WHERE numero = '"+num+"'";
                if(op == 0){
                    try{
                        Connection conn = new Conexao().doConnection();
                        Statement stmt = conn.createStatement();
                        stmt.execute(comando1);
                        stmt.execute(comando2);
                    } catch (Exception e) {
                        System.out.println("Algo está impedindo que você exclua esta linha/rota");
                    }              
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());        
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
       Tela1 primeira = new Tela1();
       primeira.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void lista_empresasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lista_empresasValueChanged
        item = String.valueOf(lista_empresas.getSelectedValue());
        
        Tela9 nona = new Tela9();
        nona.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_lista_empresasValueChanged
    
    public void deletando(ArrayList<String>nomes, String nome){
        String comando2 = "SELECT senha FROM empresa";
             
        ResultSet result2;
        ArrayList<String> senhas = new ArrayList<>();
        try{
            
        Connection conn = new Conexao().doConnection();
        Statement stmt = conn.createStatement();
        result2 = stmt.executeQuery(comando2);
        
            while(result2.next()){
                String t = result2.getString("senha");
                senhas.add(t);
            }

            for (int i=0; i<nomes.size(); i++) {
                if (nomes.get(i).equals(nome)) {
                    String senha = null;
                    senha = JOptionPane.showInputDialog("Digite a senha: ");
                    if (senhas.get(i).equals(senha)){
                        stmt.executeUpdate("DELETE FROM empresa WHERE nome = '"+nome+"'");            
                        JOptionPane.showMessageDialog(rootPane, "Empresa excluida com sucesso!", "", JOptionPane.PLAIN_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
                System.out.println("Algo está impedindo que você exclua esta empresa");
        }
        
        Tela1 primeira = new Tela1();
        primeira.setVisible(true);
        this.dispose();
    }

    //MEXENDO COM A LISTA
    public void carregarEmpresas(){
        ResultSet rs = null;
        ArrayList<String> empresas = new ArrayList<>();
        
        String comando = "SELECT nome FROM empresa";
        
        try {
            Connection conn = new Conexao().doConnection();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(comando);
            
             while(rs.next()){
                String t = rs.getString("nome");
                empresas.add(t);             
             }           
             
            setandoLista(empresas);
            
            stmt.close();
            rs.close();
            conn.close();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void setandoLista(ArrayList<String> empresas){
        DefaultListModel lista = new DefaultListModel();
        for(int i  = 0; i < empresas.size(); i++){
            lista.addElement(empresas.get(i));
        }
        lista_empresas.setModel(lista);
    }
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lista_empresas;
    // End of variables declaration//GEN-END:variables

    private void deletarEmpresa(long id) {
        Connection c = new Conexao().doConnection();
        try {
            String comando1 = "DELETE FROM empresa WHERE id_empresa = ?";
            PreparedStatement stmt = c.prepareStatement(comando1);
            stmt.setLong(1, id);
            stmt.executeUpdate();
            carregarEmpresas();
        } catch (SQLException e) {
            System.out.println("ERRO AO EXCLUIR EMPRESA!");
        }
    }
}
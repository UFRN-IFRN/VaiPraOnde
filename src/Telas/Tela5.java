package Telas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Tela5 extends javax.swing.JFrame {

    String origem   = Tela2.digorigem;
    String destino  = Tela2.digdestino;
    static String rotaCompleta = "";
    
    public Tela5() {
        initComponents();
        pegandoNumero();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_onibus = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        TXT1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_pass = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(133, 166, 202));

        lista_onibus.setBackground(new java.awt.Color(205, 217, 216));
        lista_onibus.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        lista_onibus.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Empresa1 - ÔnibusNúmeroTal", "Empresa2 - ÔnibusNúmeroTal", "Empresa3 - ÔnibusNúmeroTal", "Empresa4 - ÔnibusNúmeroTal", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista_onibus);

        jPanel2.setBackground(new java.awt.Color(142, 230, 218));
        jPanel2.setPreferredSize(new java.awt.Dimension(403, 88));

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        TXT1.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        TXT1.setText("Vai Pra Onde?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(TXT1)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXT1)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        lista_pass.setBackground(new java.awt.Color(205, 217, 216));
        lista_pass.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        lista_pass.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Valor", "Valor", "Valor", "Valor" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lista_pass);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Tela1 primeira = new Tela1();
        primeira.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela5().setVisible(true);
            }
        });
    }
          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TXT1;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lista_onibus;
    private javax.swing.JList lista_pass;
    // End of variables declaration//GEN-END:variables

    public void pegandoNumero(){
        ResultSet rs = null;
        
        ArrayList<String> numeros = new ArrayList<>();
        
        String comando = "SELECT numero FROM rotas WHERE origem = '"+origem+"' and destino = '"+destino+"'";
        
        try {
            Connection conn = new Conexao().doConnection();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(comando);
            
            while(rs.next()){
                String t = rs.getString("numero");         
                numeros.add(t);
            }           
             
            pegandoRotas(numeros);
            
            stmt.close();
            rs.close();
            conn.close();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void pegandoRotas(ArrayList<String> numeros){
        ResultSet rs = null;
        
        ArrayList<String> codigos = new ArrayList<>();
              
        try {
            Connection conn = new Conexao().doConnection();
            Statement stmt = conn.createStatement();
            for (int x=0; x<numeros.size(); x++){
                rs = stmt.executeQuery("SELECT codigo FROM rotas WHERE numero = '"+numeros.get(x)+"'");
            
                while(rs.next()){
                    String t = rs.getString("codigo");         
                    codigos.add(t);
                }
            }           
             
            pegandoNome(codigos, numeros);
            pegandoPass(codigos, numeros);
            
            stmt.close();
            rs.close();
            conn.close();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void pegandoNome(ArrayList<String> codigos, ArrayList<String> numeros){
        ResultSet rs = null;
        ArrayList<String> set = new ArrayList<>();
        
        try {
            Connection conn = new Conexao().doConnection();
            Statement stmt = conn.createStatement();
            for (int x=0; x<codigos.size(); x++){
                rs = stmt.executeQuery("SELECT nome FROM empresa WHERE codigo = '"+codigos.get(x)+"'");
            
                while(rs.next()){
                    String t = rs.getString("nome");  
                    set.add("Empresa: " + t + " - Linha: " + numeros.get(x));
                    System.out.println(set);
                }
            }           
             
            setandoLista(set);
            
            stmt.close();
            rs.close();
            conn.close();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void setandoLista(ArrayList<String> set){
        DefaultListModel lista = new DefaultListModel();
        for(int i  = 0; i < set.size(); i++){
            lista.addElement(set.get(i));
        }
        lista_onibus.setModel(lista);
    }   
    
        public void pegandoPass(ArrayList<String> codigos, ArrayList<String> numeros){
        ResultSet rs = null;
        ArrayList<String> set = new ArrayList<>();
        
        try {
            Connection conn = new Conexao().doConnection();
            Statement stmt = conn.createStatement();
            for (int x=0; x<codigos.size(); x++){
                rs = stmt.executeQuery("SELECT passagem FROM linhas WHERE codigo = '"+codigos.get(x)+"' AND numero = '"+numeros.get(x)+"'");
                
               
                while(rs.next()){    
                    String p = rs.getString("passagem");  
                    set.add("Valor: R$ " + p + ",00");  
                    System.out.println(set);
                }
            }           
             
            setandoLista2(set);
            
            stmt.close();
            rs.close();
            conn.close();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void setandoLista2(ArrayList<String> set){
        DefaultListModel lista = new DefaultListModel();
        for(int i  = 0; i < set.size(); i++){
            lista.addElement(set.get(i));
        }
        lista_pass.setModel(lista);
    } 
    
  
    
}
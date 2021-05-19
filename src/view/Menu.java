/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;

/**
 *
 * @author Victor
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    static String usuarioGestor = "Gestor";
    static String usuarioFuncionario = "Funcionario";
    static String usuarioVoluntario = "Voluntario";
    public Menu() {
        initComponents();
  
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bLoginGestor = new javax.swing.JButton();
        bLoginFuncionario = new javax.swing.JButton();
        bLoginVoluntario = new javax.swing.JButton();
        lTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bLoginGestor.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bLoginGestor.setText("LOGIN GESTOR");
        bLoginGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginGestorActionPerformed(evt);
            }
        });

        bLoginFuncionario.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bLoginFuncionario.setText("LOGIN FUNCIONÁRIO");
        bLoginFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginFuncionarioActionPerformed(evt);
            }
        });

        bLoginVoluntario.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bLoginVoluntario.setText("LOGIN VOLUNTÁRIO");
        bLoginVoluntario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginVoluntarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bLoginVoluntario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bLoginGestor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bLoginFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(bLoginGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bLoginFuncionario)
                .addGap(18, 18, 18)
                .addComponent(bLoginVoluntario)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        lTitulo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lTitulo.setText("MENU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(lTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLoginGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginGestorActionPerformed

    login(usuarioGestor);
        
    }//GEN-LAST:event_bLoginGestorActionPerformed

    private void bLoginFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginFuncionarioActionPerformed
      
        login(usuarioFuncionario);
    }//GEN-LAST:event_bLoginFuncionarioActionPerformed

    private void bLoginVoluntarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginVoluntarioActionPerformed
        login(usuarioVoluntario);
    }//GEN-LAST:event_bLoginVoluntarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLoginFuncionario;
    private javax.swing.JButton bLoginGestor;
    private javax.swing.JButton bLoginVoluntario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lTitulo;
    // End of variables declaration//GEN-END:variables

    public void login (String tipoDeMenu){
        Login l = new Login(tipoDeMenu);
        l.setVisible(true);
        dispose();
    }
    
    

    
    
}

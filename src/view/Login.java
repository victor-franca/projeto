/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import funcionario.CadastroEventos;
import gerais.CadastroGeral;
import gerais.UsuarioLongarNoSistema;
import java.util.ArrayList;
import java.util.Locale;
import javax.crypto.AEADBadTagException;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import static view.MenuFuncionario.listaCadastroEventos;

/**
 *
 * @author Victor
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form MenuGestor
     */
    static String tipoDeMenu;
    public static ArrayList <CadastroGeral> listaVoluntarios = new ArrayList <> (); 
    public Login(String tipoDeMenu) {
        initComponents();
        tfRecebeUsuario.setText(null);
        tfRecebeSenha.setText(null);
        this.tipoDeMenu = tipoDeMenu;
    }
    
    public Login(ArrayList <CadastroGeral> listaVoluntarios){
        this.listaVoluntarios = listaVoluntarios ;
    }

    public Login() {
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dDialogo = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        lLogin = new javax.swing.JLabel();
        lUsuario = new javax.swing.JLabel();
        lSenha = new javax.swing.JLabel();
        tfRecebeUsuario = new javax.swing.JTextField();
        tfRecebeSenha = new javax.swing.JTextField();
        bLogin = new javax.swing.JButton();

        javax.swing.GroupLayout dDialogoLayout = new javax.swing.GroupLayout(dDialogo.getContentPane());
        dDialogo.getContentPane().setLayout(dDialogoLayout);
        dDialogoLayout.setHorizontalGroup(
            dDialogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dDialogoLayout.setVerticalGroup(
            dDialogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lLogin.setText("Login");

        lUsuario.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lUsuario.setText("Usuário:");

        lSenha.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lSenha.setText("Senha:");

        tfRecebeUsuario.setText("jTextField1");

        tfRecebeSenha.setText("jTextField2");

        bLogin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bLogin.setText("LOGIN");
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(lLogin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lSenha)
                            .addComponent(lUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfRecebeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(tfRecebeSenha))))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bLogin)
                .addGap(154, 154, 154))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lLogin)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUsuario)
                    .addComponent(tfRecebeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lSenha)
                    .addComponent(tfRecebeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(bLogin)
                .addGap(0, 78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
        CadastroGeral cg = new CadastroGeral();
        String usuarioGestor = "Gestor";
        String usuarioFuncionario = "Funcionario";
        String usuarioVoluntario = "Voluntario";
        UsuarioLongarNoSistema usuario = new UsuarioLongarNoSistema();
        String nome = tfRecebeUsuario.getText();
        String senha = tfRecebeSenha.getText();
        usuario = new UsuarioLongarNoSistema(nome, senha);
        msgDeLoginNoSistema(usuario.toString());
        if(usuarioGestor.equals(tipoDeMenu)){
           MenuGestor mg = new MenuGestor();
           mg.setVisible(true);
           dispose(); 
       }
        else if (usuarioFuncionario.equals(tipoDeMenu)){
            MenuFuncionario mf = new MenuFuncionario();
            mf.setVisible(true);
            dispose();
        }
        for (int i=0; i< listaVoluntarios.size();i++){
               CadastroGeral indiceNaLista = listaVoluntarios.get(i);
               if (indiceNaLista.getNome().equals(nome) && usuarioVoluntario.equals(tipoDeMenu) ){
                   MenuVoluntario mv = new MenuVoluntario(indiceNaLista);
                   mv.setVisible(true);
                   dispose();
               }
           }
        /*else if (usuarioVoluntario.equals(tipoDeMenu) && listaVoluntarios.contains(cg)) {
         MenuVoluntario mv = new MenuVoluntario();
         mv.setVisible(true);
         dispose();*/
    }//GEN-LAST:event_bLoginActionPerformed
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login(tipoDeMenu).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLogin;
    private javax.swing.JDialog dDialogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lLogin;
    private javax.swing.JLabel lSenha;
    private javax.swing.JLabel lUsuario;
    private javax.swing.JTextField tfRecebeSenha;
    private javax.swing.JTextField tfRecebeUsuario;
    // End of variables declaration//GEN-END:variables

  public void msgDeLoginNoSistema (String msg){
      JOptionPane.showMessageDialog(rootPane, msg);
  }
 
}

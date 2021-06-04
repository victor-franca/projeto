/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import gerais.CadastroGeral;
import gerais.UsuarioLongarNoSistema;
import voluntario.CadastroVoluntarioCNPJ;
import voluntario.CadastroVoluntarioCPF;

/**
 *
 * @author Victor
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form MenuGestor
     */
    static String tipoDeMenu;
    public static ArrayList <CadastroVoluntarioCPF> listaVoluntariosCPF = new ArrayList <> ();
    public static List <CadastroVoluntarioCNPJ> listaVoluntarioCNPJ = new ArrayList <> ();
    public Login(String tipoDeMenu) {
        initComponents();
        limpaCampos();
        this.tipoDeMenu = tipoDeMenu;
    }
    
    public Login(ArrayList <CadastroVoluntarioCPF> listaVoluntarios){
        this.listaVoluntariosCPF = listaVoluntarios ;
    }
    
    public Login (List <CadastroVoluntarioCNPJ> listaVoluntariosCPNJ){
        this.listaVoluntarioCNPJ = listaVoluntariosCPNJ;
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
        bVoltarMenuPrincipal = new javax.swing.JButton();

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

        bVoltarMenuPrincipal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bVoltarMenuPrincipal.setText("Voltar Menu Principal");
        bVoltarMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarMenuPrincipalActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bVoltarMenuPrincipal)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfRecebeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addComponent(tfRecebeSenha)))))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bLogin)
                .addGap(152, 152, 152))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(bLogin)
                .addGap(36, 36, 36)
                .addComponent(bVoltarMenuPrincipal)
                .addGap(24, 24, 24))
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
        
        if(usuarioGestor.equals(tipoDeMenu)){
           msgDeLoginNoSistema(usuario.toString());
           MenuGestor mg = new MenuGestor();
           mg.setVisible(true);
           dispose(); 
       }
        else if (usuarioFuncionario.equals(tipoDeMenu)){
            msgDeLoginNoSistema(usuario.toString());
            MenuFuncionario mf = new MenuFuncionario();
            mf.setVisible(true);
            dispose();
        }
        for (int i=0; i< listaVoluntariosCPF.size();i++){
               CadastroVoluntarioCPF indiceNaListaCPF = listaVoluntariosCPF.get(i);
               int numeroCPF = indiceNaListaCPF.getCpf().length();
               if (indiceNaListaCPF.getNome().equals(nome) && usuarioVoluntario.equals(tipoDeMenu) && numeroCPF == 11){
                   msgDeLoginNoSistema(usuario.toString());
                   MenuVoluntario mv = new MenuVoluntario(indiceNaListaCPF);
                   mv.setVisible(true);
                   dispose();
               }
        }
        for (int i=0; i < listaVoluntarioCNPJ.size();i++){
            CadastroVoluntarioCNPJ indiceCNPJ = listaVoluntarioCNPJ.get(i);
            int numeroCNPJ = indiceCNPJ.getCnpj().length();
            if(indiceCNPJ.getNome().equals(nome) && usuarioVoluntario.equals(tipoDeMenu) && numeroCNPJ == 14) {
            msgDeLoginNoSistema(usuario.toString());
            MenuVoluntario mv = new MenuVoluntario(indiceCNPJ);
            mv.setVisible(true);
            dispose(); 
                   }
               }
           
          
    }//GEN-LAST:event_bLoginActionPerformed

    private void bVoltarMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarMenuPrincipalActionPerformed
        Menu  menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bVoltarMenuPrincipalActionPerformed
    
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
    private javax.swing.JButton bVoltarMenuPrincipal;
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
 
  public void limpaCampos (){
      tfRecebeUsuario.setText(null);
       tfRecebeSenha.setText(null);
  }
  
}

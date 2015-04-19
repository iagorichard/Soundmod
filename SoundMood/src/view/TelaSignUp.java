package view;

import controle.Cadastro;

public class TelaSignUp extends javax.swing.JFrame {

    /**
     * Creates new form TelaSignUp
     */
    public TelaSignUp() {
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

        jLabel1 = new javax.swing.JLabel();
        usernameCadastroLabel = new javax.swing.JLabel();
        cadastrarButton = new javax.swing.JButton();
        usernameCadastroTextField = new javax.swing.JTextField();
        nomeCompletoTextField = new javax.swing.JTextField();
        emailCadastroTextField = new javax.swing.JTextField();
        passwordTipCadastroTextField = new javax.swing.JTextField();
        passwordCadastroLabel = new javax.swing.JLabel();
        nomeCompletoCadastroLabel = new javax.swing.JLabel();
        emailCadastroLabel = new javax.swing.JLabel();
        passwordTipCadastroLabel = new javax.swing.JLabel();
        passwordCadastroField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        passwordTipCadastroLabel1 = new javax.swing.JLabel();
        premiumRadioButton = new javax.swing.JRadioButton();
        freeRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 0));
        setPreferredSize(new java.awt.Dimension(560, 360));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        jLabel1.setText("Cadastro de Usuário");

        usernameCadastroLabel.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        usernameCadastroLabel.setText("Username:");

        cadastrarButton.setBackground(new java.awt.Color(0, 0, 0));
        cadastrarButton.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        cadastrarButton.setForeground(new java.awt.Color(255, 255, 204));
        cadastrarButton.setText("Cadastrar");
        cadastrarButton.setName("cadastrarButton"); // NOI18N
        cadastrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cadastrarButtonMouseReleased(evt);
            }
        });
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        passwordCadastroLabel.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        passwordCadastroLabel.setText("Password:");

        nomeCompletoCadastroLabel.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        nomeCompletoCadastroLabel.setText("Nome Completo:");

        emailCadastroLabel.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        emailCadastroLabel.setText("Email:");

        passwordTipCadastroLabel.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        passwordTipCadastroLabel.setText("Password Tip:");

        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("               ");

        passwordTipCadastroLabel1.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        passwordTipCadastroLabel1.setText("Tipo de Conta:");

        premiumRadioButton.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        premiumRadioButton.setText("Premium User");
        premiumRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                premiumRadioButtonMouseClicked(evt);
            }
        });

        freeRadioButton.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N
        freeRadioButton.setText("Free User");
        freeRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                freeRadioButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeCompletoCadastroLabel)
                    .addComponent(passwordCadastroLabel)
                    .addComponent(emailCadastroLabel)
                    .addComponent(usernameCadastroLabel)
                    .addComponent(passwordTipCadastroLabel)
                    .addComponent(passwordTipCadastroLabel1))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(premiumRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(freeRadioButton))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameCadastroTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                        .addComponent(nomeCompletoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                        .addComponent(emailCadastroTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                        .addComponent(passwordTipCadastroTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                        .addComponent(passwordCadastroField)))
                                .addGap(0, 134, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(214, 214, 214))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameCadastroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameCadastroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordCadastroField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordCadastroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCompletoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeCompletoCadastroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailCadastroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailCadastroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTipCadastroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTipCadastroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(premiumRadioButton)
                    .addComponent(freeRadioButton)
                    .addComponent(passwordTipCadastroLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(cadastrarButton)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarButtonMouseReleased
        // TODO add your handling code here:
        
        //Variáveis que indicam atributos do usuário (tipo a ser definido)
        Cadastro cadastro;
        int id = 1;
        String username;
        String password;
        String nomeCompleto;
        String email;
        String passwordTip;
        int tipoDeUsuario = 0;
        
        //Variável para controle de erro no cadastro, valor para default
        String auxiliarRetornoDeCadastro;
        
        //Atribuindo valores da textBox para os atributos
        username = usernameCadastroTextField.getText();
        password = passwordCadastroField.getText();
        nomeCompleto = nomeCompletoTextField.getText();
        email = emailCadastroTextField.getText();
        passwordTip = passwordTipCadastroTextField.getText();
        
        //Instanciando cadastro
        cadastro = new Cadastro();

        //Verifica qual o tipo de conta especificado pelo usuário
        if (premiumRadioButton.isSelected() == true){
            tipoDeUsuario = 1;
        } else if (freeRadioButton.isSelected() == true){
            tipoDeUsuario = 2;
        } else {
            tipoDeUsuario = 0;
            jLabel3.setText("Digite um tipo de usuário!");
        }
        
        //Se o usuário tiver escolhido alguma opção para o tipo de conta, as instruções dentro do if irão verificar se as fields estão vazias
        if(tipoDeUsuario!=0){
            
            if("".equals(username) || "".equals(password) || "".equals(nomeCompleto) || "".equals(email) || "".equals(passwordTip)){
                jLabel3.setText("Por favor, preencha todos os campos!");
            }
            //Se não tiver nenhuma field vazia, o programa tentará cadastrar com os dados especificados
            else{
                //O retorno das operações irá para a variável auxiliarRetornoDeCadastro, para o tratamento de erros
                auxiliarRetornoDeCadastro = cadastro.receberInformacao(id, username, password, nomeCompleto, email, tipoDeUsuario, passwordTip);
                if("Sucesso".equals(auxiliarRetornoDeCadastro)){
                    jLabel3.setText("Cadastro realizado com sucesso!");
                    //new TelaCadastroRealizado().setVisible(true);
                }
            }
        }
        
        //Se tiver retornado a 0, o cadastro foi feito com sucesso; se não, houve erro(s)
       // if("Sucesso".equals(auxiliarRetornoDeCadastro)){
       //     jLabel3.setText("Cadastro realizado com sucesso!");
         //   new TelaCadastroRealizado().setVisible(true);
        //}
        //else if(auxiliarRetornoDeCadastro==1){
         //   jLabel3.setText("Nome de usuário solicitado já foi cadastrado, favor digite outro!");
        //}
        //else if(auxiliarRetornoDeCadastro==2){
        //    jLabel3.setText("Email solicitado já foi cadastrado, favor digite outro!");
        //}

        
        
    }//GEN-LAST:event_cadastrarButtonMouseReleased

    private void premiumRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_premiumRadioButtonMouseClicked
        // TODO add your handling code here:
        freeRadioButton.setSelected(false);
    }//GEN-LAST:event_premiumRadioButtonMouseClicked

    private void freeRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_freeRadioButtonMouseClicked
        // TODO add your handling code here:
         premiumRadioButton.setSelected(false);
    }//GEN-LAST:event_freeRadioButtonMouseClicked

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaSignUp().setVisible(true);
 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JLabel emailCadastroLabel;
    private javax.swing.JTextField emailCadastroTextField;
    private javax.swing.JRadioButton freeRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nomeCompletoCadastroLabel;
    private javax.swing.JTextField nomeCompletoTextField;
    private javax.swing.JPasswordField passwordCadastroField;
    private javax.swing.JLabel passwordCadastroLabel;
    private javax.swing.JLabel passwordTipCadastroLabel;
    private javax.swing.JLabel passwordTipCadastroLabel1;
    private javax.swing.JTextField passwordTipCadastroTextField;
    private javax.swing.JRadioButton premiumRadioButton;
    private javax.swing.JLabel usernameCadastroLabel;
    private javax.swing.JTextField usernameCadastroTextField;
    // End of variables declaration//GEN-END:variables
}

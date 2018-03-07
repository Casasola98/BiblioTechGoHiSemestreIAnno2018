
package view;

import domain.BiblioTech;
import domain.User;
import javax.swing.JOptionPane;

public class logUser extends javax.swing.JDialog {

    int registrationType;
    BiblioTech theSystem;
    
    public logUser(java.awt.Frame parent, boolean modal, int optionType, BiblioTech information) {
        super(parent, modal);
        initComponents();
        registrationType = optionType;
        theSystem = information;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        passUser = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        userField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Material Registration");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        passUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passUser.setToolTipText("User Password");

        btnLogin.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        userField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userField.setToolTipText("Username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passUser)
                            .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnLogin)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(passUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnLogin)
                .addContainerGap(37, Short.MAX_VALUE))
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

    private void errorMessage(String message){
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.WARNING_MESSAGE);
    } 
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String userName = userField.getText();
        String userPass = new String(passUser.getPassword());
        if((! theSystem.fieldIsEmpty(userName))&&(! theSystem.fieldIsEmpty(userPass))){
            if(theSystem.isCorrectUser(userName)){
                User theUser = theSystem.obtainUser(userName);
                if(theUser.isCorrectPassword(userPass)){
                    this.setVisible(false);
                    if (registrationType == 1){
                        AudiovisualRegistration theWindow = new AudiovisualRegistration(new javax.swing.JFrame(), true, theSystem);
                        theWindow.setVisible(true);
                    }
                    else{
                        BookRegistration theWindow = new BookRegistration(new javax.swing.JFrame(), true, theSystem);
                        theWindow.setVisible(true);
                    }
                    dispose();
                }else{
                    errorMessage("Wrong Password");
                }
            }else{
                errorMessage("The User ID doesn't exist");
            }
        }else{
            errorMessage("You should fill all the spaces");
        }
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passUser;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}

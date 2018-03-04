
package view;

import domain.BiblioTech;
import javax.swing.ButtonModel;

public class BookRegistration extends javax.swing.JDialog {

    BiblioTech theSystem;
    boolean isPhysic;
    
    public BookRegistration(java.awt.Frame parent, boolean modal, BiblioTech information) {
        super(parent, modal);
        initComponents();
        bookTypes.add(btnDigit);
        bookTypes.add(btnPhys);
        theSystem = information;
        isPhysic = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookTypes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        isbnFld = new javax.swing.JTextField();
        yearFld = new javax.swing.JTextField();
        editFld = new javax.swing.JTextField();
        nameFld = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnPhys = new javax.swing.JRadioButton();
        btnDigit = new javax.swing.JRadioButton();
        stockFld = new javax.swing.JTextField();
        stockLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Book Registration");

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ISBN");

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Year");

        btnRegister.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Editorial");

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name");

        btnPhys.setSelected(true);
        btnPhys.setText("Physical");
        btnPhys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhysActionPerformed(evt);
            }
        });

        btnDigit.setText("Digital");
        btnDigit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDigitActionPerformed(evt);
            }
        });

        stockLbl.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        stockLbl.setForeground(new java.awt.Color(255, 255, 255));
        stockLbl.setText("Stock");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(stockLbl))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(isbnFld)
                                    .addComponent(yearFld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(nameFld, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(editFld, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stockFld, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnDigit)
                                .addGap(18, 18, 18)
                                .addComponent(btnPhys))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(isbnFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nameFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(editFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPhys)
                    .addComponent(btnDigit))
                .addGap(18, 18, 18)
                .addComponent(btnRegister)
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String isbn = isbnFld.getText();
        String name = nameFld.getText();
        String year = yearFld.getText();
        String editorial = editFld.getText();
        String stock = stockFld.getText();
        
        boolean registerB = false;
        
        if((! theSystem.fieldIsEmpty(isbn))&&(! theSystem.fieldIsEmpty(name))
                &&(! theSystem.fieldIsEmpty(year))&&(! theSystem.fieldIsEmpty(editorial))){
            registerB = true;
        }
        
        if (isPhysic){
            if(theSystem.fieldIsEmpty(stock)){
                registerB = false;
            }
        }
        
        if(registerB){
            if(theSystem.isValidISBN(isbn)){
                if(! theSystem.existBook(isbn)){
                    if(theSystem.isNumber(year)){
                        if(isPhysic){
                            if(theSystem.isNumber(stock)){
                                theSystem.addPhysicBook(isbn, name, Integer.parseInt(year), editorial, Integer.parseInt(stock));
                                dispose();
                            }
                        }
                        else{
                            dispose();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnDigitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDigitActionPerformed
        stockLbl.setVisible(false);
        stockFld.setVisible(false);
        isPhysic = false;
    }//GEN-LAST:event_btnDigitActionPerformed

    private void btnPhysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhysActionPerformed
        stockLbl.setVisible(true);
        stockFld.setVisible(true);
        isPhysic = true;
    }//GEN-LAST:event_btnPhysActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bookTypes;
    private javax.swing.JRadioButton btnDigit;
    private javax.swing.JRadioButton btnPhys;
    private javax.swing.JButton btnRegister;
    private javax.swing.JTextField editFld;
    private javax.swing.JTextField isbnFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameFld;
    private javax.swing.JTextField stockFld;
    private javax.swing.JLabel stockLbl;
    private javax.swing.JTextField yearFld;
    // End of variables declaration//GEN-END:variables
}

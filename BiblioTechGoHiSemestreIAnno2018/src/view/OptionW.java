
package view;

import domain.BiblioTech;

public class OptionW extends javax.swing.JDialog {

    BiblioTech theSystem;
    
    public OptionW(java.awt.Frame parent, boolean modal, BiblioTech information) {
        super(parent, modal);
        initComponents();
        theSystem = information;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAudio = new javax.swing.JButton();
        btnBook = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        addAudio = new javax.swing.JMenuItem();
        addBook = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnAddStu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Dubai", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BiblioTech");

        btnAudio.setText("Reserve Audiovisual Material");
        btnAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudioActionPerformed(evt);
            }
        });

        btnBook.setText("Reserve Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        btnReturn.setText("Return Stuff");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAudio)
                .addGap(18, 18, 18)
                .addComponent(btnBook)
                .addGap(18, 18, 18)
                .addComponent(btnReturn)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jMenu1.setText("Options");

        addAudio.setText("Add Audiovisual ");
        addAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAudioActionPerformed(evt);
            }
        });
        jMenu1.add(addAudio);

        addBook.setText("Add Book");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });
        jMenu1.add(addBook);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Student");

        btnAddStu.setText("Add Student");
        btnAddStu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStuActionPerformed(evt);
            }
        });
        jMenu2.add(btnAddStu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void btnAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudioActionPerformed
        this.setVisible(false);
        ReservationW theWindow = new ReservationW(new javax.swing.JFrame(), true, 1, theSystem);
        theWindow.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_btnAudioActionPerformed

    private void addAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAudioActionPerformed
        this.setVisible(false);
        LogUser theWindow = new LogUser(new javax.swing.JFrame(), true, 1, theSystem);
        theWindow.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_addAudioActionPerformed

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        this.setVisible(false);
        LogUser theWindow = new LogUser(new javax.swing.JFrame(), true, 2, theSystem);
        theWindow.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_addBookActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        this.setVisible(false);
        ReservationW theWindow = new ReservationW(new javax.swing.JFrame(), true, 2, theSystem);
        theWindow.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_btnBookActionPerformed

    private void btnAddStuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStuActionPerformed
        this.setVisible(false);
        AddStuW theWindow = new AddStuW(new javax.swing.JFrame(), true, theSystem);
        theWindow.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_btnAddStuActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.setVisible(false);
        ReturnStuffW theWindow = new ReturnStuffW(new javax.swing.JFrame(), true, theSystem);
        theWindow.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addAudio;
    private javax.swing.JMenuItem addBook;
    private javax.swing.JMenuItem btnAddStu;
    private javax.swing.JButton btnAudio;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

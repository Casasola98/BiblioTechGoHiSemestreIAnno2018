
package view;

import domain.Audiovisual;
import domain.BiblioTech;
import domain.AudiovisualReservation;
import domain.Book;
import domain.BookReservation;
import domain.Physical;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class ReturnStuffW extends javax.swing.JDialog {

    boolean isBook;
    BiblioTech theSystem;
    
    public ReturnStuffW(java.awt.Frame parent, boolean modal, BiblioTech information) {
        super(parent, modal);
        initComponents();
        theSystem = information;
        isBook = true;
        typeGroup.add(rbtAudio);
        typeGroup.add(rbtBook);
    }

    public int daysBetween(Date d1, Date d2)
    {
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        materialFld = new javax.swing.JTextField();
        idFld = new javax.swing.JTextField();
        rbtBook = new javax.swing.JRadioButton();
        rbtAudio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Material ID");

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student ID");

        btnReturn.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        rbtBook.setSelected(true);
        rbtBook.setText("Book");
        rbtBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtBookActionPerformed(evt);
            }
        });

        rbtAudio.setText("Audiovisual");
        rbtAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtAudioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idFld)
                            .addComponent(materialFld, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(rbtBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtAudio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(materialFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtBook)
                    .addComponent(rbtAudio))
                .addGap(18, 18, 18)
                .addComponent(btnReturn)
                .addContainerGap(34, Short.MAX_VALUE))
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
 
    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        String materialID = materialFld.getText();
        String studentID = idFld.getText();
        if(rbtAudio.isSelected())
        {
            Iterator<AudiovisualReservation> iter = theSystem.getAudioReserve().iterator();
            while(iter.hasNext())
            {
                AudiovisualReservation a = iter.next();
 
                if(a.getReservedAudiov().getId().equals(materialID) && a.getTheStudent().getId().equals(studentID))
                {
                    Date currentDate = new Date();
                    Date returnDate = a.getDeliveryDate();
                    if(currentDate.before(returnDate) || currentDate.equals(returnDate))
                    {
                        JOptionPane.showMessageDialog(null, "Material Audiovisual devuelto sin inconvenientes");
                        Audiovisual audiovisual = a.getReservedAudiov();
                        audiovisual.increaseStock(1);
                        iter.remove();
                        break;
                    }
                    else
                    {
                        int multa = theSystem.getFine() * daysBetween(currentDate,returnDate);
                        JOptionPane.showMessageDialog(null, "Debe pagar " + Integer.toString(multa) + " colones de multa");
                        Audiovisual audiovisual = a.getReservedAudiov();
                        audiovisual.increaseStock(1);
                        iter.remove();
                        break;
                    }
                }
            }
        }
        else
        {
            Iterator<BookReservation> iter = theSystem.getBookReserve().iterator();
            while(iter.hasNext())
            {
                BookReservation b = iter.next();
                if(b.getReservedBook().getIsbn().equals(materialID) && b.getTheStudent().getId().equals(studentID))
                {
                    Date currentDate = new Date();
                    Date returnDate = b.getDeliveryDate();
                    if(currentDate.before(returnDate) || currentDate.equals(returnDate))
                    {
                        JOptionPane.showMessageDialog(null, "Libro devuelto sin inconvenientes");
                        Book book = b.getReservedBook();
                        System.out.println(book.getType());
                        if(book.getType().equals("physic"))
                        {
                            Physical p = (Physical)book;
                            p.increaseStock(1);
                        }
                        iter.remove();
                        //theSystem.getBookReserve().remove(b);
                        dispose();
                    }
                    else
                    {
                        int multa = theSystem.getFine() * daysBetween(currentDate,returnDate);
                        JOptionPane.showMessageDialog(null, "Debe pagar " + Integer.toString(multa) + " colones de multa");
                        Book book = b.getReservedBook();
                        if(book.getType().equals("physic"))
                        {
                            Physical p = (Physical)book;
                            p.increaseStock(1);
                        }
                        iter.remove();
                        //theSystem.getBookReserve().remove(b);
                        dispose();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void rbtAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtAudioActionPerformed
        isBook = false;
    }//GEN-LAST:event_rbtAudioActionPerformed

    private void rbtBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtBookActionPerformed
        isBook = true;
    }//GEN-LAST:event_rbtBookActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JTextField idFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField materialFld;
    private javax.swing.JRadioButton rbtAudio;
    private javax.swing.JRadioButton rbtBook;
    private javax.swing.ButtonGroup typeGroup;
    // End of variables declaration//GEN-END:variables
}

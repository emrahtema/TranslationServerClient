package classes;

import java.awt.Image;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class TranslationClient extends javax.swing.JFrame {
    //framedeki komponentlere erişim için satatik oyun değişkeni
    public static TranslationClient ThisClient;

    public TranslationClient() {
        initComponents();
        ThisClient = this;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        toTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        fromTextArea = new javax.swing.JTextArea();
        toComboBox = new javax.swing.JComboBox<>();
        fromComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Translator");
        setMaximumSize(new java.awt.Dimension(803, 500));
        setMinimumSize(new java.awt.Dimension(803, 500));
        setPreferredSize(new java.awt.Dimension(803, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(803, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/translate.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 100, 40));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(300, 400));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(300, 400));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 400));

        toTextArea.setColumns(20);
        toTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toTextArea.setRows(5);
        toTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        toTextArea.setMaximumSize(new java.awt.Dimension(300, 350));
        toTextArea.setMinimumSize(new java.awt.Dimension(300, 350));
        toTextArea.setPreferredSize(new java.awt.Dimension(300, 350));
        toTextArea.setSelectionColor(new java.awt.Color(255, 51, 255));
        jScrollPane1.setViewportView(toTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 320, 390));

        jScrollPane2.setMaximumSize(new java.awt.Dimension(300, 400));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(300, 400));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(300, 400));

        fromTextArea.setColumns(20);
        fromTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fromTextArea.setRows(5);
        fromTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fromTextArea.setMaximumSize(new java.awt.Dimension(300, 350));
        fromTextArea.setMinimumSize(new java.awt.Dimension(300, 350));
        fromTextArea.setPreferredSize(new java.awt.Dimension(300, 350));
        fromTextArea.setSelectionColor(new java.awt.Color(255, 51, 255));
        jScrollPane2.setViewportView(fromTextArea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 320, 390));

        toComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turkish", "English", "Albanian", "Armenian", "Azerbaijani", "Belarusian", "Bulgarian", "Catalan", "Croatian", "Czech", "Danish", "Dutch", "Estonian", "Finnish", "French", "German", "Georgian", "Greek", "Hungarian", "Italian", "Latvian", "Lithuanian", "Macedonian", "Norwegian", "Polish", "Portuguese", "Romanian", "Russian", "Serbian", "Slovak", "Slovenian", "Spanish", "Swedish", "Ukrainian" }));
        getContentPane().add(toComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 130, 30));

        fromComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fromComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Turkish", "Albanian", "Armenian", "Azerbaijani", "Belarusian", "Bulgarian", "Catalan", "Croatian", "Czech", "Danish", "Dutch", "Estonian", "Finnish", "French", "German", "Georgian", "Greek", "Hungarian", "Italian", "Latvian", "Lithuanian", "Macedonian", "Norwegian", "Polish", "Portuguese", "Romanian", "Russian", "Serbian", "Slovak", "Slovenian", "Spanish", "Swedish", "Ukrainian" }));
        getContentPane().add(fromComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ok.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.png"))); // NOI18N
        jLabel1.setText(".");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Client.Start("127.0.0.1", 2000);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Message msg = new Message(Message.Message_Type.REQUEST);
        msg.content = fromComboBox.getSelectedItem().toString()+"|"+
                toComboBox.getSelectedItem().toString()+"|"+
                fromTextArea.getText();
        Client.Send(msg);
        }catch(Exception e){
            fromTextArea.setText("Server ile bağlantı kurulamadı. Daha sonra deneyin.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TranslationClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TranslationClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TranslationClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TranslationClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TranslationClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> fromComboBox;
    private javax.swing.JTextArea fromTextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> toComboBox;
    public static javax.swing.JTextArea toTextArea;
    // End of variables declaration//GEN-END:variables
}
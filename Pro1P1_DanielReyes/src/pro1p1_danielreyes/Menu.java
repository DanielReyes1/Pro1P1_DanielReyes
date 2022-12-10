/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pro1p1_danielreyes;




/**
 *
 * @author alema
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Foto = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        Recursion = new javax.swing.JButton();
        Labotify = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        Foto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe Script", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FRANCIA GANARÁ EL MUNDIAL");
        Foto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 500, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/Mbappe2.jpg"))); // NOI18N
        Foto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe Print", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FRANCIA GANARÁ EL MUNDIAL");
        jDialog1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setText("Aceptar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jDialog1.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/Mbappe2.jpg"))); // NOI18N
        jDialog1.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe Print", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menu");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 170, -1));

        Salir.setBackground(new java.awt.Color(255, 204, 204));
        Salir.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 102, 102));
        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 200, 50));

        Recursion.setBackground(new java.awt.Color(204, 204, 255));
        Recursion.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        Recursion.setForeground(new java.awt.Color(102, 102, 255));
        Recursion.setText("Recursión");
        Recursion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecursionMouseClicked(evt);
            }
        });
        getContentPane().add(Recursion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 200, 50));

        Labotify.setBackground(new java.awt.Color(204, 204, 255));
        Labotify.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        Labotify.setForeground(new java.awt.Color(102, 102, 255));
        Labotify.setText("Labotify");
        Labotify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabotifyMouseClicked(evt);
            }
        });
        Labotify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabotifyActionPerformed(evt);
            }
        });
        getContentPane().add(Labotify, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 200, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -300, 530, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LabotifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabotifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LabotifyActionPerformed

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void LabotifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabotifyMouseClicked
        String song = "", album = "", artist = "";
        int year = 0, length = 0;
        Cancion opcion1 = new Cancion(song, album, artist, year, length);
        opcion1.Labotify();
        this.dispose();

    }//GEN-LAST:event_LabotifyMouseClicked

    private void RecursionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecursionMouseClicked
        jDialog1.setVisible(true);
        jDialog1.pack();
        jDialog1.setLocationRelativeTo(this);
        jDialog1.setAlwaysOnTop(true);
        this.setVisible(false);
    }//GEN-LAST:event_RecursionMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jDialog1.setVisible(false);
        this.dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

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
    private javax.swing.JPanel Foto;
    private javax.swing.JButton Labotify;
    private javax.swing.JButton Recursion;
    private javax.swing.JButton Salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}

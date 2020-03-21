/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tragamonedassp;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;


public class JFRtragamonedas extends javax.swing.JFrame {
     int aleatorio1, aleatorio2, aleatorio3,condicion1,condicion2,aleatorio,x=0,valor1,valor2,valor3,valortotal,saldo;
    Timer temporizador = new Timer(100, new ActionListener()
        {
            
            public void actionPerformed(ActionEvent e)
            {
                
                aleatorio1=(int)(Math.random()*10+1);
                aleatorio2=(int)(Math.random()*10+1);
                aleatorio3=(int)(Math.random()*10+1);                   
                    switch(aleatorio1)
                    {
                        case 1: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("amarillo.png")));
                        valor1=1;
                            break;
                        case 2: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("azul.png")));
                        valor1=1;                        
                            break;
                        case 3: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("azulrayada.png")));
                        valor1=1;
                            break;
                        case 4: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("cereza.png")));
                        valor1=1;
                            break;
                        case 5: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("dona.png")));
                        valor1=3;
                            break;
                        case 6: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("morado.png")));
                        valor1=1;
                            break;
                        case 7: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("rojarayada.png")));
                        valor1=1;
                            break;
                        case 8: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("rojo.png")));
                        valor1=1;
                            break;
                        case 9: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("tomate.png")));
                        valor1=1;
                            break;
                        case 10: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("verde.png")));
                        valor1=1;
                            break;


                        }
                    condicion1+=1;

                    if (condicion1==5)
                    {
                        switch (aleatorio2)
                        {
                        case 1: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("amarillo.png")));
                        valor2=1;
                            break;
                        case 2: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("azul.png")));
                        valor2=1;
                            break;
                        case 3: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("azulrayada.png")));
                        valor2=1;
                            break;
                        case 4: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("cereza.png")));
                        valor2=1;
                            break;
                        case 5: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("dona.png")));
                        valor2=3;
                            break;
                        case 6: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("morado.png")));
                        valor2=1;
                            break;
                        case 7: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("rojarayada.png")));
                        valor2=1;
                            break;
                        case 8: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("rojo.png")));
                        valor2=1;
                            break;
                        case 9: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("tomate.png")));
                        valor2=1;
                            break;
                        case 10: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("verde.png")));
                        valor2=1;
                            break;

                        }
                    condicion1=0;
                    condicion2+=1;
                    }

                    if (condicion2==5)
                    {
                        switch (aleatorio3)
                        {
                        case 1: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("amarillo.png")));
                        valor3=1;
                            break;
                        case 2: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("azul.png")));
                        valor3=1;
                            break;
                        case 3: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("azulrayada.png")));
                        valor3=1;
                            break;
                        case 4: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("cereza.png")));
                        valor3=1;
                            break;
                        case 5: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("dona.png")));
                        valor3=3;
                            break;
                        case 6: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("morado.png")));
                        valor3=1;
                            break;
                        case 7: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("rojarayada.png")));
                        valor3=1;
                            break;
                        case 8: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("rojo.png")));
                        valor3=1;
                            break;
                        case 9: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("tomate.png")));
                        valor3=1;
                            break;
                        case 10: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("verde.png")));
                        valor3=1;
                            break;
                        }
                     condicion2=0;
                    }
                    
                    x+=1;
                    if (x==aleatorio)
                        {
                            temporizador.stop();
                            AudioClip sonido;        
                            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/tragamonedassp/MTM.wav"));
                            sonido.stop(); 
                            x=0;
                        }
                    
                  
                    
                               
                
                
            } 
            
        });
    

    /**
     * Creates new form JFRtragamonedas
     */
    public JFRtragamonedas() {
        initComponents();
    }
     public void paint(Graphics g)
    {
        super.paint(g);
                
        g.drawRect(20, 250, 400, 170);  
        g.drawLine(20, 295, 420, 295);
        g.drawLine(20, 325, 420, 325);
        g.drawLine(20,355, 420, 355);
        g.drawLine(20,385, 420, 385);
               
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblimagen1 = new javax.swing.JLabel();
        lblimagen2 = new javax.swing.JLabel();
        lblimagen3 = new javax.swing.JLabel();
        cbxApuesta = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        btmStart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtGanado = new javax.swing.JTextField();
        jtxtPerdido = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        lblimagen1.setBackground(new java.awt.Color(255, 0, 51));
        getContentPane().add(lblimagen1);
        lblimagen1.setBounds(10, 11, 160, 170);

        lblimagen2.setBackground(new java.awt.Color(255, 0, 51));
        getContentPane().add(lblimagen2);
        lblimagen2.setBounds(180, 10, 140, 170);
        getContentPane().add(lblimagen3);
        lblimagen3.setBounds(330, 10, 150, 170);

        cbxApuesta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5$", "10$", "20$", "50$", "100$" }));
        cbxApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxApuestaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxApuesta);
        cbxApuesta.setBounds(250, 240, 100, 20);

        jLabel4.setText("APUESTA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 240, 80, 14);

        jLabel5.setText("SALDO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 270, 60, 20);

        txtSaldo.setText("100");
        getContentPane().add(txtSaldo);
        txtSaldo.setBounds(250, 270, 100, 20);

        btmStart.setText("Start");
        btmStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmStartActionPerformed(evt);
            }
        });
        getContentPane().add(btmStart);
        btmStart.setBounds(150, 360, 100, 23);

        jLabel1.setText("TOTAL GANADO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 290, 90, 30);

        jLabel2.setText("TOTAL PERDIDO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 330, 120, 14);

        jtxtGanado.setText("0");
        getContentPane().add(jtxtGanado);
        jtxtGanado.setBounds(250, 300, 100, 20);

        jtxtPerdido.setText("0");
        getContentPane().add(jtxtPerdido);
        jtxtPerdido.setBounds(250, 330, 100, 20);

        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 230, 73, 150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmStartActionPerformed
    temporizador.start();
    aleatorio=(int)(Math.random()*99+1);
    
    System.out.print(aleatorio);
    AudioClip sonido;        
    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/tragamonedassp/MTM.wav"));
    sonido.play(); 
    
    }//GEN-LAST:event_btmStartActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
               // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    jtxtGanado.setText(valueOf(0)); 
    jtxtPerdido.setText(valueOf(0));
    jtxtPerdido.setText(valueOf(100));
    lblimagen1.setIcon(new ImageIcon(this.getClass().getResource(" ")));
    lblimagen2.setIcon(new ImageIcon(this.getClass().getResource(" ")));
    lblimagen3.setIcon(new ImageIcon(this.getClass().getResource(" ")));
    
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxApuestaActionPerformed
     
         // TODO add your handling code here:
    }//GEN-LAST:event_cbxApuestaActionPerformed

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
            java.util.logging.Logger.getLogger(JFRtragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRtragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRtragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRtragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRtragamonedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmStart;
    private javax.swing.JComboBox cbxApuesta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jtxtGanado;
    private javax.swing.JTextField jtxtPerdido;
    private javax.swing.JLabel lblimagen1;
    private javax.swing.JLabel lblimagen2;
    private javax.swing.JLabel lblimagen3;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables

    private String valueOf(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

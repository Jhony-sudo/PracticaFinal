
package ventanas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import usuarios.Jugadores;


public class Estadisticas extends javax.swing.JFrame {
     
     FondoPanel FondoPanel = new FondoPanel();
    public Estadisticas() {
        this.setContentPane(FondoPanel);
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Boton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        jLabel2.setText("Estadisticas");

        Boton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton1.setText("Salir");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {Jugadores.getParticipantes(0).getId(),Jugadores.getParticipantes(0).getNombre(),Jugadores.getParticipantes(0).getPartidasJugadas(),Jugadores.getParticipantes(0).getPartidasGanadas(),Jugadores.getParticipantes(0).getPartidasPerdias()},
                {Jugadores.getParticipantes(1).getId(),Jugadores.getParticipantes(1).getNombre(),Jugadores.getParticipantes(1).getPartidasJugadas(),Jugadores.getParticipantes(1).getPartidasGanadas(),Jugadores.getParticipantes(1).getPartidasPerdias()},
                {Jugadores.getParticipantes(2).getId(),Jugadores.getParticipantes(2).getNombre(),Jugadores.getParticipantes(2).getPartidasJugadas(),Jugadores.getParticipantes(2).getPartidasGanadas(),Jugadores.getParticipantes(2).getPartidasPerdias()},
                {Jugadores.getParticipantes(3).getId(),Jugadores.getParticipantes(3).getNombre(),Jugadores.getParticipantes(3).getPartidasJugadas(),Jugadores.getParticipantes(3).getPartidasGanadas(),Jugadores.getParticipantes(3).getPartidasPerdias()},
                {Jugadores.getParticipantes(4).getId(),Jugadores.getParticipantes(4).getNombre(),Jugadores.getParticipantes(4).getPartidasJugadas(),Jugadores.getParticipantes(4).getPartidasGanadas(),Jugadores.getParticipantes(4).getPartidasPerdias()},
                {Jugadores.getParticipantes(5).getId(),Jugadores.getParticipantes(5).getNombre(),Jugadores.getParticipantes(5).getPartidasJugadas(),Jugadores.getParticipantes(5).getPartidasGanadas(),Jugadores.getParticipantes(5).getPartidasPerdias()},
                {Jugadores.getParticipantes(6).getId(),Jugadores.getParticipantes(6).getNombre(),Jugadores.getParticipantes(6).getPartidasJugadas(),Jugadores.getParticipantes(6).getPartidasGanadas(),Jugadores.getParticipantes(6).getPartidasPerdias()},
                {Jugadores.getParticipantes(7).getId(),Jugadores.getParticipantes(7).getNombre(),Jugadores.getParticipantes(7).getPartidasJugadas(),Jugadores.getParticipantes(7).getPartidasGanadas(),Jugadores.getParticipantes(7).getPartidasPerdias()},
                {Jugadores.getParticipantes(8).getId(),Jugadores.getParticipantes(8).getNombre(),Jugadores.getParticipantes(8).getPartidasJugadas(),Jugadores.getParticipantes(8).getPartidasGanadas(),Jugadores.getParticipantes(8).getPartidasPerdias()},
                {Jugadores.getParticipantes(9).getId(),Jugadores.getParticipantes(9).getNombre(),Jugadores.getParticipantes(9).getPartidasJugadas(),Jugadores.getParticipantes(9).getPartidasGanadas(),Jugadores.getParticipantes(9).getPartidasPerdias()},
                {Jugadores.getParticipantes(10).getId(),Jugadores.getParticipantes(10).getNombre(),Jugadores.getParticipantes(10).getPartidasJugadas(),Jugadores.getParticipantes(10).getPartidasGanadas(),Jugadores.getParticipantes(10).getPartidasPerdias()}
            },
            new String [] {
                "Id","Nombre", "P. Jugadas", "P. Ganadas", "P. Perdidas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class,java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(Tabla);

        Boton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton2.setText("GuardarInf");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Boton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton3.setText("ExportarInf");
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton2)
                    .addComponent(Boton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Boton1)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();  
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadisticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
 class FondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/imagenes/FondoJugador.jpg")).getImage();
            
            g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
 
  
}

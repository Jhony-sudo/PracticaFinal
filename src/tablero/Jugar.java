
package tablero;

import java.awt.Color;
import static java.awt.Color.red;
import usuarios.Jugador;
import javax.swing.JOptionPane;
import usuarios.Jugadores;
import ventanas.Menu;

public  class Jugar extends javax.swing.JFrame {
    private static int NoJugadores;
    private static Jugador [] Jugones;
    Dado Dado1 = new Dado();
    public  Tablero Tablero1 = new Tablero(6,6);
    public static int Ronda;
    private Ficha[] fichas;
    static int Jugador = 0;
    
    public Jugar(int NoJugadores,String Direccion) {
        this.NoJugadores = NoJugadores;
        fichas = new Ficha[NoJugadores];
        Jugones = new Jugador[NoJugadores];
        LlenarFichas();
        initComponents();
        Tablero1.IniciarConArchivo(Direccion);
        Jugar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Avanzar = new javax.swing.JButton();
        Text = new javax.swing.JLabel();
        Avanzar1 = new javax.swing.JButton();
        Inf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Avanzar.setText("Avanzar");
        Avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvanzarActionPerformed(evt);
            }
        });

        Text.setText("jLabel1");
        Text.setText("Ronda: " + Ronda);

        Avanzar1.setText("SALIR");
        Avanzar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Avanzar1ActionPerformed(evt);
            }
        });

        Inf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Text.setText("Ronda: " + Ronda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(Text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 571, Short.MAX_VALUE)
                .addComponent(Avanzar1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Inf, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Avanzar)
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Avanzar1)))
                .addGap(242, 242, 242)
                .addComponent(Avanzar)
                .addGap(54, 54, 54)
                .addComponent(Inf, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvanzarActionPerformed
        Inf.setText("Turno " + Jugones[Jugador].getNombre());
        if(Jugones[Jugador].getFicha().Ronda == 0){
            Tablero1.Avanzar(Jugones[Jugador].getFicha());
        }
        else{
            Tablero1.AvanzarRonda(Jugones[Jugador].getFicha());
            Tablero1.Comprobar(Jugones[Jugador].getFicha(),Inf);
            //if(Dado.ValorDado == 6){
            //Tablero1.AvanzarRonda(fichas[Jugador]);
            //}
            Ronda++;
        }
        Text.setText("Ronda: " + Ronda);
        
        FinalizarPartida();
        
        if(Jugador>= (NoJugadores-1)){
            
        Jugador = 0;
        }
        else{
        Jugador++;
        }
    }//GEN-LAST:event_AvanzarActionPerformed

    private void Avanzar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Avanzar1ActionPerformed
       Menu m = new Menu();
       m.setVisible(true);
        dispose();
    }//GEN-LAST:event_Avanzar1ActionPerformed

    
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugar(2).setVisible(true);
            }
        });
    } */
    public void Jugar(){ 
        this.add(Dado1);
        this.add(Tablero1);
        Dado1.setVisible(true);
        Tablero1.setVisible(true);
       
        
    }
    
    public boolean FinalizarPartida(){
        Color colorfinal = Tablero1.getBoton(0, 0).getBackground();
        boolean res = false;
        if(colorfinal == red || colorfinal == Color.BLUE || colorfinal == Color.GREEN || colorfinal == Color.yellow || colorfinal == Color.magenta || colorfinal == Color.darkGray ){
            Ronda = 0;
            Tablero1.getBoton(0,0).setText("WIN!!");
            //JOptionPane.showMessageDialog(null,"El juego ha terminado");
            Object [] opciones ={"Aceptar"};
            int eleccion = JOptionPane.showOptionDialog(null,"El Juego ha terminado gana fichas " + colorfinal,"Enhorabuena",
             JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,null,opciones,"Salir");
             if (eleccion == JOptionPane.YES_OPTION)
            {
                Menu m = new Menu();
                m.setVisible(true);
             System.exit(0);
            }else{
            }
             res = true;
            }
        
        if(colorfinal == red){
            Jugones[0].setPartidasGanadas(Jugones[0].getPartidasGanadas() + 1);
        }
        return res;
       
        
    }
    
    public void LlenarFichas(){
        Color color1 = Color.BLUE;
        Color color2 = Color.red;
        Color color3 = Color.GREEN;
        Color color4 = Color.yellow;
        Color color5 = Color.magenta;
        Color color6 = Color.darkGray;
       
        for(int i=0;i<NoJugadores;i++){
            
            switch(i){
                
                case 0 :
                   fichas[i] = new Ficha(color1);
                   Jugones[i] = Jugadores.getParticipantes(i);
                   Jugones[i].setFicha(fichas[i]);
                   Jugones[i].setPartidasJugadas(Jugones[i].getPartidasJugadas() + 1);
                   break;
                case 1:
                    Jugones[i] = Jugadores.getParticipantes(i);
                   fichas[i] = new Ficha(color2);
                   Jugones[i].setFicha(fichas[i]);
                   Jugones[i].setPartidasJugadas(Jugones[i].getPartidasJugadas() + 1);
                    break;
                case 2: 
                    Jugones[i] = Jugadores.getParticipantes(i);
                    fichas[i] = new Ficha(color3);
                   Jugones[i].setFicha(fichas[i]);
                   Jugones[i].setPartidasJugadas(Jugones[i].getPartidasJugadas() + 1);
                    break;
                case 3:
                    Jugones[i] = Jugadores.getParticipantes(i);
                    fichas[i] = new Ficha(color4);
                   Jugones[i].setFicha(fichas[i]);
                   Jugones[i].setPartidasJugadas(Jugones[i].getPartidasJugadas() + 1);
                    break;
                case 4: 
                    Jugones[i] = Jugadores.getParticipantes(i);
                    fichas[i] = new Ficha(color5);
                   Jugones[i].setFicha(fichas[i]);
                   Jugones[i].setPartidasJugadas(Jugones[i].getPartidasJugadas() + 1);
                    break;
                case 5:
                    Jugones[i] = Jugadores.getParticipantes(i);
                    fichas[i] = new Ficha(color6);
                   Jugones[i].setFicha(fichas[i]);
                   Jugones[i].setPartidasJugadas(Jugones[i].getPartidasJugadas() + 1);
                    break;
                default:
                break;
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Avanzar;
    private javax.swing.JButton Avanzar1;
    private javax.swing.JLabel Inf;
    private javax.swing.JLabel Text;
    // End of variables declaration//GEN-END:variables
}

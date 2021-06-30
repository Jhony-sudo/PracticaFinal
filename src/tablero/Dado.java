package tablero;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.util.Random;
import java.awt.event.MouseListener;
public class Dado extends javax.swing.JButton {
    
    private static Random r = new Random();
    public static int ValorDado;
    private JButton Dado = new JButton();
    public static int Resultado;
    public Dado(  ){
        this.setSize(120, 120);
        this.setLocation(800, 150);
        Eventos();
    }
    
    
    public void Eventos(){
        this.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        this.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                PararDado(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
              IniciarDado(e);  
            }
            
        });
    }
    
    public void IniciarDado(MouseEvent e){
        this.setText("Girando Dado");
        
       // Panel.FinalizarPartida();
    }
    
    public  void PararDado(MouseEvent e){
        ValorDado = GirarDado(); //r.nextInt(6)+1;
        String Res = ValorDado + "";
        this.setText(Res);
        Resultado = ValorDado;
         
         //Panel.FinalizarPartida();
         
    }
    
    public static int GirarDado(){
        int valor = r.nextInt(6)+1;
        
        return valor;
    }
    
}

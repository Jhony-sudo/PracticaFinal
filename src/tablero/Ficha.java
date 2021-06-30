package tablero;
import java.awt.Color;

public class Ficha {
    private Color ColorFicha;
    private int Posicionx;
    private int Posiciony;
    private int PosicionxFinal;
    private int PosicionyFinal;
    private int NoFila = 0;
    public int Ronda = 0;
    
    public Ficha(Color color){
        this.ColorFicha = color;
        
    }

    public int getPosicionx() {
        return Posicionx;
    }

    public void setPosicionx(int Posicionx) {
        this.Posicionx = Posicionx;
    }

    public int getPosiciony() {
        return Posiciony;
    }

    public void setPosiciony(int Posiciony) {
        this.Posiciony = Posiciony;
    }

    public Color getColorFicha() {
        return ColorFicha;
    }

    public void setColorFicha(Color ColorFicha) {
        this.ColorFicha = ColorFicha;
    }

    public int getNoFila() {
        return NoFila;
    }

    public void setNoFila(int NoFila) {
        this.NoFila = NoFila;
    }

    public int getPosicionxFinal() {
        return PosicionxFinal;
    }

    public void setPosicionxFinal(int PosicionxFinal) {
        this.PosicionxFinal = PosicionxFinal;
    }

    public int getPosicionyFinal() {
        return PosicionyFinal;
    }

    public void setPosicionyFinal(int PosicionyFinal) {
        this.PosicionyFinal = PosicionyFinal;
    }
    
    public void setRonda(int ronda){
        this.Ronda = ronda;
    }
    
    
    
    
   
    
}

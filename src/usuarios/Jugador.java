package usuarios;
import tablero.Ficha;

public class Jugador {
 private String Nombre;
 private String Apellido;
 private int Id;
 private int PartidasJugadas;
 private int PartidasGanadas;
 private int PartidasPerdias;
 private Ficha ficha;
    public Jugador(String Nombre, String Apellido, int Id) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Id = Id;
        this.PartidasJugadas = 0;
        this.PartidasGanadas = 0;
        this.PartidasPerdias = 0;
    }

    public Jugador(){
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getPartidasJugadas() {
        return PartidasJugadas;
    }

    public void setPartidasJugadas(int PartidasJugadas) {
        this.PartidasJugadas = PartidasJugadas;
    }

    public int getPartidasGanadas() {
        return PartidasGanadas;
    }

    public void setPartidasGanadas(int PartidasGanadas) {
        this.PartidasGanadas = PartidasGanadas;
    }

    public int getPartidasPerdias() {
        return PartidasPerdias;
    }

    public void setPartidasPerdias(int PartidasPerdias) {
        this.PartidasPerdias = PartidasPerdias;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }
    
    
    
    
    
    
    
 
}

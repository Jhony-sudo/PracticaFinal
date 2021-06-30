package usuarios;
public class Jugadores extends Jugador{
    private static Jugador[] Participantes = new Jugador[11];
    private static int Posicion = 0;
    public static void CrearJugador(String Nombre, String Apellido, int Id){
        Participantes[Posicion] = new Jugador(Nombre,Apellido,Id);
    }

    public static int getPosicion() {
        return Posicion;
    }

    public static void setPosicion(int Posicion) {
        Jugadores.Posicion = Posicion;
    }

    public static Jugador getParticipantes(int i) {
        return Participantes[i];
    }

    public static void setParticipantes(Jugador[] Participantes) {
        Jugadores.Participantes = Participantes;
    }
    
    
    
    public static void iniciarArreglo(){
        for(int i =0 ;i<11 && i>=Posicion;i++){
            Participantes[i] = new Jugador("","",0);
        }
    }
    
    public Jugador getJugador(int id){
        Jugador jugador = null;
        for(int i = 0;i<Posicion;i++){
            if(id == Participantes[i].getId()){
                jugador = Participantes[i];
            }
        }
        return jugador;
    }
}

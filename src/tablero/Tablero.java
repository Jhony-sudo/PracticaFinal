package tablero;


import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import manejoarchivo.LeerArchivo;


public class Tablero extends JPanel{
    private  int Filas;
    private  int Columnas;
    private  JButton [][] Tabla;
    public  int Escaleras = 0;
    public  int Bajadas = 0;
    //static Ficha ficha1 = new Ficha(Color.red);
    
    public Tablero(int Fila,int Columna){
        this.setLayout(null);
        this.Filas = Fila;
        this.Columnas = Columna;
        this.setSize(750,650);
        this.setLocation(10, 10);
        this.setBackground(Color.black);
    }
    
    public void IniciarTablero(int Fila,int Columna){
        this.Filas = Fila;
        this.Columnas = Columna;
    int Alto = this.getHeight()/Filas;
    int Ancho = this.getWidth()/Columnas;
    int Posiciony = 0; 
    Tabla = new JButton[Filas][Columnas];
    for(int i =0;i<Filas;i++){
        int Posicionx = 0;
        for(int j = 0;j<Columnas;j++){
            Tabla[i][j] = new JButton(i+"" + j);
            Tabla[i][j].setBounds(Posicionx, Posiciony, Ancho, Alto);
            Tabla[i][j].setVisible(true);
            Posicionx += Ancho;
            this.add(Tabla[i][j]);
            
            
        }
        Posiciony += Alto;
    }
    
        
        
    }
    
    public void IniciarConArchivo(String Direccion){
    LeerArchivo.LeerArchivo(Direccion, this);
    
       // LeerArchivo.LeerArchivo("C:\\\\Users\\\\ROM\\\\Desktop\\\\JHONY\\\\ING\\\\TERCER SEMESTRE\\\\IPC1\\\\VAQUERAS\\\\proyectos\\\\Proyecto Final\\\\Prueba.txt", this);
    }
    
    public  void Avanzar(Ficha ficha1){
        if(Dado.ValorDado == 1){
        Tabla[Filas-1][0].setBackground(ficha1.getColorFicha());
        Tabla[3][2].setBackground(Tabla[0][0].getBackground());
        ficha1.setPosicionx(Filas-1);
        ficha1.setPosiciony(0);
        ficha1.setPosicionxFinal(Filas-1);
        ficha1.setPosicionyFinal(0);
        ficha1.setRonda(ficha1.Ronda + 1);
        }
    }
    
    public void AvanzarRonda(Ficha ficha1){
        int PosxInicial = ficha1.getPosicionx();
        int PosyInicial = ficha1.getPosiciony();
        int PosxFinal = ficha1.getPosicionxFinal();
        int PosYFinal = ficha1.getPosicionyFinal();
        int res = 0;
        if(ficha1.getNoFila()%2 == 0){
            if(Dado.ValorDado != 0){
            PosYFinal = PosyInicial + Dado.ValorDado;}
            if(PosYFinal > (Columnas - 1)){
                ficha1.setNoFila(ficha1.getNoFila() + 1);
                res =  PosYFinal - (Columnas-1);
                
                //PosYFinal = res -1;
                PosxFinal--;
                ficha1.setPosicionx(PosxFinal);
                ficha1.setPosicionxFinal(ficha1.getPosicionxFinal()-1);
                AvanzarImpar(PosxFinal,PosYFinal,PosyInicial,PosxInicial,res,true,ficha1);
            }
            if(PosYFinal<Columnas){
                
                Tabla[PosxFinal][PosYFinal].setBackground(ficha1.getColorFicha());
                Tabla[PosxInicial][PosyInicial].setBackground(Tabla[0][0].getBackground());
                ficha1.setPosiciony(PosYFinal);
                ficha1.setPosicionx(PosxFinal);
                
            }
                
        }
        else{
             AvanzarImpar(PosxFinal,ficha1.getPosiciony(),PosyInicial,PosxInicial,res,true,ficha1);
        }
        
    }
    public void AvanzarImpar(int PosxFinal, int PosYFinal, int PosyInicial,int PosxInicial,int res,boolean Par,Ficha ficha1){
            if(Par){
                System.out.println("Valor dado impar" + Dado.ValorDado);
                System.out.println("Posicionyinicial " + PosyInicial);
            PosYFinal = PosyInicial - Dado.ValorDado;
                System.out.println("Posicionyfinal " + PosYFinal);
                if(res > 0){
                     PosYFinal = Columnas - res;
                }
            System.out.println("a" + PosYFinal);
            
                if(PosYFinal < 0 ){
                ficha1.setNoFila(ficha1.getNoFila() + 1);
                res = -PosYFinal;
                ficha1.setPosicionxFinal(ficha1.getPosicionxFinal() - 1);
                ficha1.setPosicionyFinal(res-1);
                //ficha1.setPosiciony(ficha1.getPosicionyFinal());
                Dado.ValorDado = 0;
                AvanzarRonda(ficha1);
                 } 
                else{
                     Tabla[PosxFinal][PosYFinal].setBackground(ficha1.getColorFicha());
                     Tabla[PosxInicial][PosyInicial].setBackground(Tabla[0][0].getBackground());
                     ficha1.setPosiciony(PosYFinal);
                     ficha1.setPosicionx(PosxFinal);
                }
            }
            
    }
    
    public Icon PintarFicha(String Url,JButton Boton){
        ImageIcon icon = new ImageIcon(getClass().getResource(Url));
        int Ancho = Boton.getWidth();
        int Alto = Boton.getHeight();
        
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(Ancho, Alto, Image.SCALE_DEFAULT));
        
        return icono;
    }
    
    public JButton getBoton(int x, int y){
        return Tabla[x][y];
    }
    
    public void TiraDado(int Fila,int Columna){
        Tabla[Fila][Columna].setText("TIRADADO");
    }
    
    public void PierdeTurno(int Fila,int Columna){
        Tabla[Fila][Columna].setText("PIERDETURNO");
    }
    
    public  void Avanza(int Fila,int Columna,int Cantidad){
     Tabla[Fila][Columna].setText("AVANZA" + Cantidad);  
    }
    
    public void Retrocede(int Fila, int Columna, int Cantidad){
     Tabla[Fila][Columna].setText("ATRAS" + Cantidad);
    
    }
    public void subida(int Filai, int Columnai, int Filaf,int Columnaf){
        String NOMBRE = "SUBES" + Escaleras;
        String FNOMBRE = "FINS"+Escaleras;
        System.out.println(NOMBRE);
        Tabla[Filai][Columnai].setText(NOMBRE);
        Tabla[Filaf][Columnaf].setText(FNOMBRE);
        Escaleras++;
        
    }
    public void Bajada(int Filai, int Columnai, int Filaf,int Columnaf,int x,int y){
        Tabla[Filai][Columnai].setText("BAJAS" + Bajadas);
        Tabla[Filaf][Columnaf].setText("FINB"+ Bajadas);
        Bajadas++;
        
    }
    
    public void Comprobar(Ficha ficha){
        int x = ficha.getPosicionx();
        int y = ficha.getPosiciony();
        int xfinal;
        int yfinal;
        for(int i = 0;i<Bajadas;i++){
            String n = "BAJAS"+i;
        if(Tabla[x][y].getText().equals(n)){
            for(int z =0;z<Filas;z++){
                for(int j=0;j<Columnas;j++){
                    String f = "FINB"+i;
                    if(Tabla[z][j].getText().equals(f)){
                        xfinal = z;
                        yfinal = j;
                        
                         ficha.setPosicionxFinal(xfinal);
                         ficha.setPosicionyFinal(yfinal);

                         Dado.ValorDado = 0;
                         ficha.setNoFila(ficha.getNoFila()+1);
                         AvanzarRonda(ficha);
                         ficha.setNoFila(ficha.getNoFila()+1);
                         //AvanzarImpar(xfinal,yfinal,ficha.getPosiciony(),ficha.getPosicionx(),0,true,ficha);
                         System.out.println("Comprobado" + z + "   " + j);
                         System.out.println("posicion x " + xfinal);
                         System.out.println("posicion y" + yfinal);
                    }
                }
            }
        }
        }
        for(int i =0;i<=Escaleras;i++){
            String n = "SUBES" + i;
        if(Tabla[x][y].getText().equals(n)){
            for(int z =0;z<Filas;z++){
                for(int j=0;j<Columnas;j++){
                    String f = "FINS"+i;
                    if(Tabla[z][j].getText().equals(f)){
                        System.out.println("Vamos a cambiar");
                        xfinal = z;
                        yfinal = j;
                        
                         ficha.setPosicionxFinal(xfinal);
                         ficha.setPosicionyFinal(yfinal);
                         System.out.println("xfinal " + xfinal);
                         System.out.println("yfinal " + yfinal);
                         /*if(yfinal%2 == 0){
                             ficha.setNoFila(0);
                         }else{
                             ficha.setNoFila(1);
                         }*/
                         Dado.ValorDado = 0;
                         AvanzarRonda(ficha);
                         System.out.println("xfinal " + ficha.getPosiciony());
                         System.out.println("yfinal " + ficha.getPosiciony());
                         
                         
                    }
                }
            }
        }
        }
        if(Tabla[x][y].getText().length() > 5){
        if(Tabla[x][y].getText().substring(0,6).equals("AVANZA")){
            System.out.println("Entreee AVANZA");
            int Cantidad = Integer.parseInt(Tabla[x][y].getText().substring(6));
            Dado.ValorDado = Cantidad;
            AvanzarRonda(ficha);
            Tabla[x][y].setBackground(Tabla[0][0].getBackground());
            Comprobar(ficha);
        }
            if(Tabla[x][y].getText().substring(0,5).equals("ATRAS")){
            System.out.println("Entreee Retrocede");
            int Cantidad = Integer.parseInt(Tabla[x][y].getText().substring(5));
            int Direccion = ficha.getNoFila();
            int res = ficha.getPosiciony() - Cantidad;
            int xFinal = ficha.getPosicionx();
            int yFinal = ficha.getPosiciony();
            Dado.ValorDado = Cantidad;
            if(ficha.getNoFila()%2 == 0){
                if(res >= 0){
                    System.out.println("xfinal" + xFinal);
                    System.out.println("yfinal " + yFinal);
                    System.out.println("Valor dado " + Dado.ValorDado);
                    AvanzarImpar(xFinal,yFinal,y,x,0,true,ficha);
                    System.out.println("xfinal" + xFinal);
                    System.out.println("yfinal " + yFinal);
                    System.out.println("xfinalR" + ficha.getPosicionx());
                    System.out.println("yfinalR" + ficha.getPosiciony());
                }
            }else{
                
            }
            }
        }
        
    }
    
}

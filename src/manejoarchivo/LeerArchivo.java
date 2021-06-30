
package manejoarchivo;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.Serializable;
import tablero.Tablero;

public  class LeerArchivo implements Serializable{
    private static File Archivo;
    private static FileReader fr;
    private static BufferedReader br;
    
        public LeerArchivo(){
            
        }
    
    public static void LeerArchivo(String Direccion, Tablero tablero){
        try{
            Archivo = new File(Direccion);
            fr = new FileReader(Archivo);
            br = new BufferedReader(fr);
            
            String Linea;
            while((Linea = br.readLine()) != null){
                String Comando  = Linea.substring(0, 7);
                String Comando1 = Linea.substring(0, 11);
                String Comando2 = Linea.substring(0, 9);
                String Comando3 = Linea.substring(0, 6);
                String Comando4 = Linea.substring(0, 9);
                String Comando5 = Linea.substring(0, 6);
                String Comando6 = Linea.substring(0, 6);
                System.out.println(Linea);
                if(Comando.equals("tablero")){
                    System.out.println("Iniciamos el tablero");
                    int Filas = Integer.parseInt(Linea.substring(8,9));
                    int Columnas = Integer.parseInt(Linea.substring(10,11));
                    tablero.IniciarTablero(Filas, Columnas);
                }
                if(Comando1.equals("pierdeturno")){
                  int Filas = Integer.parseInt(Linea.substring(12,13));
                  int Columnas = Integer.parseInt(Linea.substring(14,15));
                  tablero.PierdeTurno(Filas, Columnas);
                }
                if(Comando2.equals("tiradados")){
                  int Filas = Integer.parseInt(Linea.substring(10,11));
                  int Columnas = Integer.parseInt(Linea.substring(12,13));
                  tablero.TiraDado(Filas, Columnas);
                }
                if(Comando3.equals("avanza")){
                  int Filas = Integer.parseInt(Linea.substring(7,8));
                  int Columnas = Integer.parseInt(Linea.substring(9,10));
                  int Cant = Integer.parseInt(Linea.substring(11,12));
                  tablero.Avanza(Filas, Columnas,Cant);
                }
                if(Comando4.equals("retrocede")){
                  int Filas = Integer.parseInt(Linea.substring(10,11));
                  int Columnas = Integer.parseInt(Linea.substring(12,13));
                  int Cant = Integer.parseInt(Linea.substring(14,15));
                  tablero.Retrocede(Filas, Columnas, Cant);
                }
                if(Comando5.equals("subida")){
                  int FilasI = Integer.parseInt(Linea.substring(7,8));
                  int ColumnaI = Integer.parseInt(Linea.substring(9,10));
                  int FilasF = Integer.parseInt(Linea.substring(11,12));
                  int ColumnaF = Integer.parseInt(Linea.substring(13,14));
                  tablero.subida(FilasI, ColumnaI, FilasF, ColumnaF);
                  
                }
                  if(Comando6.equals("bajada")){
                  int FilasI = Integer.parseInt(Linea.substring(7,8));
                  int ColumnaI = Integer.parseInt(Linea.substring(9,10));
                  int FilasF = Integer.parseInt(Linea.substring(11,12));
                  int ColumnaF = Integer.parseInt(Linea.substring(13,14));
                  tablero.Bajada(FilasI, ColumnaI, FilasF, ColumnaF,0,0);
                  
                }
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        finally{
            try{
                if(null != fr){
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }
    
   
    
}

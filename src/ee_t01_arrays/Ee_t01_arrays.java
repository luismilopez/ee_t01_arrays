
/**
 *
 * @author LOPEZ SANCHEZ
 */
import java.io.*;
import java.util.*;
public class Ee_t01_arrays {
   String nombre;
   public Ee_t01_arrays(){
       
   }
    public void lee(String nombre) {
        ArrayList<String> archivo = new ArrayList<String>(); 
        int conta=-1;
        String s;
        try{
            
            FileInputStream fstream = new FileInputStream(aux);
           
            DataInputStream entrada = new DataInputStream(fstream);
  
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
           
            while ((strLinea = buffer.readLine()) != null)   {
                StringTokenizer st = new StringTokenizer (strLinea);
                archivo.add(strLinea);
                conta++;
            }
            entrada.close();
        }catch (Exception e){ 
            System.err.println(" error: " + e.getMessage());
        }
        Iterator<String> it = archivo.iterator();
        System.out.println("ENTRADA:");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("");
        System.out.println("SALIDA:");
        for(int x=conta;x>0;x--){
            s=archivo.get(x);
            System.out.println(""+s);
        }

    }

    /**
     * @param args the command line arguments
     */
    //metodo main
    public static void main(String[] args) {
        Ee_t01_arrays a = new Ee_t01_arrays();
        a.lee(".txt");
    }
    
}
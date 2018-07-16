
package plantillamenu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


/**
 *
 * @author andresosante
 */
public class PlantillaMenu {

    /**
     * @param args the command line arguments
     */
    
    //comentario
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    
    public static void main(String[] args) throws IOException {
        int opc;
        boolean noSalir = true;
        
        do {
            mostrarMenu();
            opc = leerOpcion();
            noSalir = ejecutarAccion(opc);
        } while(noSalir);
    }
    
    public static void mostrarMenu()  {
        out.println();
        out.println("1. Opción1");
        out.println("2. Opción2");
    }
    
    public static int leerOpcion() throws IOException {
        int opcion;
        
        out.println("Seleccione su opción");
        opcion = Integer.parseInt(in.readLine());
        out.println();
        
        return opcion;
        
    }
    
    public static boolean ejecutarAccion(int popcion)  {
        boolean noSalir = true;
        
        switch (popcion) {
            case 1:
                //
                break;
            case 2:
                //
                break;
            case 0:
                out.println("Gracias por utilizar la aplicación");
                noSalir = false;
                break;
            default:
                out.println("Opción inválida. Inténtelo de nuevo");
                out.println();
        }
        return noSalir;
    }
    
}

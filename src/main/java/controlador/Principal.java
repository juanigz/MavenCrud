package controlador;

import javax.swing.UIManager;

/**
 * Hello world!
 *
 */
public class Principal 
{
    // public static void main( String[] args )
    // {
    //     System.out.println( "Hello World!" );
    // }

    static Connector conector = new Connector();

    public static void main(String[] args) {
        // Connector _conexionPrincipal = new Connector();
        // _conexionPrincipal.establecerConeccion();

        try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			conector.establecerConeccion();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}

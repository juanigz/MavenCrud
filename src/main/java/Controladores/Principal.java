package Controladores;

import Conexion.Connector;

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

    public static void main(String[] args) {
        Connector _conexionPrincipal = new Connector();
        _conexionPrincipal.establecerConeccion();
    }
}

package controlador;

import java.sql.SQLException;

import interfaz.VentanaForm;
import logica.Payaso;

public class VentanaFormControlador 
{
    static VentanaForm formulario = new VentanaForm();

    public static void mostrar()
    {
        try {
            System.out.println("conexion cerrada? : " + Connector.getConnection().isClosed());
        } catch (SQLException e) {
            e.getMessage();
        }
        formulario.setVisible(true);
    }

    public static Payaso generarPayaso(String nombre, String circos)
    {
        return new Payaso(nombre, circos);
    }
}

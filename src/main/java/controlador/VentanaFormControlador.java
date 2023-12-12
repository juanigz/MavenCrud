package controlador;

import java.sql.SQLException;

import interfaz.VentanaForm;

public class VentanaFormControlador 
{
    static VentanaForm formulario = new VentanaForm();

    public static void mostrar()
    {
        try {
            System.out.println(Connector.getConnection().isClosed());
        } catch (SQLException e) {
            e.getMessage();
        }
        formulario.setVisible(true);
    }
}

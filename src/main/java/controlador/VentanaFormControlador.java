package controlador;

import interfaz.VentanaForm;

public class VentanaFormControlador 
{
    static VentanaForm formulario = new VentanaForm();

    public static void mostrar()
    {
        formulario.setVisible(true);
    }
}

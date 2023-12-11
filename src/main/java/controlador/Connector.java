package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connector {

//    Atributos de conexión
    private Connection conectar = null;

    private final String contrasena = "juani";

    private final String usuario = "root";

    private final String db = "cohorte2";

    private final String cadena = "jdbc:mysql://localhost:3306/" + db;

    public Connection establecerConeccion() {
        try {
            conectar = DriverManager.getConnection(cadena, usuario, contrasena);
            JOptionPane.showMessageDialog(null, "Se conectó correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar " + e.toString());
        }
        return conectar;
    }

}
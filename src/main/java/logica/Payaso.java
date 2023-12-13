package logica;

public class Payaso 
{
    private String _ID;
    private String _nombre;
    private String _circos;

    public Payaso()
    {
    }

    public Payaso(String nombre, String circos)
    {
        _nombre = nombre;
        _circos = circos;
    }

    public String getId()
    {
        return _ID;
    }

    public String getNombre()
    {
        return _nombre;
    }

    public String getCircos()
    {
        return _circos;
    }

    public void setId(String id)
    {
        _ID = id;
    }

    public void setNombre(String nombre)
    {
        _nombre = nombre;
    }

    public void setCircos(String circos)
    {
        _circos = circos;
    }

    @Override
    public String toString()
    {
        return "payaso: " + _ID + "de nombre: " + _nombre;
    }
}

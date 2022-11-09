

package Modelo;

public class Cliente {
    private int id;
    private int rut;
    private String nombre;
    private int Telefono;
    private String direccion;
    private String razon;

    public Cliente() {
    
    }

    public Cliente(int id, int rut, String nombre, int Telefono, String direccion, String razon) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.Telefono = Telefono;
        this.direccion = direccion;
        this.razon = razon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }
    
    
}


package paquete5;

public class Persona {

    private String nombre;
    private String apellido;
    private String username;

    public Persona(String n, String a, String u) {
        nombre = n;
        apellido = a;
        username = u;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void esstablecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public void establecerUsername(String username) {
        this.username = username;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUsername() {
        return username;
    }

    
    @Override
    public String toString() {
        String cadena = "- Persona";

        cadena = String.format(""
                + "%s\n"
                + "Nombre Beneficiario: %s\n"
                + "Apellido Beneficiario: %s\n"
                + "Username Beneficiario: %s\n",
                cadena,
                obtenerNombre(),
                obtenerApellido(),
                obtenerUsername());

        return cadena;
    }

}

package paquete5;


public class InstitucionEducativa {

    private String nombre;
    private String siglas;

    public InstitucionEducativa(String n, String s) {
        nombre = n;
        siglas = s;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerSiglas(String s) {
        siglas = s;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    @Override
    public String toString() {
        String cadena = "- Intitucion Educativa";
        
        cadena = String.format(""
                + "%s\n"
                + "Institucion Educativa: %s\n"
                + "Siglas: %s\n",
                cadena,
                obtenerNombre(),
                obtenerSiglas());
        
        
        return cadena;
    }
    
    
    

}

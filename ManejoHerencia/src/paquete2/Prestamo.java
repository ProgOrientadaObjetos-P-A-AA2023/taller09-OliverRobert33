
package paquete2;

import paquete5.Persona;

public class Prestamo {
    protected Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudad;

    public Prestamo(Persona b, int tp, String c) {
        beneficiario = b;
        tiempoPrestamo = tp;
        ciudad = c;
    }


    public void establecerBeneficiario(Persona b) {
        beneficiario = b;
    }

    public void establecerTiempoPrestamo(int tp) {
        tiempoPrestamo = tp;
    }

    public void establecerCiudad(String c) {
        ciudad = c;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public String obtenerCiudad() {
        return ciudad;
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format(""
                + "%s\n"
                + "- Prestamo\n"
                + "Tiempo Prestamo: %d\n"
                + "Ciudad Prestamo:%s\n",
                beneficiario.toString(),
                tiempoPrestamo,
                ciudad.toUpperCase());
        
        return cadena;
    }
    
    
    
    
}

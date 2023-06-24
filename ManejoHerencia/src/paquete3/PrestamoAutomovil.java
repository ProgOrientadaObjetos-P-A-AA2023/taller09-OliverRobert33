package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

public class PrestamoAutomovil extends Prestamo {

    private String tipoAutomovil;
    private String marcaAutomovil;
    private double valorAutomovil;
    private double valorMensualAutomovil;
    private Persona garante;

    public PrestamoAutomovil(String ta, String ma, Persona g, double va, Persona b, int tp, String c) {
        super(b, tp, c);
        tipoAutomovil = ta;
        marcaAutomovil = ma;
        garante = g;
        valorAutomovil = va;
    }

    public void establecerTipoAutomovil(String ta) {
        tipoAutomovil = ta;
    }

    public void establecerMarcaAutomovil(String ma) {
        marcaAutomovil = ma;
    }

    public void establecerGarante(Persona g) {
        garante = g;
    }

    public void establecerValorAutomovil(double va) {
        valorAutomovil = va;
    }

    public void calcularValorMensualAutomovil() {
        double cuota = valorAutomovil / tiempoPrestamo;
        valorMensualAutomovil = cuota;
    }

    public String obtenerTipoAutomovil() {
        return tipoAutomovil;
    }

    public String obtenerMarcaAutomovil() {
        return marcaAutomovil;
    }

    public Persona obtenerGarante() {
        return garante;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMensualAutomovil() {
        return valorMensualAutomovil;
    }

    @Override
    public String toString() {
        String cadena = "Reporte Prestamo Automovil\n";

        cadena = String.format(""
                + "%s\n"
                + "%s\n"
                + "Tipo de Automovil: %s\n"
                + "Marca de Automovil: %s\n"
                + "Valor de Automovil: $%.2f\n\n"
                + "Valor mensual de pago préstamo automóvil: $%.2f\n"
                + "------------------------------------------------\n",
                cadena,
                super.toString(),
                obtenerTipoAutomovil(),
                obtenerMarcaAutomovil(),
                obtenerValorAutomovil(),
                obtenerValorMensualAutomovil());

        return cadena;
    }

}

package paquete4;

import paquete2.Prestamo;
import paquete5.InstitucionEducativa;
import paquete5.Persona;

public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private double valorCarrera;
    private double valorMensualEducativo;
    private InstitucionEducativa centroEducativo;


    public PrestamoEducativo(String ne, double vc, InstitucionEducativa ce, 
            Persona b, int tp, String c) {
        super(b, tp, c);
        nivelEstudio = ne;
        centroEducativo = ce;
        valorCarrera = vc;
    }

    public void establecerNivelEstudio(String ne) {
        nivelEstudio = ne;
    }

    public void establecerCentroEducativo(InstitucionEducativa ce) {
        centroEducativo = ce;
    }

    public void establecerValorCarrera(double vc) {
        valorCarrera = vc;
    }

    public void calcularValorMensualEducativo() {
        double promedio = (valorCarrera/tiempoPrestamo) - 
                (0.1 * (valorCarrera / tiempoPrestamo));
        valorMensualEducativo = promedio;
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensualEducativo() {
        return valorMensualEducativo;
    }

    public String toString() {
        String cadena = "Reporte de Prestamo Educativo\n";

        cadena = String.format(""
                + "%s\n"
                + "%s\n"
                + "%s\n"
                + "Nivel de Estudio: %s\n"
                + "Valor de la carrera: $%.2f\n\n"
                + "Valor mensual del pago del préstamo del valor de la carrera: $%.2f\n"
                + "-----------------------------------------------------------\n",
                cadena,
                super.toString(),
                centroEducativo.toString(),
                obtenerNivelEstudio(),
                obtenerValorCarrera(),
                obtenerValorMensualEducativo()
        );

        return cadena;
    }

}

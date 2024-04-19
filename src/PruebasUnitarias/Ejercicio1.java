package PruebasUnitarias;

public class Ejercicio1 {
    public static double calcularNotaCurso1(double[] notasParciales) {
        double suma = 0;
        for (double nota : notasParciales) {
            suma += nota;
        }
        return suma / notasParciales.length;
    }

    public static double calcularNotaCurso2(double[] notasParciales) {
        if (notasParciales.length != 4) {
            throw new IllegalArgumentException("El curso 2 debe tener exactamente 4 notas parciales.");
        }

        double[] porcentajes = {0.15, 0.30, 0.35, 0.20};
        double sumaPonderada = 0;
        for (int i = 0; i < notasParciales.length; i++) {
            sumaPonderada += notasParciales[i] * porcentajes[i];
        }
        return sumaPonderada;
    }
}

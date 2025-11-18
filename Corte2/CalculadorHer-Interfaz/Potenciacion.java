package modelo;

public class Potenciacion extends Operacion {

    public Potenciacion(int base, int exponente) {
        super(base, exponente);
    }

    @Override
    public int calcular() {
        if (numero2 == 0) return 1;

        int resultado = numero1;
        Multiplicacion potencia;

        for (int i = 1; i < numero2; i++) {
            potencia = new Multiplicacion(resultado, numero1);
            resultado = potencia.calcular();
        }

        return resultado;
    }
}
package modelo;

public class Multiplicacion extends SumaResta {

    public Multiplicacion(int numero1, int numero2) {
        super(numero1, numero2);
    }

    @Override
    public int calcular() {
        int resultado = 0;
        int signo = 1;

        if ((numero1 < 0 && numero2 > 0) || (numero1 > 0 && numero2 < 0)) {
            signo = -1;
        }

        int a = Math.abs(numero1);
        int b = Math.abs(numero2);

        for (int i = 0; i < b; i++) {
            resultado = new SumaResta(resultado, a).sumar();
        }

        return resultado * signo;
    }
}
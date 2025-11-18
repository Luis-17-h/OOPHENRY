package modelo;

public class Division extends SumaResta {

    public Division(int numero1, int numero2) {
        super(numero1, numero2);
    }

    @Override
    public int calcular() {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        }

        int cociente = 0;
        int a = Math.abs(numero1);
        int b = Math.abs(numero2);

        while (a >= b) {
            a = new SumaResta(a, b).restar();
            cociente++;
        }

        //manejo signos
        if ((numero1 < 0 && numero2 > 0) || (numero1 > 0 && numero2 < 0)) {
            cociente = -cociente;
        }

        return cociente;
    }
}
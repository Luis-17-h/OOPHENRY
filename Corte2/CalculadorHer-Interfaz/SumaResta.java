package modelo;

public class SumaResta extends Operacion {

    public SumaResta(int numero1, int numero2) {
        super(numero1, numero2);
    }

    public int sumar() {
        return numero1 + numero2;
    }

    public int restar() {
        return numero1 - numero2;
    }
}

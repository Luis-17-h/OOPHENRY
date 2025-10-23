public class OperacionesAvanzada extends Operaciones{
    //Potencia
    public double potenciar() {
        double base = getNumero1();
        double exponente = getNumero2();
        double resultado = 1;

        if (exponente == 0) return 1;

        boolean negativo = exponente < 0;
        exponente = Math.abs(exponente);

        for (int i = 0; i < (int) exponente; i++) {
            resultado *= base;
        }

        return negativo ? 1 / resultado : resultado;
    }

    //raiz cuadrada
    public Double raizCuadrada() {
        double numero = getNumero1();
        if (numero < 0) {
            System.out.println("Error: no se puede calcular la raíz cuadrada de un numero negativo.");
            return null;
        }

        double aproximacion = numero / 2;
        for (int i = 0; i < 10; i++) {
            aproximacion = (aproximacion + numero / aproximacion) / 2;
        }

        return aproximacion;
    }

    //Factorizacion
    public Double factorial() {
        double numero = getNumero1();

        if (numero < 0) {
            System.out.println("Error: el factorial no esta definido para negativos.");
            return null;
        }
        if (numero != (int) numero) {
            System.out.println("Error: el factorial solo aplica a enteros.");
            return null;
        }

        int n = (int) numero;
        double resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
}


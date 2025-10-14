public class Controlador {
    @SuppressWarnings("FieldMayBeFinal")
    private Vista vista;
    @SuppressWarnings("FieldMayBeFinal")
    private Operaciones operaciones;

    public Controlador (Vista vista, Operaciones operaciones){
        this.vista = vista;
        this.operaciones = operaciones;
    }

    public void iniciarPrograma() {
        int opcion;
        do{
            opcion = vista.mostrarMenu();
            if(opcion >= 1 && opcion <=4) {
                double numero1 = vista.pedirNumero("Ingrese el primer numero");
                if (Double.isNaN(numero1)) continue;

                double numero2 = vista.pedirNumero("Ingrese el segundo numero");
                if (Double.isNaN(numero2)) continue;

                try{
                    double resultado = 0;
                    switch (opcion) {
                        case 1:
                            resultado = operaciones.sumar(numero1, numero2);
                            break;
                        case 2:
                            resultado = operaciones.restar(numero1, numero2);
                            break;
                        case 3:
                            resultado = operaciones.multiplicar(numero1, numero2);
                            break;
                        case 4:
                            resultado = operaciones.dividir(numero1, numero2);
                            break;
                    } vista.mostrarResultado(resultado);
                } catch (ArithmeticException e) {
                    vista.mostrarMensaje("Error: " + e.getMessage());
                }
            } else if (opcion != 5) {
                vista.mostrarMensaje("Opcion no valida, Ingrese un indicador valido");
                }
        } while (opcion != 5);
        vista.mostrarMensaje("Saliendo...");
    }
}

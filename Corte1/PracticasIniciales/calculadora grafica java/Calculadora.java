public class Calculadora {
    public static void main(String[] args) throws Exception {
        Vista vista = new Vista();
        Operaciones operaciones = new Operaciones();
        Controlador controlador = new Controlador(vista, operaciones);
        controlador.iniciarPrograma();
    }
}

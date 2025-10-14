import javax.swing.JOptionPane;

public class Vista {

    
    public int mostrarMenu() {

    String[] opciones = {"Sumar","Restar","Multiplicar","Dividir","Salir"};

    int opcion = JOptionPane.showOptionDialog(null,"Selecciona una operación:","Calculadora",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);

    return opcion +1;
}

public double pedirNumero (String mensaje){
    while(true){
        String valor = (String) JOptionPane.showInputDialog(null, mensaje, "Ingrese un numero", JOptionPane.QUESTION_MESSAGE, null, null,"");
        if(valor == null) {
            mostrarMensaje("Operacion invalida");
            return Double.NaN;
        }
        try{
            return Double.parseDouble(valor);
        } catch (NumberFormatException e) {
            mostrarMensaje("Ingrese un numero valido");
        }
    }
}

public void mostrarMensaje(String mensaje) {
    JOptionPane.showMessageDialog(null, mensaje, "mensaje", JOptionPane.INFORMATION_MESSAGE);
}

public void mostrarResultado(double resultado) {
    JOptionPane.showMessageDialog(null, "El resultado es: "+ resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
}

}

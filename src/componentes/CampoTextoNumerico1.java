package componentes;


import javafx.scene.control.TextField;

/**
 *
 * @author guillermogallegogonzalez
 */
public class CampoTextoNumerico1 extends TextField{
    
    /**
     * Función que filtra el texto introducido en el campo.
     * Permitiendo solo la entrada de caracteres numéricos
     * @param text - Texto introducido por el usuario.
     */
    @Override
    public void replaceText(int start, int end, String text) {
        if (!text.matches("[a-z, A-Z]")) {
            super.replaceText(start, end, text);
        }
    }
        
    /**
     * Función para reemplazar el texto.
     * @param text - Texto que será reemplazado.
     */
    @Override
    public void replaceSelection(String text) {
        if (!text.matches("[a-z, A-Z]")) {
            super.replaceSelection(text);
        }
    }
    
    /**
     * Invocamos al método constructor de la clase padre
     * con la función super()
     */
    public CampoTextoNumerico1(){
        super();   
    }
    
}

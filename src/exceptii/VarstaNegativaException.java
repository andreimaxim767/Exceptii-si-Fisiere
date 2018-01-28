
package exceptii;

/**
 *
 * @author Andrei
 */
class VarstaNegativaException extends RuntimeException {
    private int varstaInvalida;
    
    public VarstaNegativaException(int varsta) {
        varstaInvalida = varsta;
    }

    public int getVarstaInvalida() {
        return varstaInvalida;
    }
    
    
}

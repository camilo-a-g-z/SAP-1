package logica;

import interfaces.IRegistro;

/**
 *
 * @author User
 */
public class Registro16Bit implements IRegistro{
    private byte valor;

    public Registro16Bit() {
        this.valor = 0;
    }
    
    @Override
    public void setValor(byte v) {
        // Asegúrese de que la entrada sea de 4 bits
        if (v > 0b1111111111111111) {
            throw new RuntimeException();
        }
        this.valor = v;
    }

    @Override
    public byte getValor() {
        return this.valor;
    }

    @Override
    public void clear() {
        this.valor = 0;
    }
    
}

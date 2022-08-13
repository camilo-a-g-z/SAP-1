package logica;

import interfaces.IRegistro;

/**
 *
 * @author User
 */
public class Registro6Bit implements IRegistro{
    private byte valor;

    public Registro6Bit() {
        this.valor = 0;
    }
    
    @Override
    public void setValor(byte v) {
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

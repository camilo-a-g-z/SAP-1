package logica;

import interfaces.IRegistro;

/**
 *
 * @author User
 */
public class RegistroPunteroF implements IRegistro{
    private byte valor;

    public RegistroPunteroF() {
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

package logica;

import interfaces.IRegistro;

public class Registro8Bit implements IRegistro {

    private byte valor;

    public Registro8Bit() {
        this.valor = 0;
    }

    @Override
    public void setValor(byte v) {
        // Asegúrese de que la entrada sea de 4 bits
        if (v > 0b11111111) {
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

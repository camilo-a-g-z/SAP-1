package logica;

/**
 *
 * @author User
 */
public class Pila {
    private int capacidadPila;
    private byte[] data;
    private RegistroPunteroI punteroInicio; //guarda referecia direccion en memoria de primera posicion.
    private RegistroPunteroF punteroFinal; //guarda referecia direccion en memoria de primera posicion.
    
    public Pila() {
        capacidadPila = 0x400;
        this.data = new byte[capacidadPila];
        this.punteroInicio.setValor((byte) 0);
        this.punteroFinal.setValor((byte) 0);
    }
    
    public byte getValorPila(){
        return this.data[punteroInicio.getValor()];
    }
    public void siguientePosicionPila(){
        //si no esta vacio o si esta por detras del puntero final
        if(this.data[punteroInicio.getValor() + 1] != 0  || punteroInicio.getValor() <= punteroFinal.getValor()){ 
            punteroInicio.setValor( (byte) (punteroInicio.getValor() + 1));
        }
    }
    public void addElementInPila(byte val){
        if(punteroFinal.getValor() != 0){
            punteroFinal.setValor( (byte) (punteroFinal.getValor() + 1) );
            this.data[punteroFinal.getValor()] = val;
        }else if (data[0] == 0){
            this.data[0] = val;
        }
    }
    public void removeElementInPila(){
        if(this.data[punteroInicio.getValor()] != 0 && this.data[punteroInicio.getValor() +1 ] == 0){
            this.data[punteroInicio.getValor()]=0;
        }else if(this.data[punteroInicio.getValor()] != 0 && this.data[punteroInicio.getValor() +1 ] != 0){
            this.data[punteroInicio.getValor()]=0;
            punteroInicio.setValor((byte)(punteroInicio.getValor()+1));
        }
    }

    public int getCapacidadPila() {
        return capacidadPila;
    }

    public void setCapacidadPila(int capacidadPila) {
        this.capacidadPila = capacidadPila;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public RegistroPunteroI getPunteroInicio() {
        return punteroInicio;
    }

    public void setPunteroInicio(RegistroPunteroI punteroInicio) {
        this.punteroInicio = punteroInicio;
    }

    public RegistroPunteroF getPunteroFinal() {
        return punteroFinal;
    }

    public void setPunteroFinal(RegistroPunteroF punteroFinal) {
        this.punteroFinal = punteroFinal;
    }
    
}

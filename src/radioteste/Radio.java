package radioteste;

public class Radio {

    //definição de constantes 
    public static final double ESTACAO_MAX = 108.00;
    public static final double ESTACAO_MIN = 76.00;
    public static final int VOLUME_MAX = 55;
    public static final int VOLUME_MIN = 0;

    //definição de atributos da radio
    private double estacao = ESTACAO_MIN;
    private int volume = VOLUME_MIN;
    private boolean power;

    //definição de metodos da radio
    public double getEstacao() {
        return estacao;
    }

    public void setEstacao(double estacao) {
        this.estacao = estacao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void aumentarVolume() {
        if (getVolume() < VOLUME_MAX) {
            volume = volume + 1;
        }
    }

    public void diminuirVolume() {
        if (getVolume() > VOLUME_MIN) {
            volume = volume - 1;
        }
    }

    public void subirEstacao() {
        if (getEstacao() >= ESTACAO_MIN && getEstacao() <= ESTACAO_MAX) {
            estacao = estacao + 0.1;

        }else if( getEstacao() > ESTACAO_MAX){
            estacao = ESTACAO_MIN;
        }           
    }

    public void diminuirEstacao() {
        if (getEstacao() > ESTACAO_MIN && getEstacao() <= ESTACAO_MAX) {
            estacao = estacao - 0.1;
        }else if( getEstacao() <= ESTACAO_MIN){
            estacao = ESTACAO_MAX;
        }  
    }
}

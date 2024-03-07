package Esercizio;

public class Volontario implements CheckIn, CheckOut {
    private String nome;
    private int età;
    private String CV;

    private String inizioTurno;
    private String fineTurno;

    public Volontario(String nome, int età, String cv, String inizioTurno, String fineTurno){
        this.nome = nome;
        this.età = età;
        this.CV = cv;;
        this.inizioTurno = inizioTurno;
        this.fineTurno = fineTurno;
    }

    public String getNome() {
        return nome;
    }

    public int getEtà() {
        return età;
    }

    public String getCV() {
        return CV;
    }

    @Override
    public void checkIn(){
        System.out.println("Orario inizio turno " + nome + " : " + inizioTurno );
    }


    @Override
    public void checkOut() {
        System.out.println("Orario fine turno " + nome + " : " + fineTurno );
    }
}

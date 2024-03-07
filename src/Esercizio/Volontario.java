package Esercizio;

public class Volontario implements Check {
    private String nome;
    private int età;
    private String CV;

    private double inizioTurno;

    public Volontario(String nome, int età, String cv, double inizioTurno ){
        this.nome = nome;
        this.età = età;
        this.CV = cv;;
        this.inizioTurno = inizioTurno;
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
        System.out.println("Orario inizio turno : " + inizioTurno );
    }


}

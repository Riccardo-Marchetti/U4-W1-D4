package Esercizio;

public class Dirigente extends Dipendente{


    public Dirigente(String matricola, double stipendio, String inizioTurno, String fineTurno, Dipartimento dipartimento) {
        super(matricola, stipendio, inizioTurno,fineTurno, dipartimento);
    }

    @Override
    public void calculateSalary(){
        System.out.println("Stipendio: " + getStipendio());
    }

    @Override
    public void checkIn() {
        System.out.println("Orario di inizio turno dirigente : " + getInizioTurno() );
    }

    @Override
    public void checkOut() {
        System.out.println("Orario di fine turno dirigente : " + getFineTurno() );
    }
}

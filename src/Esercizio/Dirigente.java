package Esercizio;

public class Dirigente extends Dipendente{


    public Dirigente(String matricola, double stipendio, double inizioTurno, Dipartimento dipartimento) {
        super(matricola, stipendio, inizioTurno, dipartimento);
    }

    @Override
    public void calculateSalary(){
        System.out.println("Stipendio: " + getStipendio());
    }

    @Override
    public void checkIn() {
        System.out.println("Orario inizio turno : " + getInizioTurno() );
    }
}

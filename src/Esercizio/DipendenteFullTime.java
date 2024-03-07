package Esercizio;

public class DipendenteFullTime extends Dipendente{


    public DipendenteFullTime(String matricola, double stipendio, double inizioTurno, Dipartimento dipartimento) {
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

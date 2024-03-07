package Entities;

public class DipendenteFullTime extends Dipendente{


    public DipendenteFullTime(String matricola, double stipendio, String inizioTurno,String fineTurno, Dipartimento dipartimento) {
        super(matricola, stipendio, inizioTurno,fineTurno, dipartimento);
    }

    @Override
        public void calculateSalary(){
            System.out.println("Stipendio: " + getStipendio());
        }

    @Override
    public void checkIn() {
        System.out.println("Orario di inizio turno dipendente full time : " + getInizioTurno() );
    }

    @Override
    public void checkOut() {
        System.out.println("Orario di fine turno dirigente : " + getFineTurno() );
    }
}

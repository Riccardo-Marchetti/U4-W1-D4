package Entities;

public class DipendentePartTime extends Dipendente{

private int ore;

    public DipendentePartTime(String matricola, double stipendio, String inizioTurno, String fineTurno, Dipartimento dipartimento, int ore) {
        super(matricola, stipendio, inizioTurno, fineTurno, dipartimento);
    }


    @Override
    public void calculateSalary(){
        System.out.println("Stipendio: " + getStipendio());
    }
    @Override
    public double getStipendio() {
        return super.getStipendio() * this.ore;
    }

    @Override
    public void checkIn() {
        System.out.println("Orario di inizio turno dipendente part time : " + getInizioTurno() );
    }

    @Override
    public void checkOut() {
        System.out.println("Orario di fine turno dirigente : " + getFineTurno() );
    }
}


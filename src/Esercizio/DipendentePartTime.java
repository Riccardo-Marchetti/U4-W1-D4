package Esercizio;

public class DipendentePartTime extends Dipendente{

private int ore;

    public DipendentePartTime(String matricola, double stipendio, double inizioTurno, Dipartimento dipartimento, int ore) {
        super(matricola, stipendio, inizioTurno, dipartimento);
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
        System.out.println("Orario inizio turno : " + getInizioTurno() );
    }
}


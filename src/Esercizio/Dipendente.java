package Esercizio;

public abstract class Dipendente implements CheckIn, CheckOut {
    public enum Dipartimento {PRODUZIONE, AMMINISTRAZIONE, VENDITE};

  private String matricola;
  private double stipendio;
  private String inizioTurno;
  private String fineTurno;
  private Dipartimento dipartimento;



  public Dipendente(String matricola, double stipendio, String inizioTurno,String fineTurno, Dipartimento dipartimento){
      this.matricola = matricola;
      this.stipendio = stipendio;
      this.inizioTurno = inizioTurno;
      this.fineTurno = fineTurno;
      this.dipartimento = dipartimento;
  }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String getInizioTurno() {
        return inizioTurno;
    }

    public String getFineTurno() {
        return fineTurno;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
    public abstract void calculateSalary();



}

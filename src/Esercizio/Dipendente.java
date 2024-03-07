package Esercizio;

public abstract class Dipendente implements Check {
    public enum Dipartimento {PRODUZIONE, AMMINISTRAZIONE, VENDITE};

  private String matricola;
  private double stipendio;
    private double inizioTurno;
    private Dipartimento dipartimento;



  public Dipendente(String matricola, double stipendio, double inizioTurno, Dipartimento dipartimento){
      this.matricola = matricola;
      this.stipendio = stipendio;
      this.inizioTurno = inizioTurno;
      this.dipartimento = dipartimento;
  }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getInizioTurno() {
        return inizioTurno;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
    public abstract void calculateSalary();



}

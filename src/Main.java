import Entities.*;
import Interfaces.CheckIn;
import Interfaces.CheckOut;

public class Main {
//    AGGIUNGERE LE ORE FATTE DI OGNI DIPENDENTE/VOLONTARIO AL GIORNO : oreSvolteGiornaliere, AGGIUNGERE LA PAGA ORARIA PER TUTTI I DIPENDENTI
    public static void main(String[] args) {

//        Dipendente dipendente1 = new Dipendente("1234567890",1200.50, "Produzione" );
//        Dipendente dipendente2 = new Dipendente("0987654321",1350.90, "Vendite" );
//        Dipendente dipendente3 = new Dipendente("5432167890",1500.80, "Amministrazione" );
//        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};
//        for (int i = 0; i < dipendenti.length; i++) {
//            System.out.println("Matricola: " + dipendenti[i].getMatricola());
//        }
        DipendenteFullTime dipendente1 = new DipendenteFullTime("1234567890",1200.50,"8:00", "17:00", Dipendente.Dipartimento.PRODUZIONE);
        DipendentePartTime dipendente2 = new DipendentePartTime("0987654321",12,"14:00", "10:00", Dipendente.Dipartimento.VENDITE, 80);
        Dirigente dirigente = new Dirigente("5432167890",2000.80,"8:00", "17:00", Dipendente.Dipartimento.AMMINISTRAZIONE);
        Dipendente[] dipendenti = {dipendente1, dipendente2, dirigente};
        double somma = 0;
        for (int i = 0; i < dipendenti.length; i++) {
            somma +=  dipendenti[i].getStipendio();

        }
        System.out.println("Somma : ");
        System.out.println("La somma degli stipendi è : " + somma);
        System.out.println("----------------------------------------------------------");
        System.out.println("CheckIn : ");
        Volontario volontario1 = new Volontario("Mario", 48, "volontario", "16:00","20:00");
        Volontario volontario2 = new Volontario("Marco", 37, "volontario", "13:00", "18:00");
        Volontario volontario3 = new Volontario("Antonio", 40, "volontario", "9:00", "13:00");
        CheckIn[] check = {dipendente1, dipendente2, dirigente, volontario1, volontario2, volontario3};
        for (int i = 0; i < check.length; i++) {
            check[i].checkIn();
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("CheckOut : ");
        CheckOut[] checkOut = {dipendente1, dipendente2, dirigente, volontario1, volontario2, volontario3};
        for (int i = 0; i < checkOut.length; i++) {
            checkOut[i].checkOut();
        }
    }
}
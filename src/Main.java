import Esercizio.*;

public class Main {
    public static void main(String[] args) {

//        Dipendente dipendente1 = new Dipendente("1234567890",1200.50, "Produzione" );
//        Dipendente dipendente2 = new Dipendente("0987654321",1350.90, "Vendite" );
//        Dipendente dipendente3 = new Dipendente("5432167890",1500.80, "Amministrazione" );
//        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};
//        for (int i = 0; i < dipendenti.length; i++) {
//            System.out.println("Matricola: " + dipendenti[i].getMatricola());
//        }
        DipendenteFullTime dipendente1 = new DipendenteFullTime("1234567890",1200.50,8, Dipendente.Dipartimento.PRODUZIONE);
        DipendentePartTime dipendente2 = new DipendentePartTime("0987654321",12,14, Dipendente.Dipartimento.VENDITE, 80);
        Dirigente dirigente = new Dirigente("5432167890",2000.80,8, Dipendente.Dipartimento.AMMINISTRAZIONE);
        Dipendente[] dipendenti = {dipendente1, dipendente2, dirigente};
        double somma = 0;
        for (int i = 0; i < dipendenti.length; i++) {
            somma +=  dipendenti[i].getStipendio();

        }
        System.out.println("La somma degli stipendi è : " + somma);

        Volontario volontario1 = new Volontario("Mario", 48, "volontario", 16);
        Volontario volontario2 = new Volontario("Mario", 48, "volontario", 13);
        Volontario volontario3 = new Volontario("Mario", 48, "volontario", 10);
        Check[] check = {dipendente1, dipendente2, dirigente, volontario1, volontario2, volontario3};
        for (int i = 0; i < check.length; i++) {
            check[i].checkIn();
        }
    }
}
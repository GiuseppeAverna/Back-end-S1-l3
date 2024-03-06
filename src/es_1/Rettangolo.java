package es_1;

public class Rettangolo {
    private double altezza;
    private double larghezza;


    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }


    public double calcolaArea() {
        return altezza * larghezza;
    }


    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }


    public void stampaRettangolo() {
        System.out.println("Area: " + calcolaArea());
        System.out.println("Perimetro: " + calcolaPerimetro());
    }


    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("Primo rettangolo:");
        rettangolo1.stampaRettangolo();
        System.out.println("Secondo rettangolo:");
        rettangolo2.stampaRettangolo();


        double areaTotale = rettangolo1.calcolaArea() + rettangolo2.calcolaArea();
        double perimetroTotale = rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro();
        System.out.println("Somma delle aree: " + areaTotale);
        System.out.println("Somma dei perimetri: " + perimetroTotale);
    }

    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(5, 10);
        Rettangolo rettangolo2 = new Rettangolo(3, 7);


        System.out.println("Stampa del primo rettangolo:");
        rettangolo1.stampaRettangolo();
        System.out.println("Stampa del secondo rettangolo:");
        rettangolo2.stampaRettangolo();


        System.out.println("\nStampa dei due rettangoli e somma delle aree e dei perimetri:");
        stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}
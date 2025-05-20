package modell;

public class Versenyzok {

    private String nev;
    private String email;
    private double pontSzam;
    private int mezSzam;

    public Versenyzok(String tartalom) {
        String[] adatok = tartalom.split(" ");
        String nev = adatok[0];
        String email = adatok[1];
        double pontSzam = Double.parseDouble(adatok[2]);
        int mezSzam = Integer.parseInt(adatok[3]);
    }

    public Versenyzok(String nev, String email, double pontSzam, int mezSzam) {
        this.nev = nev;
        this.email = email;
        this.pontSzam = pontSzam;
        this.mezSzam = mezSzam;
    }

    public String getNev() {
        return nev;
    }

    public String getEmail() {
        return email;
    }

    public double getPontSzam() {
        return pontSzam;
    }

    public int getMezSzam() {
        return mezSzam;
    }

    @Override
    public String toString() {
        return "Versenyzok{" + "nev=" + nev
                + ", email=" + email
                + ", pontSzam=" + pontSzam
                + ", mezSzam=" + mezSzam + '}';
    }
}

package ExamenPao.exercitiul3;

public class Persoana {

    private double salariu;
    private String nume;
    private int varsta;

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Persoana(double salariu, String nume, int varsta) {
        this.salariu = salariu;
        this.nume = nume;
        this.varsta = varsta;
    }
}

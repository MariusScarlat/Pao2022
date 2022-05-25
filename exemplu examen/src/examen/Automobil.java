package examen;

import java.util.Objects;

public class Automobil {

    private String marca;
    private String model;
    private double capacitate;
    private int  pret;


    public Automobil(String marca, String model, double capacitate, int pret) {
        this.marca = marca;
        this.model = model;
        this.capacitate = capacitate;
        this.pret = pret;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(double capacitate) {
        this.capacitate = capacitate;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", capacitate=" + capacitate +
                ", pret=" + pret +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobil automobil = (Automobil) o;
        return Double.compare(automobil.capacitate, capacitate) == 0 &&
                pret == automobil.pret &&
                Objects.equals(marca, automobil.marca) &&
                Objects.equals(model, automobil.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, model, capacitate, pret);
    }
}

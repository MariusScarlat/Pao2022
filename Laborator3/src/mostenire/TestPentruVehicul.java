package mostenire;

public class TestPentruVehicul {

    public static void main(String[] args) {
        Masina masina = new Masina();
        masina.brand = "AUDI";
        masina.combustibil = "Benzina";
        masina.culoare = "Negru";
        masina.numarRoti = 4;

        masina.claxon();

        masina.m();
    }
}

package Imutability;

/*
        Imutabilitate: O clasa imutabila, este o clasa care in momentul in care s-a creat, nu mai poate fi modificata
                   Cum obtin o clasa imutabila:
                                    - clasa trebuie sa fie finala (pentru a nu putea fi mostenita)
                                    - atributele sa fie finale si private (doar cu getteri fara setteri deoarece nu dorim modificarea atributelor clasei)
                                    - constructorul sa aiba parametrii pentru toate atributele clasei
 */
public final class ImmutableExample {

    private final String name;
    private final int id;

    public ImmutableExample(String name, int id) {
        this. name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

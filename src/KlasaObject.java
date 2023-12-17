// Interfejs Cloneable jest używany do wskazania, że klasa ma zezwolić na tworzenie kopii obiektów za pomocą metody clone() klasy Object
public class KlasaObject implements Cloneable {
    private String tytul;
    private String autor;
    private int rokPublikacji;

    public KlasaObject(String tytul, String autor, int rokPublikacji) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokPublikacji = rokPublikacji;
    }

    // Metoda do klonowania obiektu
    @Override
    public Object clone() throws CloneNotSupportedException {
        // Wywołanie metody clone() z klasy nadrzędnej (Object)
        return super.clone();
    }

    // Metoda porównująca obiekty
    @Override
    public boolean equals(Object obj) {
        // Sprawdzenie, czy obiekt porównywany to ten sam obiekt
        if (this == obj) {
            return true;
        }
        // Sprawdzenie, czy obiekt porównywany nie jest null i czy jest tej samej klasy
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Rzutowanie obiektu na klasę KlasaObject
        KlasaObject ksiazka = (KlasaObject) obj;
        // Porównanie pól obiektów
        return rokPublikacji == ksiazka.rokPublikacji &&
                tytul.equals(ksiazka.tytul) &&
                autor.equals(ksiazka.autor);
    }

    // Metoda wywoływana przed usunięciem obiektu
    @Override
    protected void finalize() {
        System.out.println("Obiekt KlasaObject został usunięty");
    }

    // Metoda zwracająca reprezentację tekstową obiektu
    @Override
    public String toString() {
        return "KlasaObject{" +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", rokPublikacji=" + rokPublikacji +
                '}';
    }

    public static void main(String[] args) {
        // Tworzenie obiektów klasy KlasaObject
        KlasaObject ksiazka1 = new KlasaObject("Programowanie w Java", "Tomasz Nowak", 2023);
        KlasaObject ksiazka2 = new KlasaObject("Programowanie w Java", "Krzysztof Kowalczyk", 2017);
        KlasaObject ksiazka3 = new KlasaObject("Podstawy Pythona", "Anna Nowak", 2019);

        // Testowanie metody clone()
        try {
            KlasaObject sklonowanaKsiazka = (KlasaObject) ksiazka1.clone();
            System.out.println("Porównanie referencji ksiazka1 i sklonowanaKsiazka po klonowaniu: " + (ksiazka1 == sklonowanaKsiazka)); // Powinno być FALSE
            System.out.println("Porównanie equals ksiazka1 i sklonowanaKsiazka po klonowaniu: " + ksiazka1.equals(sklonowanaKsiazka)); // Powinno być TRUE
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Testowanie metody equals()
        System.out.println("Porównanie equals ksiazka1 i ksiazka2: " + ksiazka1.equals(ksiazka2)); // Powinno być TRUE
        System.out.println("Porównanie equals ksiazka1 i ksiazka3: " + ksiazka1.equals(ksiazka3)); // Powinno być FALSE

        // Testowanie metody toString()
        System.out.println("Reprezentacja tekstowa obiektu ksiazka1: " + ksiazka1.toString());

        // Testowanie metody finalize()
        ksiazka1 = null;
        System.gc(); // Wywołanie Garbage Collectora
    }
}

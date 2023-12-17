public class ModyfikatoryDostepnosci {
    // Prywatne pole - dostępne tylko wewnątrz tej klasy
    private String prywatnePole = "Prywatne";

    // Publiczne pole - dostępne wszędzie
    public String publicznePole = "Publiczne";

    // Chronione pole - dostępne w tej klasie, w klasach w tym samym pakiecie, oraz w klasach dziedziczących
    protected String chronionePole = "Chronione";

    // Pole z domyślnym dostępem (brak modyfikatora) - dostępne w tej klasie i w klasach w tym samym pakiecie
    String domyslnePole = "Domyślne";

    // Publiczna metoda - dostępna wszędzie
    public void publicznaMetoda() {
        System.out.println("Jestem publiczną metodą");
    }

    // Prywatna metoda - dostępna tylko wewnątrz tej klasy
    private void prywatnaMetoda() {
        System.out.println("Jestem prywatną metodą");
    }

    // Chroniona metoda - dostępna w tej klasie, w klasach w tym samym pakiecie, oraz w klasach dziedziczących
    protected void chronionaMetoda() {
        System.out.println("Jestem chronioną metodą");
    }

    // Metoda z domyślnym dostępem (brak modyfikatora) - dostępne w tej klasie i w klasach w tym samym pakiecie
    void domyslnaMetoda() {
        System.out.println("Jestem metodą z domyślnym dostępem");
    }

    public static void main(String[] args) {
        // Tworzymy obiekt klasy ModyfikatoryDostepnosci
        ModyfikatoryDostepnosci obiekt = new ModyfikatoryDostepnosci();

        // Możemy uzyskać dostęp do publicznego pola i metody
        System.out.println(obiekt.publicznePole);
        obiekt.publicznaMetoda();

        // NIE MOŻEMY uzyskać dostępu do prywatnego pola i metody
        // System.out.println(obiekt.prywatnePole);
        // obiekt.prywatnaMetoda();

        // NIE MOŻEMY  uzyskać dostępu do chronionego pola i metody (chyba że jesteśmy w klasie dziedziczącej)
        // System.out.println(obiekt.chronionePole);
        // obiekt.chronionaMetoda();

        // NIE MOŻEMY  uzyskać dostępu do pola i metody z domyślnym dostępem (chyba że jesteśmy w tej samej klasie lub w klasie w tym samym pakiecie)
        // System.out.println(obiekt.domyslnePole);
        // obiekt.domyslnaMetoda();
    }
}


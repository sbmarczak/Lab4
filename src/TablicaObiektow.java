import java.util.Arrays; // Biblioteka, która zawiera metody do manipulacji tablicami

// Klasa Student implementująca interfejs Comparable dla sortowania
class Student implements Comparable<Student> {
    String imie; // Imię studenta
    String nazwisko; // Nazwisko studenta
    int numerIndeksu; // Numer indeksu studenta

    // Konstruktor klasy Student
    Student(String imie, String nazwisko, int numerIndeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
    }

    // Implementacja metody compareTo() z interfejsu Comparable - metoda ta jest używana do porównywania obiektów klasy Student
    @Override
    public int compareTo(Student innyStudent) {
        // Porównanie numerów indeksów studentów dla sortowania
        return Integer.compare(this.numerIndeksu, innyStudent.numerIndeksu);
    }
}

// Główna klasa programu
public class TablicaObiektow {
    public static void main(String[] args) {
        // Tworzymy tablicę obiektów klasy Student
        Student[] studenci = new Student[3];

        // Dodajemy studentów do tablicy
        studenci[0] = new Student("Marcin", "Konieczko", 51510);
        studenci[1] = new Student("Franciszek", "Nowakowski", 52520);
        studenci[2] = new Student("Piotr", "Zielinski", 41410);

        // Sortujemy tablicę obiektów Student według numeru indeksu
        Arrays.sort(studenci);

        // Wyświetlamy posortowaną tablicę
        System.out.println("Posortowana tablica według numeru indeksu:");

        // Przechodzimy przez posortowaną tablicę i wyświetlamy dane studentów
        for (Student student : studenci) {
            System.out.println("Imię: " + student.imie + ", Nazwisko: " + student.nazwisko + ", Numer indeksu: " + student.numerIndeksu);
        }
    }
}


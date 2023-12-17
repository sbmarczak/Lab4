package testowanie; // pakiet "testowanie"

import myapp.MyCharacter;

public class TestCharacter {
    public static void main(String[] args) {
        // Tworzymy obiekt klasy MyCharacter
        MyCharacter postac = new MyCharacter("Stefan", "Wojownik", "Człowiek", 1);

        // Wyświetlamy informacje o postaci
        System.out.println("Imię postaci: " + postac.imie);
        System.out.println("Klasa postaci: " + postac.klasaPostaci);
        System.out.println("Rasa postaci: " + postac.rasa);
        System.out.println("Siła postaci: " + postac.sila);
    }
}



package myapp; // pakiet "myapp"

public class MyCharacter {
    public String imie; // Imię postaci
    public String klasaPostaci; // Klasa postaci
    public String rasa; // Rasa postaci
    public int sila; // Siła postaci

    // Konstruktor klasy MyCharacter
    public MyCharacter(String imie, String klasaPostaci, String rasa, int sila) {
        this.imie = imie;
        this.klasaPostaci = klasaPostaci;
        this.rasa = rasa;
        this.sila = sila;
    }
}

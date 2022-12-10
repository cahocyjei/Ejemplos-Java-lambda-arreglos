package models;

public class Persona {
    int id;
    String name;
    String edad;
    
    public Persona(int id, String name, String edad) {
        this.id = id;
        this.name = name;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEdad() {
        return edad;
    }

    
}

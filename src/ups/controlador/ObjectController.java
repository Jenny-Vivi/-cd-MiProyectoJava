package ups.controlador;

import java.util.ArrayList;

import ups.modelo.Animal;

public class ObjectController {
    public static Animal encontrarPorNombre(ArrayList<Animal> animales, String nombre) {
        for (Animal animal : animales) {
            if (animal.getNombre().equalsIgnoreCase(nombre)) {
                return animal;
            }
        }
        return null;
    }

    public static Animal encontrarPorEspecie(ArrayList<Animal> animales, String especie) {
        for (Animal animal : animales) {
            if (animal.getEspecie().equalsIgnoreCase(especie)) {
                return animal;
            }
        }
        return null;
    }

    public static Animal encontrarPorEdad(ArrayList<Animal> animales, int edad) {
        for (Animal animal : animales) {
            if (animal.getEdad() == edad) {
                return animal;
            }
        }
        return null;
    }
}

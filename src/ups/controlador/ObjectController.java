package ups.controlador;

import java.util.ArrayList;

import ups.modelo.Animal;

public class ObjectController {
    // Método para buscar animales por nombre
    public static Animal buscarPorNombre(ArrayList<Animal> animales, String nombre) {
        for (Animal animal : animales) {
            if (animal.getNombre().equalsIgnoreCase(nombre)) {
                return animal;
            }
        }
        return null;
    }

    // Método para buscar animales por especie
    public static Animal buscarPorEspecie(ArrayList<Animal> animales, String especie) {
        for (Animal animal : animales) {
            if (animal.getEspecie().equalsIgnoreCase(especie)) {
                return animal;
            }
        }
        return null;
    }

    // Método para buscar animales por edad
    public static Animal buscarPorEdad(ArrayList<Animal> animales, int edad) {
        for (Animal animal : animales) {
            if (animal.getEdad() == edad) {
                return animal;
            }
        }
        return null;
    }

}

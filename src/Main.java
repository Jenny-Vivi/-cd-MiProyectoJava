import java.util.ArrayList;

import ups.controlador.AnimalController;
import ups.controlador.ObjectController;
import ups.modelo.Animal;
import ups.vista.AnimalView;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");

        // Crear el modelo
        /*
         * Animal modelo = new Animal("Leo", "León", 5);
         * 
         * // Crear la vista
         * AnimalView vista = new AnimalView();
         * 
         * // Crear el controlador
         * AnimalController controlador = new AnimalController(modelo, vista);
         * 
         * // Mostrar detalles iniciales del animal
         * controlador.actualizarVista();
         * 
         * // Actualizar datos del modelo
         * controlador.setNombreAnimal("Max");
         * controlador.setEspecieAnimal("Tigre");
         * controlador.setEdadAnimal(7);
         * 
         * // Mostrar detalles actualizados del animal
         * controlador.actualizarVista();
         * }/
         */
        // Crear la vista
        AnimalView vista = new AnimalView();

        // Crear una lista de animales con diferentes valores
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Animal("Leo", "León", 5));
        animales.add(new Animal("Max", "Tigre", 7));
        animales.add(new Animal("Molly", "Elefante", 10));
        animales.add(new Animal("Bella", "Jirafa", 6));
        animales.add(new Animal("Rocky", "Oso", 4));

        // Iterar sobre la lista de animales y mostrar los detalles de cada uno
        for (Animal animal : animales) {
            // Crear un controlador para cada animal
            AnimalController controlador = new AnimalController(animal, vista);
            // Actualizar la vista para mostrar los detalles del animal actual
            controlador.actualizarVista();
            System.out.println("----------------------");
        }
        // Buscar un animal por nombre usando ObjectController
        String nombreABuscar = "Max";
        Animal encontradoPorNombre = ObjectController.buscarPorNombre(animales, nombreABuscar);
        if (encontradoPorNombre != null) {
            System.out.println("Animal encontrado por nombre: " + encontradoPorNombre);
        } else {
            System.out.println("Animal con nombre " + nombreABuscar + " no encontrado.");
        }

        // Buscar un animal por especie usando ObjectController
        String especieABuscar = "Elefante";
        Animal encontradoPorEspecie = ObjectController.buscarPorEspecie(animales, especieABuscar);
        if (encontradoPorEspecie != null) {
            System.out.println("Animal encontrado por especie: " + encontradoPorEspecie);
        } else {
            System.out.println("Animal con especie " + especieABuscar + " no encontrado.");
        }

        // Buscar un animal por edad usando ObjectController
        int edadABuscar = 4;
        Animal encontradoPorEdad = ObjectController.buscarPorEdad(animales, edadABuscar);
        if (encontradoPorEdad != null) {
            System.out.println("Animal encontrado por edad: " + encontradoPorEdad);
        } else {
            System.out.println("Animal con edad " + edadABuscar + " no encontrado.");
        }
    }
}

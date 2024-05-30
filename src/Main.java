import java.util.ArrayList;

import ups.vista.ObjectView;

//import ups.controlador.AnimalController;
import ups.controlador.ObjectController;
import ups.modelo.Animal;
//import ups.vista.AnimalView;

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
               ObjectView objectVista = new ObjectView();

               // Crear una lista de animales con diferentes valores
               ArrayList<Animal> animales = new ArrayList<>();
               animales.add(new Animal("Leo", "León", 5));
               animales.add(new Animal("Manny", "Elefante", 7));
               animales.add(new Animal("Max", "León", 10));
               animales.add(new Animal("Molly", "Jirafa", 6));
               animales.add(new Animal("Bella", "Oso", 4));
       
               // Mostrar la lista completa de animales
               System.out.println("Lista completa de animales:");
               objectVista.imprimirListaAnimales(animales);
       
               // Buscar un animal por nombre usando ObjectController
               String nombreABuscar = "Max";
               Animal encontradoPorNombre = ObjectController.encontrarPorNombre(animales, nombreABuscar);
               objectVista.imprimirResultado(encontradoPorNombre);
       
               // Buscar un animal por especie usando ObjectController
               String especieABuscar = "Elefante";
               Animal encontradoPorEspecie = ObjectController.encontrarPorEspecie(animales, especieABuscar);
               objectVista.imprimirResultado(encontradoPorEspecie);
       
               // Buscar un animal por edad usando ObjectController
               int edadABuscar = 4;
               Animal encontradoPorEdad = ObjectController.encontrarPorEdad(animales, edadABuscar);
               objectVista.imprimirResultado(encontradoPorEdad);
           }

    }


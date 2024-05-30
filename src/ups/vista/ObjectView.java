package ups.vista;
   import java.util.ArrayList;
   import ups.modelo.Animal;

   public class ObjectView {
 
    

    
        // Método para imprimir la lista completa de animales
        public void imprimirListaAnimales(ArrayList<Animal> animales) {
            for (Animal animal : animales) {
                imprimirDetallesAnimal(animal);
                System.out.println("----------------------");
            }
        }
    
        // Método para imprimir los detalles de un solo animal
        public void imprimirDetallesAnimal(Animal animal) {
            if (animal != null) {
                System.out.println("Detalles del Animal:");
                System.out.println("Nombre: " + animal.getNombre());
                System.out.println("Especie: " + animal.getEspecie());
                System.out.println("Edad: " + animal.getEdad());
            } else {
                System.out.println("El animal no se encuentra en la lista.");
            }
        }
    
        // Método para imprimir el resultado de una búsqueda
        public void imprimirResultadoBusqueda(Animal animal, String criterio, String valor) {
            if (animal != null) {
                System.out.println("Animal encontrado por " + criterio + " (" + valor + "):");
                imprimirDetallesAnimal(animal);
            } else {
                System.out.println("Animal con " + criterio + " (" + valor + ") no encontrado.");
            }
        }
    }





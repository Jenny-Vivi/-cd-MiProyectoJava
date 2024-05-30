package ups.vista;
   import java.util.ArrayList;
   import ups.modelo.Animal;

   public class ObjectView {
    
    public ObjectView() {
        // Constructor vacío
    }

    public void imprimirListaAnimales(ArrayList<Animal> animales) {
        for (Animal animal : animales) {
            System.out.println(animal);
        }
    }

    public void imprimirResultado(Animal animal) {
        if (animal != null) {
            System.out.println("Animal encontrado: " + animal);
        } else {
            System.out.println("Animal no encontrado.");
        }
    }
    }





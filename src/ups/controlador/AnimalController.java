package ups.controlador;

import ups.modelo.Animal;
import ups.vista.AnimalView;

public class AnimalController {

    private Animal modelo;
    private AnimalView vista;

    public AnimalController(Animal modelo, AnimalView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void setNombreAnimal(String nombre) {
        modelo.setNombre(nombre);
    }

    public String getNombreAnimal() {
        return modelo.getNombre();
    }

    public void setEspecieAnimal(String especie) {
        modelo.setEspecie(especie);
    }

    public String getEspecieAnimal() {
        return modelo.getEspecie();
    }

    public void setEdadAnimal(int edad) {
        modelo.setEdad(edad);
    }

    public int getEdadAnimal() {
        return modelo.getEdad();
    }

    public void actualizarVista() {
        vista.imprimirDetallesAnimal(modelo.getNombre(), modelo.getEspecie(), modelo.getEdad());
    }
}


package exam_3_4_luis;

public class Perro extends Animal implements Acciones_Basicas {
    private String Duenio;

    public Perro(String Duenio, String Nombre, int Edad, double peso) {
        super(Nombre, Edad, peso);
        this.Duenio = Duenio;
    }

    public String getDuenio() {
        return Duenio;
    }

    public void setDuenio(String Duenio) {
        this.Duenio = Duenio;
    }

    @Override
    public String hacesonido() {
        return "El perro ladra GUAU! GUAU!";
    }

    @Override
    public boolean esDomestico() {
        return true;
    }

    @Override
    public boolean Moverse(int DistanciaEnMetros) {
        return true;
    }

    @Override
    public String comer(int ComidaEnGramos) {
        return "El perro a comido " + ComidaEnGramos + " gramos de comida.";
    }
    
    
}

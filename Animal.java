
package exam_3_4_luis;

public abstract class Animal {
    //Luis_23280695
    private String Nombre;
    private int Edad;
    private double peso;

    public Animal(String Nombre, int Edad, double peso) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.peso = peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public abstract String hacesonido();
    public abstract boolean esDomestico();
}



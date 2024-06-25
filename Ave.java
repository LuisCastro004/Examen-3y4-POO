
package exam_3_4_luis;

public class Ave extends Animal implements Acciones_Basicas {
    private double VelocidadEnVuelo;
    private String Descripcion;

    public Ave(double VelocidadEnVuelo, String Descripcion, String Nombre, int Edad, double peso) {
        super(Nombre, Edad, peso);
        this.VelocidadEnVuelo = VelocidadEnVuelo;
        this.Descripcion = Descripcion;
    }

    public double getVelocidadEnVuelo() {
        return VelocidadEnVuelo;
    }

    public void setVelocidadEnVuelo(double VelocidadEnVuelo) {
        this.VelocidadEnVuelo = VelocidadEnVuelo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String hacesonido() {
        return "El ave hace un sonido relajante.";
    }

    @Override
    public boolean esDomestico() {
        return false;
    }

    @Override
    public boolean Moverse(int DistanciaEnMetros) {
        return true;
    }

    @Override
    public String comer(int ComidaEnGramos) {
        return "El ave a comido " + ComidaEnGramos + " gramos de comida." ;
    }
    
    public double calcularTiempoDeVuelo (double DistanciaEnKilometros){
    return DistanciaEnKilometros / this.VelocidadEnVuelo;
        
    }
    
    
}

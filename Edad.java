

public class Edad {
    private int  Edad ;
    private String Nombre;
    

    //con contructor contructor
    public Edad (String nombre , int Edad) {
        this.Nombre=nombre;
        this.Edad=Edad;
    }
    public void setEdad (int Edad) {
        this.Edad = Edad;
    }
    public int getEdad () {
        return Edad;
    }
    public void setNombre (int Edad) {
        this.Edad = Edad;
    }
    public String getNombre () {
        return Nombre;
    }
    public void mostrarResultado(){
        System.out.println("Nombre: " + Nombre + ", Edad: " + Edad);
    }
}

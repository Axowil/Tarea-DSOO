

public class Edad {
    private int  Edad ;
    private String Nombre;
    

    //con contructor contructor
    public Edad (String nombre , int Edad) {
        this.Nombre=nombre;
        this.Edad=Edad;

    //contruccion de set y getters para el objeto
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
    //Mostrar Resultado 
    public void mostrarResultado(){
        System.out.println("Nombre: " + Nombre + ", Edad: " + Edad);
    }
}

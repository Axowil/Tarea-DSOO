
public class Personas {
    private String nombre ;
    private int Dni ;
    private int Cui ;

    //con contructor
    public Personas (String nombre , int Dni , int Cui) {
        this.nombre = nombre;
        this.Dni = Dni;
        this.Cui = Cui;
    }
    public void mostrarDatos () {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + Dni);
        System.out.println("CUI: " + Cui);
    }
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return Dni;
    }
    public int getCui() {
        return Cui;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setDni(int dni) {
        this.Dni = dni;
    }
    
    public void setCui(int cui) {
        this.Cui = cui;
    }
}

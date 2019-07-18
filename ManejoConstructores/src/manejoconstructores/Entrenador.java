
package manejoconstructores;

/**
 *
 * @author javie
 */
public class Entrenador {
    private String nombre;
    private int edad;
    private String deporte;
    public Entrenador(){
        setNombre("Luis");
        setEdad(20);
        setDeporte("Tenis");
    }
    public Entrenador(String n, int e, String d){
        setNombre(n);
        setEdad(e);
        setDeporte(d);
    }
    public void setNombre(String e){
        nombre = e;
    }
    public void setEdad(int e){
        edad = e;
    }
    public String getNombre(){
        return nombre ;
    }
    
    public int getEdad(){
        return edad ;
    }
    public void setDeporte(String e){
        deporte = e;
    }
    public String getDeporte(){
        return deporte;
    }
    
    public String toString(){
    String cadena = String.format("Entrenador %s\n%d\n%s", getNombre(),getEdad(),
            getDeporte());
    return cadena;
    }
}

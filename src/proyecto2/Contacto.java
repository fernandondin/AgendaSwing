package proyecto2;
import java.io.Serializable;
import java.util.TreeSet;
public class Contacto implements Comparable<Contacto>,Serializable{
    private String nombre;
    private String correo;
    private String numeroCasa;
    private String numeroCelular;
    public Contacto(String nombre,String correo,
		    String numeroCasa,String numeroCelular){
	this.nombre=nombre;
	this.correo=correo;
	this.numeroCasa=numeroCasa;
	this.numeroCelular=numeroCelular;
    }
    public String getNombre(){
	return this.nombre;
    }
    public void setNombre(String nombre){
	this.nombre=nombre;
    }
    public String getCasa(){
        return this.numeroCasa;
    }
    public void setCasa(String casa){
        this.numeroCasa=casa;
    }
    public String getCelular(){
        return this.numeroCelular;
    }
    public void setCelular(String celular){
        this.numeroCelular=celular;
    }
    public String getCorreo(){
        return this.correo;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }
    @Override public int compareTo(Contacto contacto){
	return (nombre+correo+numeroCasa+numeroCelular).compareToIgnoreCase(contacto.nombre+
                contacto.correo+contacto.numeroCasa+contacto.numeroCelular);
    }
    @Override public boolean equals(Object o){
	if(this.getClass() != o.getClass())
	    return false;
	@SuppressWarnings("unchecked") Contacto contacto = (Contacto)o;
	return (this.nombre.equals(contacto.nombre) && correo.equals(contacto.correo) && 
                numeroCelular.equals(contacto.numeroCelular) && numeroCasa.equals(contacto.numeroCasa));
    }
    @Override public String toString(){
	return this.nombre;
    }
}

package co.edu.uniquindio.poo;

import java.sql.Time;
import java.util.Collection;
import java.util.LinkedList;

public class Reunion {
    public String Descripcion;
    public String Fecha;
    public Time Hora;
    public Collection<Contacto> contactos;

    public Reunion(String Descripcion, String Fecha, Time Hora ){
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
        this.Hora = Hora;
        contactos = new LinkedList<>();
    }

    public void asignarContacto(Contacto contacto){
        contactos.add(contacto);
    }

    public String getDescripcion(){
        return Descripcion;
    }
    public void setDescripcion(String Descripcion){
        this.Descripcion = Descripcion;
    }
    public String getFecha(){
        return Fecha;
    }
    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }
    public Time getHora(){
        return Hora;
    }
    public void setHora(Time Hora){
        this.Hora = Hora;
    }

    public Collection<Contacto> getcontactos(){
        return contactos;
    }
    public void setcontactos(Collection<Contacto> contactos){
        this.contactos = contactos;
    }

    @Override
    public String toString() {
        return "Reunion [Descripcion=" + Descripcion + ", Fecha=" + Fecha + ", Hora=" + Hora + ", Contactos="
                + contactos + "]";
    
    }
}
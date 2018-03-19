/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1ejercicio3;

/**
 *
 * @author User
 */
public class Viaje {
    private Date Fecha;
    private int duracion;
    private Reserva ida;
    private Reserva regreso;
    private Hotel hotel;

    public Viaje(Date Fecha, int duracion, Reserva ida, Reserva regreso) {
        this.Fecha = Fecha;
        this.duracion = duracion;
        this.ida= ida;
        this.regreso= regreso;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    

    public Date getFecha() {
        return Fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Reserva getIda() {
        return ida;
    }

    public Reserva getRegreso() {
        return regreso;
    }

    public void setIda(Reserva ida) {
        this.ida = ida;
    }

    public void setRegreso(Reserva regreso) {
        this.regreso = regreso;
    }
    
}

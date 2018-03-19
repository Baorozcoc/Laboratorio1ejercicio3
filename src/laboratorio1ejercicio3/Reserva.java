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
public class Reserva {
    private Date partida;
    private Date llegada;
    private int NoVuelo;
    private Aeropuerto de;
    private Aeropuerto hacia;

    public Reserva(Date partida, Date llegada, int NoVuelo) {
        this.partida = partida;
        this.llegada = llegada;
        this.NoVuelo = NoVuelo;
    }

    public Aeropuerto getDe() {
        return de;
    }

    public Aeropuerto getHacia() {
        return hacia;
    }

    public void setDe(Aeropuerto de) {
        this.de = de;
    }

    public void setHacia(Aeropuerto hacia) {
        this.hacia = hacia;
    }

    
    public Date getPartida() {
        return partida;
    }

    public Date getLlegada() {
        return llegada;
    }

    public int getNoVuelo() {
        return NoVuelo;
    }

    public void setPartida(Date partida) {
        this.partida = partida;
    }

    public void setLlegada(Date llegada) {
        this.llegada = llegada;
    }

    public void setNoVuelo(int NoVuelo) {
        this.NoVuelo = NoVuelo;
    }
    
    
}

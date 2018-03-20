/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1ejercicio3;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class AgenciaDeViajes {
    private String nombre;
    private ArrayList <Viaje> ofrecidos;
    private Aeropuerto[] aeropuertos;
    private Hotel[] conocidos;
    public AgenciaDeViajes(String nombre) {
        this.nombre = nombre;
        this.ofrecidos= new ArrayList();
        this.aeropuertos= new Aeropuerto[4];
        this.conocidos= new Hotel[5];
    }

    public Aeropuerto[] getAeropuertos() {
        return aeropuertos;
    }

    public Hotel[] getConocidos() {
        return conocidos;
    }

    public void setAeropuertos(Aeropuerto[] aeropuertos) {
        this.aeropuertos = aeropuertos;
    }

    public void setConocidos(Hotel[] conocidos) {
        this.conocidos = conocidos;
    }

    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean AñadirViaje(Viaje viaje){
            ofrecidos.add(viaje);
        return false;
    }
    
    public boolean AñadirAeropuerto(Aeropuerto aeropuerto){
        for(int a=0; a<4; a++){
            if(aeropuertos[a]==null){
                this.aeropuertos[a]= aeropuerto;
                return true;
            }
            for(int b=0; b<5; b++){
                if(aeropuerto.getNombre().equals(aeropuertos[b].getNombre())){
                    return false;
                }
            }
            
        }
        return false;
    }
    
    public boolean AñadirHotel(Hotel hotel){
        for(int a=0; a<5; a++){
            if(conocidos[a]==null){
                this.conocidos[a]= hotel;
                return true;
            }
            for(int b=0; b<5; b++){
                if(hotel.getNombre().equals(conocidos[b].getNombre())){
                    return false;
                }
            }
            
            
        }
        return false;
    }
    
    public void MostrarViajes(){
        System.out.println("La agencia de viajes "+ this.nombre +" le ofrece los siguientes viajes:");
        for(Viaje viaje: ofrecidos){
            int a=1;
            if(viaje!= null){
                System.out.println("Los datos del viaje numero "+ (a+1) + " son: ");
                System.out.println("Hotel "+ viaje.getHotel().getNombre() + ", Dirección "+ viaje.getHotel().getDireccion());
                System.out.println("Fecha de partida: "+ viaje.getFecha().getDia() + "/" + viaje.getFecha().getMes() +"/"+ viaje.getFecha().getAnnio());
                System.out.println("Duración del vuelo: " + viaje.getDuracion());
                System.out.println("Desde el aeropuerto: "+ viaje.getIda().getDe().getNombre() + " Numero de vuelo: "+ viaje.getIda().getNoVuelo());
                System.out.println("Hacia el aeropuerto: "+ viaje.getIda().getHacia().getNombre());
                System.out.println("Fecha de regreso: "+ viaje.getRegreso().getPartida().getDia() +"/"+ viaje.getRegreso().getPartida().getMes() +"/"+ viaje.getRegreso().getPartida().getAnnio());
                System.out.println("Numero de vuelo: "+ viaje.getRegreso().getNoVuelo());
                System.out.println("----------------------------------------------------------------------");
            }
            else{
                break;}
            a++;
            
            
        }
        
    }
    
    public int MenorDuracion(){
        int menor= 0;
        for(Viaje viaje:ofrecidos){
            int c= viaje.getDuracion();
            if(menor==0){
                menor= c;
            }
            else{
                if(c < menor){
                    menor= c;
                }
            }
        }
            return menor;
    }

    public int MayorDuracion(){
        int mayor= 0;
        for(Viaje viaje:ofrecidos){
            if(mayor==0){
                mayor= viaje.getDuracion();
            }
            else{
                if(viaje.getDuracion() > mayor){
                    mayor= viaje.getDuracion();
                }
            }
        }
        return mayor;
    }
}

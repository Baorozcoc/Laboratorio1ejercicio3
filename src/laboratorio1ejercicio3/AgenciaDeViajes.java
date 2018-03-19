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
public class AgenciaDeViajes {
    private String nombre;
    private Viaje []ofrecidos;
    private Aeropuerto[] aeropuertos;
    private Hotel[] conocidos;
    public AgenciaDeViajes(String nombre) {
        this.nombre = nombre;
        this.ofrecidos= new Viaje[10];
        this.aeropuertos= new Aeropuerto[4];
        this.conocidos= new Hotel[5];
    }

    public Viaje[] getOfrecidos() {
        return ofrecidos;
    }

    public Aeropuerto[] getAeropuertos() {
        return aeropuertos;
    }

    public Hotel[] getConocidos() {
        return conocidos;
    }

    public void setOfrecidos(Viaje[] ofrecidos) {
        this.ofrecidos = ofrecidos;
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
        for(int a=0; a<10; a++){
            if(ofrecidos[a]==null){
                this.ofrecidos[a]= viaje;
                return true;
            }
        }
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
        for(int a=0; a<10; a++){
            if(ofrecidos[a]!= null){
                System.out.println("Los datos del viaje numero "+ (a+1) + " son: ");
                System.out.println("Hotel "+ ofrecidos[a].getHotel().getNombre() + ", Dirección "+ ofrecidos[a].getHotel().getDireccion());
                System.out.println("Fecha de partida: "+ ofrecidos[a].getFecha().getDia() + "/" + ofrecidos[a].getFecha().getMes() +"/"+ ofrecidos[a].getFecha().getAnnio());
                System.out.println("Duración del vuelo: " + ofrecidos[a].getDuracion());
                System.out.println("Desde el aeropuerto: "+ ofrecidos[a].getIda().getDe().getNombre() + " Numero de vuelo: "+ ofrecidos[a].getIda().getNoVuelo());
                System.out.println("Hacia el aeropuerto: "+ ofrecidos[a].getIda().getHacia().getNombre());
                System.out.println("Fecha de regreso: "+ ofrecidos[a].getRegreso().getPartida().getDia() +"/"+ ofrecidos[a].getRegreso().getPartida().getMes() +"/"+ ofrecidos[a].getRegreso().getPartida().getAnnio());
                System.out.println("Numero de vuelo: "+ ofrecidos[a].getRegreso().getNoVuelo());
                System.out.println("----------------------------------------------------------------------");
            }
            else
                break;
        }
        
    }
    
    public void MenorDuracion(){
        int menor= 0;
        for(int a=0; a<10; a++){
            if(menor==0){
                menor= ofrecidos[a].getDuracion();
            }
            else{
                if(ofrecidos[a].getDuracion() < menor){
                    menor= ofrecidos[a].getDuracion();
                }
            }
        }
        if( menor==0){
            System.out.println("operacion Fallida");
        }
        else
            System.out.println("El viaje de menor duración es: "+ menor);
    }

    public void MayorDuracion(){
        int mayor= 0;
        for(int a=0; a<10; a++){
            if(mayor==0){
                mayor= ofrecidos[a].getDuracion();
            }
            else{
                if(ofrecidos[a].getDuracion() > mayor){
                    mayor= ofrecidos[a].getDuracion();
                }
            }
        }
        if(mayor==0){
            System.out.println("operacion Fallida");
        }
        else
        System.out.println("El viaje de menor duración es: "+ mayor);
    }
}

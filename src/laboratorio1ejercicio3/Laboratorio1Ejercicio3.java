/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1ejercicio3;
import java.util.Scanner;
/**
 * 
 *
 * @author User
 */
public class Laboratorio1Ejercicio3 {
    
    public Laboratorio1Ejercicio3() {
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String variable1;
        int variable2;
        int c=1;
        int d=1;        
        Date[] fechas= new Date[10];
        Date[] fechas2= new Date[10];
        Date[] fechas3= new Date[10];
        Date[] fechas4= new Date[10];
        Aeropuerto[] aeropuertos= new Aeropuerto[10];
        Aeropuerto[] aeropuertos2= new Aeropuerto[10];
        for(int a=0;a<10;a++){
            fechas[a]= new Date(0,0,0);
            fechas2[a]= new Date(0,0,0);
            fechas3[a]= new Date(0,0,0);
            fechas4[a]= new Date(0,0,0);
            aeropuertos[a]= new Aeropuerto("a");
            aeropuertos2[a]= new Aeropuerto("a");
        } 
        Reserva[] reservas= new Reserva[10];
        Reserva[] reservas2= new Reserva[10];
        Hotel[] hoteles= new Hotel[5];
        for(int a=0; a<10; a++){
            reservas[a]= new Reserva(fechas[a], fechas2[a], 0);
            reservas2[a]= new Reserva(fechas[a], fechas2[a], 0);
            if(a<5){
                hoteles[a]=new Hotel("a","b");
            }
        }
        
        Viaje[] viajes= new Viaje[10];
        for(int a=0; a<10; a++){
            viajes[a]= new Viaje(fechas[a],0,reservas[a],reservas2[a]);
        }
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Nombre de la Agencia: ");
        String agencia= sc.nextLine();
        AgenciaDeViajes Agencia= new AgenciaDeViajes(agencia);
//        for(int a=0;a<10;a++){
//            Agencia.AñadirViaje(viajes[a]);
//        }
        int a=1;
        int b=0;
        while(a==1){
        System.out.println("Bienvenido "+ agencia);
        int opcion;
        System.out.println("Que acción desea realizar?");
        System.out.println("Registrar un viaje(1)");
        System.out.println("Listar todos los viajes(2)");
        System.out.println("Mostrar el viaje de menor duración(3)");
        System.out.println("Mostrar el viaje de mayor duración(4)");
        opcion= sc.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Ingrese datos del hotel: ");
                System.out.println("Nombre: ");
                variable1= sc.nextLine();
                hoteles[b].setNombre(variable1);
                variable1= sc.nextLine();
                hoteles[b].setNombre(variable1);
                System.out.println("Direccion: ");
                variable1= sc.nextLine();
                hoteles[b].setDireccion(variable1);
                viajes[b].setHotel(hoteles[b]);
                System.out.println("Ingrese datos del viaje: ");
                System.out.println("Fecha de inicio: ");
                System.out.println("Dia: ");
                variable2= sc.nextInt();
                fechas[b].setDia(variable2);
                System.out.println("Mes: ");
                variable2= sc.nextInt();
                fechas[b].setMes(variable2);
                System.out.println("Año: ");
                variable2= sc.nextInt();
                fechas[b].setAnnio(variable2);
                reservas[b].setPartida(fechas[b]);
                viajes[b].setFecha(fechas[b]);
                System.out.println("Duración en minutos: ");
                variable2=sc.nextInt();
                viajes[b].setDuracion(variable2);
                System.out.println("Numero de vuelo: ");
                variable2= sc.nextInt();
                reservas[b].setNoVuelo(variable2);
                System.out.println("Nombre del aeropuerto: ");
                variable1= sc.nextLine();
                aeropuertos[b].setNombre(variable1);
                variable1= sc.nextLine();
                aeropuertos[b].setNombre(variable1);
                reservas[b].setDe(aeropuertos[b]);
                
                fechas2[b].setDia((fechas[b].getDia())+(viajes[b].getDuracion()/1440) );
                fechas2[b].setMes(fechas[b].getMes());
                fechas2[b].setAnnio(fechas[b].getAnnio());
                reservas[b].setLlegada(fechas2[b]);
                
                System.out.println("Fecha de regreso: ");
                System.out.println("Dia: ");
                variable2= sc.nextInt();
                fechas3[b].setDia(variable2);
                System.out.println("Mes: ");
                variable2= sc.nextInt();
                fechas3[b].setMes(variable2);
                System.out.println("Año: ");
                variable2= sc.nextInt();
                fechas3[b].setAnnio(variable2);
                reservas2[b].setPartida(fechas3[b]);
                System.out.println("Numero de vuelo: ");
                variable2= sc.nextInt();
                reservas2[b].setNoVuelo(variable2);
                System.out.println("Nombre del aeropuerto: ");
                variable1=sc.nextLine();
                aeropuertos2[b].setNombre(variable1);
                variable1=sc.nextLine();
                aeropuertos2[b].setNombre(variable1);
                reservas[b].setHacia(aeropuertos2[b]);
                reservas2[b].setDe(aeropuertos2[b]);
                reservas2[b].setHacia(aeropuertos[b]);
                fechas4[b].setDia((fechas3[b].getDia())+(viajes[b].getDuracion()/1440) );
                fechas4[b].setMes(fechas3[b].getMes());
                fechas4[b].setAnnio(fechas3[b].getAnnio());
                reservas2[b].setLlegada(fechas2[b]);
                
                viajes[b].setIda(reservas[b]);
                viajes[b].setRegreso(reservas[b]);
                System.out.println("COMPLETO ");
                

                Agencia.AñadirViaje(viajes[b]);
                b++;
                break;
            case 2:
                //Mostrar viajes;
                Agencia.MostrarViajes();
                break;
            case 3:
                //Viaje de menor duracion
                int menor=Agencia.MenorDuracion();
                System.out.println("El viaje de menor duración es: "+ menor);
                break;
            case 4:
                //Viaje de mayor duracion
                int mayor=Agencia.MayorDuracion();
                System.out.println("El viaje de menor duración es: "+ mayor);
                break;
                
            default:
                System.out.println("Numero ingresado no valido");
        }
        System.out.println("Desea continuar operando? Si(1) No (0)");
        a= sc.nextInt();
        c=0;
        d=0;
        }
    
//Scanner sc= new Scanner(System.in);
//        System.out.println("Nombre de la Agencia: ");
//        String agencia= sc.nextLine();
//        AgenciaDeViajes Agencia= new AgenciaDeViajes(agencia);
//        int a=1;
//        while(a==1){
//        System.out.println("Bienvenido "+ agencia);
//        int opcion;
//        System.out.println("Que acción desea realizar?");
//        System.out.println("Registrar un viaje(1)");
//        System.out.println("Listar todos los viajes(2)");
//        System.out.println("Mostrar el viaje de menor duración(3)");
//        System.out.println("Mostrar el viaje de mayor duración(4)");
//        opcion= sc.nextInt();
//        switch(opcion){
//            case 1:
//                System.out.println("Ingrese datos del hotel: ");
//                System.out.println("Nombre: ");
//                variable1=sc.nextLine();
//                hoteles.setNombre(variable1);
//                variable1=sc.nextLine();
//                hoteles.setNombre(variable1);
//                System.out.println("Direccion: ");
//                variable1= sc.nextLine();
//                hoteles.setDireccion(variable1);
//                viajes.setHotel(hoteles);
//                System.out.println("Ingrese datos del viaje: ");
//                System.out.println("Fecha de inicio: ");
//                System.out.println("Dia: ");
//                variable2= sc.nextInt();
//                fechas.setDia(variable2);
//                System.out.println("Mes: ");
//                variable2= sc.nextInt();
//                fechas.setMes(variable2);
//                System.out.println("Año: ");
//                variable2= sc.nextInt();
//                fechas.setAnnio(variable2);
//                reservas.setPartida(fechas);
//                viajes.setFecha(fechas);
//                System.out.println("Duración en minutos: ");
//                variable2=sc.nextInt();
//                viajes.setDuracion(variable2);
//                System.out.println("Numero de vuelo: ");
//                variable2= sc.nextInt();
//                reservas.setNoVuelo(variable2);
//                System.out.println("Nombre del aeropuerto: ");
//                variable1= sc.nextLine();
//                aeropuertos.setNombre(variable1);
//                variable1= sc.nextLine();
//                aeropuertos.setNombre(variable1);
//                reservas.setDe(aeropuertos);
//                
//                fechas2.setDia((fechas.getDia())+(viajes.getDuracion()/1440) );
//                fechas2.setMes(fechas.getMes());
//                fechas2.setAnnio(fechas.getAnnio());
//                reservas.setLlegada(fechas2);
//                
//                System.out.println("Fecha de regreso: ");
//                System.out.println("Dia: ");
//                variable2= sc.nextInt();
//                fechas3.setDia(variable2);
//                d++;
//                System.out.println("Mes: ");
//                variable2= sc.nextInt();
//                fechas3.setMes(variable2);
//                System.out.println("Año: ");
//                variable2= sc.nextInt();
//                fechas3.setAnnio(variable2);
//                reservas2.setPartida(fechas3);
//                System.out.println("Numero de vuelo: ");
//                variable2= sc.nextInt();
//                reservas2.setNoVuelo(variable2);
//                System.out.println("Nombre del aeropuerto: ");
//                variable1=sc.nextLine();
//                aeropuertos2.setNombre(variable1);
//                variable1=sc.nextLine();
//                aeropuertos2.setNombre(variable1);
//                reservas.setHacia(aeropuertos2);
//                reservas2.setDe(aeropuertos2);
//                reservas2.setHacia(aeropuertos);
//                fechas4.setDia((fechas3.getDia())+(viajes.getDuracion()/1440) );
//                fechas4.setMes(fechas3.getMes());
//                fechas4.setAnnio(fechas3.getAnnio());
//                reservas2.setLlegada(fechas2);
//                
//                viajes.setIda(reservas);
//                viajes.setRegreso(reservas);
//                System.out.println( aeropuertos.getNombre() );
//                System.out.println( aeropuertos2.getNombre() );
//                
//                Agencia.AñadirHotel(hoteles);
//                Agencia.AñadirViaje(viajes);
//                
//                break;
//            case 2:
//                //Mostrar viajes;
//                Agencia.MostrarViajes();
//                break;
//            case 3:
//                //Viaje de menor duracion
//                Agencia.MenorDuracion();
//                break;
//            case 4:
//                //Viaje de mayor duracion
//                Agencia.MayorDuracion();
//                break;
//                
//            default:
//                System.out.println("Numero ingresado no valido");
//        }
//        System.out.println("Desea continuar operando? Si(1) No (0)");
//        a= sc.nextInt();
//        c=0;
//        d=0;
//        }
    }
    
    
}

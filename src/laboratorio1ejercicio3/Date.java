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
public class Date {
    int dia;
    int mes;
    int annio;

    public Date(int dia, int mes, int annio) {
        this.dia = dia;
        this.mes = mes;
        this.annio = annio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnnio() {
        return annio;
    }

    public boolean setDia(int dia) {
        if((dia>0)&&(dia<32)){
        this.dia = dia;
        return true;
        }
        else
            return false;
    }

    public boolean setMes(int mes) {
        if((mes>0)&&(mes<13)){
        this.mes = mes;
        return true;
        }
        else
            return false;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    

    
}


import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author chuy4
 */
public class FechaHora {
    //Atributos
    private int dia;
    private int mes;
    private int año;
    private int hora;
    private int minuto;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void Hoy(){
        Calendar c= new GregorianCalendar();
        Date horaActual= new Date();
        c.setTime(horaActual);
        //Hora
        this.hora = c.get(Calendar.HOUR_OF_DAY);
        this.minuto = c.get(Calendar.MINUTE);
        //Fecha
        this.dia = c.get(Calendar.DATE);
        this.mes = c.get(Calendar.MONTH)+1;
        this.año = c.get(Calendar.YEAR);
    }    
    public String FechaLarga(){
        this.Hoy();
        String[] Mes = new String[13];
        Mes[0]="";
        Mes[1]="Enero";
        Mes[2]="Febrero";
        Mes[3]="Marzo";
        Mes[4]="Abril";
        Mes[5]="Mayo";
        Mes[6]="Junio";
        Mes[7]="Julio";
        Mes[8]="Agosto";
        Mes[9]="Septiembre";
        Mes[10]="Octubre";
        Mes[11]="Noviembre";
        Mes[12]="Diciembre";
        String fecha;
        fecha=this.dia+" de "+Mes[this.mes] +" del "+this.año;
        return fecha;
    } 
    public String FechaCorta(){
        this.Hoy();
        String fecha;
        fecha= this.dia+"/"+this.mes+"/"+this.año;
        return fecha;
    }
    public String Hora12(){
        this.Hoy();
        String horario;
        int h;
        h= this.hora-12;
        horario=h+":"+this.minuto;
        return horario;
    }
    public String Hora24(){
        this.Hoy();
        String horario;
        horario=this.hora+":"+this.minuto;
        return horario;
    }
}

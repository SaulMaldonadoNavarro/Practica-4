package fcc.practica4;
import javax.swing.*;
/**
 *
 * @author saulm
 */
public class Hilo4 extends Thread{
    private JTextArea area;
    private RCompartido rc;
    private Cerradura cr;
    
    Hilo4(JTextArea area, RCompartido rc, Cerradura cr){
        this.area =area;
        this.rc=rc;
        this.cr=cr;
    }
    
    public void run(){
        while(true){
            try{
                if(cr.isCerrada()){
                    System.out.println("La Cerradura esta cerrada para "+this.getName());
                    sleep(500);  
                }else
                    cr.Cerrar();
                    System.out.println(this.getName()+" va a escribir");
                   rc.setDatoCompartido(this.getName());
                   area.append(rc.getDatoCompartido()+"\n");
                    cr.Abrir();
                    System.out.println(this.getName()+" termino de escribir");

             }catch(Exception e){
                 e.printStackTrace();
             }
        }
    } 
}

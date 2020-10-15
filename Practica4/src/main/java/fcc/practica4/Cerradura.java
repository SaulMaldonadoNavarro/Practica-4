package fcc.practica4;
/**
 *
 * @author saulm
 */
public class Cerradura {
    private boolean vCerr;
    
    Cerradura(){
        vCerr = false;
    }
    
    public void Abrir(){
       vCerr = false;  
    }
    
    public void Cerrar(){
        vCerr = true;
    }
    
    public boolean isCerrada(){
        return vCerr;
    }
}

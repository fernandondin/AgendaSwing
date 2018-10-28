/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import javax.swing.AbstractListModel;
import java.util.ArrayList;
/**
 *
 * @author brandondin1
 */
public class ModeloLista extends AbstractListModel{
 
    private ArrayList<Contacto> lista = new ArrayList<>();
 
    @Override
    public int getSize() {         
        return lista.size();
    }
 
    @Override
    public Object getElementAt(int index) {
        Contacto p = lista.get(index);
        return p;
    }
    public void addContacto(Contacto p){
        lista.add(p);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    public void eliminarContacto(int index0){
        lista.remove(index0);
        this.fireIntervalRemoved(index0, getSize(), getSize()+1);
    }
    public Contacto getContacto(int index){
        return lista.get(index);
    }
}

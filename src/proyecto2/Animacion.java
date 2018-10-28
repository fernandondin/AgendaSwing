/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;
import javax.swing.*;
public class Animacion extends Thread{
    public JComponent componente;
    public int x1,y1;
    public int tiempo;
    public int coordenada;
    public int opcion;
    public static final int ANIMA_XR=1;
    public static final int ANIMA_XL=3;
    public static final int ANIMA_X1L=4;
    public static final int ANIMA_X1R=5;
    public Animacion(JComponent componente,int x1,int y1,
		int coordenada,int opcion,int tiempo){
	super();
	this.componente=componente;
	this.x1=x1;
	this.y1=y1;
	this.coordenada=coordenada;
	this.opcion=opcion;
	this.tiempo=tiempo;
    }
    public void anima(){
	this.start();
    }
    @Override public void run(){
	int cx=componente.getX();
	int cy=componente.getY();
	int cx2=(int)componente.getWidth();
	int cy2=(int)componente.getHeight();
	switch(opcion){
	case 1: int x=cx;
	    while(x<coordenada){
		x++;
		componente.setBounds(x,cy,cx2,cy2);
		try{
		    Thread.sleep(tiempo);
		}catch(Exception e){
		    System.err.println("error xd");
		}
	    }
	    break;
	case 2:int y=cy;
	    while(y<coordenada){
		y++;
		componente.setBounds(cx,y,cx2,cy2);
		try{
		    Thread.sleep(tiempo);
		}catch(Exception e){
		    System.err.println("error xd");
		}
	    }
	    break;
	case 3: int xn=cx;
	    while(xn>coordenada){
		xn--;
		componente.setBounds(xn,cy,cx2,cy2);
		try{
		    Thread.sleep(tiempo);
		}catch(Exception e){
		    System.err.println("error xd");
		}
	    }
	    break;
        case 4: int x1n=cx2;
	    while(x1n>coordenada){
		x1n--;
		componente.setSize(x1n,cy2);
		try{
		    Thread.sleep(tiempo);
		}catch(Exception e){
		    System.err.println("error xd");
		}
	    }
	    break;
        case 5: int y1n=cx2;
	    while(y1n<coordenada){
		y1n++;
		componente.setSize(y1n,cy2);
                componente.repaint();
		try{
		    Thread.sleep(tiempo);
		}catch(Exception e){
		    System.err.println("error xd");
		}
	    }
	    break;
	}
	
    }
}


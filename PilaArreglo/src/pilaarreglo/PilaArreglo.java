/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaarreglo;
import javax.swing.JOptionPane;
/**
 *
 * @author vicsa
 */
public class PilaArreglo {
     int[] pila;
     int tope;
     int max;
     
     public PilaArreglo(){
    this.tope=0;
    this.max=20;
    this.pila = new int[this.max+1];
}

    PilaArreglo(int max) {
    }
     public int getTope(){
         return tope;
     }
     public void vaciarPila(){
         this.tope=0;
     }
     public boolean pilaLlena(){
         if(this.max==this.tope){
             return true;
         }else{
             return false;
         }
     }
      public boolean pilaVacia(){
         if(this.tope==0){
             return true;
         }else{
             return false;
         }
     }
     public void insertarPila (){
         if(this.pilaLlena()){
             JOptionPane.showMessageDialog(null, "La pila esta llena");
         }else{
             int item;
             
             item= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el item a agregar" ));
             
             this.tope++;
             this.pila[this.tope]=item;
             
             JOptionPane.showMessageDialog(null, "item" + item + "se inserto a la pila");
         }
     }
     
     public void eliminarPila(){
         if(this.pilaVacia())
        {
            
        }
        else
        {
            int item = this.pila[this.tope];
            this.tope--;
            
            
        }        
    }
     
     public void mostrarPila(){
         if(this.pilaVacia()){
             JOptionPane.showMessageDialog(null, "La pila esta vacia \n no hay datos que mostrar", "mostrar datos", JOptionPane.WARNING_MESSAGE);
         }else{
             int i;
             String mostrar="";
             for(i=1;i<=this.tope;i++){
                 mostrar=mostrar+this.pila[i]+"/n";
             }
             JOptionPane.showMessageDialog(null, "total es: " + this.tope+"\n"+"Los datos de la píla son: \n"+mostrar,"mostrar datos",JOptionPane.INFORMATION_MESSAGE);
         }
     }
     
     public static void main(String[] args){
         
         
     }
}

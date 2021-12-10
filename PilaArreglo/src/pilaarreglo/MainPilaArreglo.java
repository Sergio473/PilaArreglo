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
public class MainPilaArreglo {
    public static PilaArreglo Pila;
    
    public static void main(String[] args){
        int max;
        max = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el tamaño de la pila"));
        Pila = new PilaArreglo(max);
        
        int Opcion=0, item;
        do{
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                     "1. Ingresar Datos\n"+
                      "2. Eliminar Datos\n"+
                      "3. Mirar Datos\n"+
                      "4. Vaciar Pila\n"+
                      "5. Salir\n"+
                      "------------------------------------------------\n"+
                      " Ingrese una opcion [1-5]","Menu Pila",JOptionPane.INFORMATION_MESSAGE));
            
            switch(Opcion){
                case 1: Pila.insertarPila();break;
                case 2: Pila.eliminarPila();break;
                case 3: Pila.mostrarPila();break;
                case 4: Pila.vaciarPila();break;
                default: JOptionPane.showMessageDialog(null, "Ingrese una opcion validad \n","Error Opcion",JOptionPane.WARNING_MESSAGE);break;
            }
        }
        while(Opcion!=0);
    }
}

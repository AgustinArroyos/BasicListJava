/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimple;

import javax.swing.JOptionPane;

/**
 *
 * @author sring
 */
public class ListaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     ListBook obj = new ListBook();
     
     byte opcion;
     
     do{
        opcion = Byte.parseByte(JOptionPane.showInputDialog("Menu Principal \n" +"1.Agregar Libro\n" + "2.Listar Libros \n"+"3.Limpiar Libros\n" + "4.Salir\n"));
        
        switch(opcion ){
            case 1 :
                obj.addBook();
                break;
            case 2 :
                obj.getBooks();
                break;
            case 3 :
                obj.clearListBook();
                break;
            case 4 : 
                JOptionPane.showMessageDialog(null, "Se cierra la app*");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Se incgreso una opcion incorrecta");
        }
        
        
        
    }while(opcion !=4);
        
        
    }
    
}

/*+
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimple;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sring
 */
public class ListBook {
    ArrayList<Book> listbook = new ArrayList();
    
    
    public String Input(String text){
        return JOptionPane.showInputDialog( text);
    }
    
    
    public void addBook(){
        
        String name = Input("Ingrese el nombre del libro");
        String edition = Input("Ingrese la edicion del libro");
        Book book = new Book();
        book.setName(name);
        book.setEdition(edition);
        listbook.add(book);
            
    }
    
    public void getBooks(){
        String string = "";
        
        
        for(int i=0; i<listbook.size();i++){
                 string +="Libro numero="+(i+1)+"\n";
                string += "Nombre="+listbook.get(i).getName()+"\n";
                string += "Edicion="+listbook.get(i).getEdition()+"\n";
            
        }
        
       JOptionPane.showMessageDialog(null, string);
    }


    public void clearListBook(){
        listbook.clear();
    }
    
}



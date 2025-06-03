/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendatelefonica_main;

/**
 *
 * @author Javier Perez
 */
public class AgendaTelefonica_Main {

    /**
     * @param args the command line arguments
     */
    static AdminAgenda contactos = new AdminAgenda();
    
    public static void main(String[] args) {
        // TODO code application logic here
        contactos.cargarContactosFile();
        contactos.mostrar(); 
        contactos.addContacto();
        contactos.mostrar();
        contactos.actualizarContactosFile();
    }
    
}

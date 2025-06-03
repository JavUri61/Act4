package agendatelefonica_main;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Javier Perez
 */
public final class AdminAgenda {
    HashMap<String, String> myContact = new HashMap<>();
    String[] arrayContacto;
    
    String inputFilename = "C:\\Users\\azuli\\NetBeansProjects\\AgendaTelefonica_Main\\src\\agendatelefonica_main\\input.csv";
    String outputFilename = "C:\\Users\\azuli\\NetBeansProjects\\AgendaTelefonica_Main\\src\\agendatelefonica_main\\output.csv";
    
        public AdminAgenda () {
                // contactos = new ArrayList<Agenda> ();
        
        }
    
        public void cargarContactosFile(){
             BufferedReader bufferedReader = null;
             BufferedWriter bufferedWriter = null;
        
            try {
                bufferedReader = new BufferedReader(new FileReader(inputFilename));
                bufferedWriter = new BufferedWriter(new FileWriter(outputFilename));
        
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                     System.out.println(line);
                     //bufferedWriter.write(line + "\n"); 
                     arrayContacto = line.split(",");
                     myContact.put(arrayContacto[0], arrayContacto[1]);
        
                 }
            } 
            catch(IOException e) {
                System.out.println("IOException catched while reading: " + e.getMessage());
            }
            finally {
                try {
                    if (bufferedReader != null) {
                        bufferedWriter.close();
                     }
                }
                catch(IOException e) {
                    System.out.println("IOException catched while closing: " + e.getMessage());
                 }
            }
        }
        

        public void mostrar() {
            System.out.println("Listado en HashMap ");
            for (HashMap.Entry<String,String> entry : myContact.entrySet()){
                String key = entry.getKey();
                String value = entry.getValue();
                
                System.out.println(key+ " " + value);
            }
            
        }
      

        public void  addContacto() {
            System.out.println("Metodo addContacto ");
            myContact.put("5572091632" , "Javier Perez");
        }
        
        
        public void actualizarContactosFile(){
            BufferedWriter bufferedWriter = null;
            
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(outputFilename));
                
                String line;
                for (HashMap.Entry<String,String> entry : myContact.entrySet()){
                    String key = entry.getKey();
                    String value = entry.getValue();
                    
                    line = key + "," + value;
                    bufferedWriter.write(line+ "\n");
             }
            } 
            catch (IOException e) {
                  System.out.println("IOException catched while reading: " + e.getMessage());
            }
            finally {
                try {
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                     }
                }
                catch (IOException e) {
                    System.out.println("IOException catched while closing: " + e.getMessage());
                 }
            
            }
        }  
        
}

      //  public void actualizarContactosFile(){
         //   BufferedWriter buferredWriter = null;
            
            





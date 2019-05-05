
package ejemplo_2;

import javax.swing.JOptionPane;


public class Ejemplo_2 {

   
    public static void main(String[] args) {
       
        String nombre;
        int edad;
        char sexo;
        
        JOptionPane.showMessageDialog(null, "Hola, como estas");
        JOptionPane.showMessageDialog(null, "Por favor digite los siguientes datos");
        nombre=JOptionPane.showInputDialog("Nombres y apellidos: ");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Edad"));
        sexo=JOptionPane.showInputDialog("Sexo").charAt(0);
        
        JOptionPane.showMessageDialog(null, "El ciudadano "+nombre+" No se encuentra en la base de datos");
        JOptionPane.showMessageDialog(null,  "Edad ("+edad+ ") invalida");
        JOptionPane.showMessageDialog(null, "el sexo ("+sexo+") no se encuentra registrado");
        
        
    }
    
}

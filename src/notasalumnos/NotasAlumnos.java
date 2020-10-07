/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasalumnos;

/**
 *
 * @author Notebook
 */
public class NotasAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a1 = new Alumno("ignacio","camillucci");
        
        a1.agregarNota(8.5f);
        a1.agregarNota(4.5f);
        a1.agregarNota(5.66f);
        a1.agregarNota(10);
        a1.agregarNota(10);
        
        
        System.out.println("Notas cargadas: " + a1.cantidadNotasCargadas());
        
       
        System.out.println(a1.getNfinales());
        
        System.out.println("Promedio: " + a1.Promedio());
        
        a1.cambiarNota(4,3.33f);
        System.out.println(a1.getNfinales());
        
        if(a1.buscarNota(4)){
            System.out.println("La nota se encuentra en nuestro listado");
        }else{
            System.out.println("La nota no se encuentra en nuestro listado");
        }
       
    }
    
}

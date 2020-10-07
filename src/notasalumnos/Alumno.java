/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasalumnos;

import java.util.ArrayList;

/**
 *
 * @author Notebook
 */
public class Alumno {
    private String nombre,apellido;
    private ArrayList<Float> nfinales;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nfinales = new ArrayList<Float>();
        System.out.println("Constructor cargado correctamente.");
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ArrayList<Float> getNfinales() {
        return nfinales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNfinales(ArrayList<Float> nfinales) {
        this.nfinales = nfinales;
    }
    
    public void agregarNota(float nota){
        nfinales.add(nota);
    }
    
    public boolean borrarNotas(){
        nfinales.clear();
        if(nfinales.isEmpty()){
            return true;
        }else{
            return false;
        }
    
    }
    
    public int cantidadNotasCargadas(){
        return nfinales.size();
    }
    
    
    public float Promedio(){
        float nTotal = 0;
        // si se puede optimizar el for
        for(float nf : nfinales){
            nTotal+= nf;
        }
        
        return nTotal/nfinales.size();
    
    }
    
    public void cambiarNota(int index, float nota){
        nfinales.set(index, nota);
        
    }
    
    
    
    // Cambiar int por float,(que se puedan buscar en el ArrayList numero tipo float) 
    // Cantaidad de veces encontrado
     public boolean buscarNota(int nota){
        
        boolean encontrado = false;
        
        for(float i : nfinales){
            if(i == nota){
                encontrado = true;
            }
        }
        
        return encontrado;
        
    }
    
    
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class BD {
    private ArrayList<Persona> personas;

    public BD() {
        this.personas = new ArrayList<>();
        this.personas.add(new Persona("Sulay","Cupitra Cupitra"));
        this.personas.add(new Persona("Tania","Cupitra Cupitra"));
        this.personas.add(new Persona("Bonifacio","Cupitra Yara"));
        this.personas.add(new Persona("Maria","Cupitra"));
    }

    public void addPersona(Persona persona){
      this.personas.add(persona);
    }
    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    
    
    
}

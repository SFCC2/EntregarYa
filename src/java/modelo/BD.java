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

    private static ArrayList<Persona> personas;

    public BD() {
        if (personas == null) {
            this.personas = new ArrayList<>();
            this.personas.add(new Persona(1018,"Sulay", "Cupitra Cupitra"));
            this.personas.add(new Persona(531016,"Tania", "Cupitra Cupitra"));
        }
    }

    public void addPersona(Persona persona) {
        this.personas.add(persona);
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

}

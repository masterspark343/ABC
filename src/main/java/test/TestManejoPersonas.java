package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personadao = new PersonaDAO();

//INSERTAR UN NUEVO OBJETO DE TIPO PERSONA 
//        Persona personaNueva = new Persona("Antonio", "Lopez", "lolopez@mail.com", "55888555");
//        personadao.insertar(personaNueva); //sirve para ver cuantos usuarios se han registrado
//        List<Persona> personas = personadao.seleccionar();
//
//        for (Persona persona : personas) {
//            System.out.println("persona = " + persona);
//        }
//MODIFICAR LA PERSONA EXISTENTE
//        Persona personaModificada = new Persona(5, "Jose", "Lopez", "jlopez@mail.com", "55446622");
//        personadao.modificar(personaModificada);
//
//        List<Persona> personas = personadao.seleccionar();
//        personas.forEach((persona) -> {
//            System.out.println("persona = " + persona);
//        });
//        
        Persona personaBorrar = new Persona(5);
        personadao.borrar(personaBorrar);

        List<Persona> personas = personadao.seleccionar();
        personas.forEach((persona) -> {
            System.out.println("persona = " + persona);
        });
    }

}

package cr.ac.una.aspectos.session;

import cr.ac.una.aspectos.entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PersonaSession {
    public Persona getPersonaById(int personaId){
        System.out.println("Llamada a getPersonaById");
        return new Persona();
    }
    
    public void createPersona(Persona persona){
        System.out.println("Llamada a createPersona");
    }
    
    public List<Persona> getAllPersona(){
        System.out.println("Llamada a getAllPersona");
        return new ArrayList<Persona>();
    }
}

//el component se le indica que es un componente de sprint, 
//que se usa para la capa de servicio, el que tiene la logica para guardar en la base de datos
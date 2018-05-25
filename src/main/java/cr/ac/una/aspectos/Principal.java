package cr.ac.una.aspectos;
import cr.ac.una.aspectos.entidades.Persona;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cr.ac.una.aspectos.session.PersonaSession;

public class Principal {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        PersonaSession personaSession = context.getBean(cr.ac.una.aspectos.session.PersonaSession.class);//Obtencion de clase del contexto de Spring
        personaSession.getPersonaById(1);
        personaSession.createPersona(new Persona());
    }
    
}

//genera error ya que no encuentra bean,  1) se declara los beans uno por uno 2) decirle a spring cuales son los components
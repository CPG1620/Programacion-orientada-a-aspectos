package cr.ac.una.aspectos.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;

public class PersonaAOP {
    @Before ("execution (* cr.ac.una.aspectos.session.PersonaSession.createPersona(..))") //Antes de hacer el llamado a logBefore haga este metodo
    public void logBeforeCreatePersona(JoinPoint joinPoint){
        System.out.println("logBeforeCreatePersona");
    }
}

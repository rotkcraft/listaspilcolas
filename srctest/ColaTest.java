
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rcraft on 04-17-16.
 */
public class ColaTest
{

    @Test
    public void probando() throws Exception
    {
        Pila<Integer> integerPila=new Pila<Integer>();
        integerPila.apilar(new Integer(1));
        integerPila.apilar(new Integer(2));
        integerPila.apilar(new Integer(3));
        integerPila.apilar(new Integer(0));
        System.out.println(integerPila);
        System.out.println(integerPila.cima());
        System.out.println(integerPila.desapilar());
        System.out.println(integerPila.desapilar());
        System.out.println(integerPila.desapilar());
        System.out.println(integerPila.desapilar());
        System.out.println(integerPila);

        Cola<Integer> cola=new Cola<Integer>();
        cola.encolar(new Integer(1));
        cola.encolar(new Integer(2));
        cola.encolar(new Integer(3));
        cola.encolar(new Integer(4));

        System.out.println(cola);
        System.out.println(cola.cima());
        System.out.println(cola.descolar());
        System.out.println(cola.descolar());
        System.out.println(cola.descolar());
        System.out.println(cola.descolar());
        System.out.println(cola);





    }
}
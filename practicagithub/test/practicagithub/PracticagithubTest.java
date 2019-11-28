/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Brian
 */
public class PracticagithubTest {
    
    public PracticagithubTest() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Practicagithub.main(args);
    }

    @Test
    public void testSuma() {
        System.out.println("suma");
        int expResult = 5;
        int result = Practicagithub.suma();
        assertEquals(expResult, result);
    }

    @Test
    public void testDivisio() {
        System.out.println("divisio");
        double expResult = 0.0;
        double result = Practicagithub.divisio();
        assertEquals(expResult, result, 0.0);
    }
    
}

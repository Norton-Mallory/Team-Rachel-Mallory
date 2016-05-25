/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rachelbarnes
 */
public class TaskControlTest {
    
    public TaskControlTest() {
    }

    /**
     * Test of calcAreaOfTriangle method, of class TaskControl.
     */
    @Test
    public void testCalcAreaOfTriangle() {
        System.out.println("calcAreaOfTriangle");
        System.out.println("Test case 1");
        double base = 20;
        double height = 15;
        TaskControl instance = new TaskControl();
        double expResult = 150;
        double result = instance.calcAreaOfTriangle(base, height);
        assertEquals(expResult, result, 0.0);
         
        
        System.out.println("calcAreaOfTriangle");
        System.out.println("Test case 2");
        base = 14;
        height = -1;
        expResult = -1;
        result = instance.calcAreaOfTriangle(base, height);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("calcAreaOfTriangle");
        System.out.println("Test case 3");
        base = -2;
        height = 35;
        expResult = -1;
        result = instance.calcAreaOfTriangle(base, height);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("calcAreaOfTriangle");
        System.out.println("Test case 4");
        base = 80;
        height = 4;
        expResult = -1;
        result = instance.calcAreaOfTriangle(base, height);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("calcAreaOfTriangle");
        System.out.println("Test case 5");
        base = 12;
        height = 0;
        expResult = -1;
        result = instance.calcAreaOfTriangle(base, height);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("calcAreaOfTriangle");
        System.out.println("Test case 6");
        base = 0;
        height = 15;
        expResult = -1;
        result = instance.calcAreaOfTriangle(base, height);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("calcAreaOfTriangle");
        System.out.println("Test case 7");
        base = 36;
        height = 19;
        expResult = 342;
        result = instance.calcAreaOfTriangle(base, height);
        assertEquals(expResult, result, 0.0);
        
    }
    
    
}

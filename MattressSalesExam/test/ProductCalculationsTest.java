/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mmola
 */
public class ProductCalculationsTest {
    
    public ProductCalculationsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of GetVat method, of class ProductCalculations.
     */
@Test
    public void testGetVat() {
        ProductCalculations calc = new ProductCalculations(3500.0);
        assertEquals(525.0, calc.GetVat(), 0.01);
    }

    /**
     * Test of GetCommission method, of class ProductCalculations.
     */
@Test
    public void testGetCommission() {
        ProductCalculations calc = new ProductCalculations(3500.0);
        assertEquals(175.0, calc.GetCommission(), 0.01);
    }

    /**
     * Test of GetTotal method, of class ProductCalculations.
     */
@Test
    public void testGetTotal() {
        ProductCalculations calc = new ProductCalculations(3500.0);
        assertEquals(4200.0, calc.GetTotal(), 0.01);
    }
    
}

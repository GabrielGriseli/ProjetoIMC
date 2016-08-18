package br.edu.uricer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class CalculoTest {
    
    
    //Homens abaixo do peso
    @Test
    public void testHomemAbaixoDoPeso(){
        Calculo calculo = new Calculo("M", 1.90, 50);
        
        int esperado = 0;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }
    
    //Homem no peso ideal
    @Test
    public void testHomemPesoIdeal(){
        Calculo calculo = new Calculo("M", 1.70, 70);
        
        int esperado = 1;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }
    
    
    //Homem acima do peso
    @Test
    public void testHomemAcimaDoPeso(){
        Calculo calculo = new Calculo("M", 1.50, 90);
        
        int esperado = 2;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }
    
    
    //Mulher abaixo do peso
    @Test
    public void testMlherAbaixoDoPeso(){
        Calculo calculo = new Calculo("F", 1.90, 40);
        
        int esperado = 0;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }
    
    
    //Mulher no peso ideal
    @Test
    public void testMlherPesoIdeal(){
        Calculo calculo = new Calculo("F", 1.70, 65);
        
        int esperado = 1;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }
    
    //Mulher abaixo do peso
    @Test
    public void testMlherAcimaDoPeso(){
        Calculo calculo = new Calculo("F", 1.50, 90);
        
        int esperado = 2;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }
    
}

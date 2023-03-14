package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest { 
	 
    @Test 
    public void equilateralEqualSides() throws TriangleException { 
        Triangle triangle = new Triangle(2, 2, 2);  // Triângulo Equilatero - Entrada 2,2,2
 
        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind()); 
    }
    @Test
    public void scaleneDifferentSides() throws Exception {
    	Triangle triangle = new Triangle (5,6,7); // Triângulo Escaleno - Entrada 5,6,7
    	assertEquals(TriangleKind.SCALENE,triangle.getKind());
    }
    @Test
    public void isoscelesTwoSides() throws Exception {
    	Triangle triangle = new Triangle(3,3,2); // Triângulo Isosceles - Entrada 3,3,2
    	assertEquals(TriangleKind.ISOSCELES,triangle.getKind());
    }
    @Test
    public void equilateralTriangleOneSide() throws Exception { // Triângulo Equilatero - Verifica o Número de Lados Únicos
    	Triangle triangle = new Triangle (2,2,2);
    	int numberOfUniqueSides = triangle.getNumberOfUniqueSides(); 
    	assertTrue(numberOfUniqueSides == 1); // Verifica se condição é verdadeira
    }
    @Test
    public void scaleneTriangleThreeSides() throws Exception { // Triângulo Escaleno - Verifica o Número de Lados Únicos
    	Triangle triangle = new Triangle (5,6,7);
    	int numberOfUniqueSides = triangle.getNumberOfUniqueSides();
    	assertTrue(numberOfUniqueSides == 3);
    	
    }
    @Test
    public void isoscelesTriangleTwoSides() throws Exception { // Triângulo Isoceles - Verifica o Número de Lados Únicos
    	Triangle triangle = new Triangle(3,3,2);
    	int numberOfUniqueSides = triangle.getNumberOfUniqueSides();
    	assertTrue(numberOfUniqueSides == 2);
    }
    @Test
    public void triangleSidesZero() { // Triângulo Lados Iguais a 0
    	Assertions.assertThrows(TriangleException.class, ()->{new Triangle(0,0,0);});// Classe Assertion método assertThrows
    }
    @Test
    public void triangleImpossibleSides() { // Triângulos Lados Negativos - lados menores que 0
    	Assertions.assertThrows(TriangleException.class,()->{new Triangle(-5,-6,-7);});
   }
    @Test
    public void triangleInequality() { // Desigualdade de Lados - Não é possível formar um triânguloe
    	Assertions.assertThrows(TriangleException.class,()->{new Triangle(2,2,5);});
    }
    
    
    
    
}
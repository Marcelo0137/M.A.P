package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest { 
	 
    @Test 
    public void equilateralTriangleHaveEqualSides() throws TriangleException { 
        Triangle triangle = new Triangle(2, 2, 2);  // Triângulo Equilatero - Entrada 2,2,2
 
        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind()); 
    }
    @Test
    public void scaleneHasNoEqualSides() throws TriangleException {
    	Triangle triangle = new Triangle (5,6,7); // Triângulo Escaleno - Entrada 5,6,7
    	assertEquals(TriangleKind.SCALENE,triangle.getKind());
    }
    @Test
    public void isoscelesTriangleTwoEqualSides() throws TriangleException {
    	Triangle triangle = new Triangle(3,3,2); // Triângulo Isosceles - Entrada 3,3,2
    	assertEquals(TriangleKind.ISOSCELES,triangle.getKind());
    }
    @Test
    public void equilateralTriangleUniqueSide() throws TriangleException { // Triângulo Equilatero - Verifica o Número de Lados Únicos
    	Triangle triangle = new Triangle (2,2,2);
        int ladosDiferentes = 1;
        assertEquals(ladosDiferentes,triangle.getNumberOfUniqueSides()); // Compara valor esperado com o valor atual	
    }
    @Test
    public void scaleneTriangleThreeSides() throws TriangleException { // Triângulo Escaleno - Verifica o Número de Lados Únicos
    	Triangle triangle = new Triangle (5,6,7);
    	int ladosDiferentes = 3;
    	assertEquals(ladosDiferentes,triangle.getNumberOfUniqueSides()); 
    	
    }
    @Test
    public void isoscelesTriangleTwoSides() throws TriangleException { // Triângulo Isoceles - Verifica o Número de Lados Únicos
    	Triangle triangle = new Triangle(3,3,2);
    	int ladosDiferentes = 2;
    	assertEquals(ladosDiferentes,triangle.getNumberOfUniqueSides());
    }
    @Test
    public void triangleSidesEqualZero() { // Triângulo Lados Iguais a 0
    	Assertions.assertThrows(TriangleException.class, ()->{new Triangle(0,0,0);});// Classe Assertion método assertThrows
    }
    @Test
    public void triangleSidesNegative() { // Triângulos Lados Negativos/ lados menores que 0
    	Assertions.assertThrows(TriangleException.class,()->{new Triangle(-5,-6,-7);});
   }
    @Test
    public void triangleInequality() { // Desigualdade de Lados
    	Assertions.assertThrows(TriangleException.class,()->{new Triangle(2,2,5);});
    }
    
    
    
    
}
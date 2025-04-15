package main;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestTriangulo {

    @Test
    public void testGetArea() {
        double altura = 3;
        double base = 2;
//Retorno esperado para a altura e base especificada
        double retornoEsperado = 5;
//Instancia um objeto da classe Triangulo
        Triangulo triangulo = new Triangulo(base, altura);
//Chama a operacao getArea()
        double retornoFeito = triangulo.getArea();
//Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}

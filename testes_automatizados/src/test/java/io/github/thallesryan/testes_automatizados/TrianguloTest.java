package io.github.thallesryan.testes_automatizados;

import io.github.thallesryan.testes_automatizados.calculadora.Calculadora;
import io.github.thallesryan.testes_automatizados.triangulo.Triangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TrianguloTest {


    @DisplayName("Deve retornar que o tipo do triângulo é equilátero")
    @Test
    void test_triangulo_equilatero() {
        String s = Triangulo.verificarTipoTriangulo(3D, 3D, 3D);
        Assertions.assertEquals("equilátero", s);
    }

    @DisplayName("Deve retornar que o tipo do triângulo é isósceles")
    @Test
    void test_triangulo_isosceles() {
        String s = Triangulo.verificarTipoTriangulo(5D, 5D, 8D);
        Assertions.assertEquals("isósceles",s );
    }

    @DisplayName("Deve retornar que o tipo do triângulo é escaleno")
    @Test
    void test_triangulo_escaleno() {
        String s = Triangulo.verificarTipoTriangulo(5D, 3D, 8D);
        Assertions.assertEquals("escaleno",s);
    }

    @DisplayName("Deve retornar erro ao tentar passar lado 0 para o triângulo")
    @Test
    void test_triangulo_lado_0() {
        Assertions.assertThrows(RuntimeException.class,() -> Triangulo.verificarTipoTriangulo(0D, 3D, 8D));
    }

}

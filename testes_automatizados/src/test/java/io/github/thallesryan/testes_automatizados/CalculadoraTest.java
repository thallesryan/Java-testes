package io.github.thallesryan.testes_automatizados;

import io.github.thallesryan.testes_automatizados.calculadora.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class CalculadoraTest {


    @BeforeEach
    public void setup() {
        // Given / Arrange

    }

    @DisplayName("Deve retornar os valores somados")
    @Test
    void test_add() {
        Double add = Calculadora.add(1D, 1D);
        Assertions.assertEquals(add, 2D);
    }


    @DisplayName("Deve retornar os valores subtraidos")
    @Test
    void test_sub(){
        Double sub = Calculadora.sub(5D, 3D);
        Assertions.assertEquals(sub, 2D);
    }

    @DisplayName("Deve retornar os valores Multiplicados")
    @Test
    void test_mul() {
        Double mult = Calculadora.mul(2D, 3.5);
        Assertions.assertEquals(mult, 7D);
    }


    @DisplayName("Deve retornar os valores Dividos")
    @Test
    void test_div(){
        Double div = Calculadora.div(6D, 3D);
        Assertions.assertEquals(div, 2D);
    }

}
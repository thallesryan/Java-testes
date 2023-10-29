package io.github.thallesryan.testes_automatizados.triangulo;

public abstract class Triangulo {

    public static String verificarTipoTriangulo(double a, double b, double c) {
        validarTriangulo(a,b,c);
        if (a == b && b == c) {
            return "equilátero";
        } else if (a == b || a == c || b == c) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }

    private static void validarTriangulo(double a, double b, double c){
        if(a == 0D || b == 0D || c == 0D){
            throw new RuntimeException("Valores do triângulo não podem ser zero");
        }
    }
}

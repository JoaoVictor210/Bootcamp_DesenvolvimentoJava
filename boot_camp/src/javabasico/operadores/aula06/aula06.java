package javabasico.operadores.aula06;

public class aula06 {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNo = numero1 == numero2;

        System.out.println("numero1 e igual a numero2"+simNo);

        simNo = numero1 != numero2;
        System.out.println("numero1 e diferente de numero2"+simNo);

        simNo = numero1 > numero2;
        System.out.println("numero1 e maior do que numero2"+simNo);

        simNo = numero1 < numero2;
        System.out.println("numero1 e menor que numero2"+simNo);
    }
}

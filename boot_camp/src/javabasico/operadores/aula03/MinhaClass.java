package javabasico.operadores.aula03;

public class MinhaClass {
    public static void main(String[] args) {
        int i = 10;

        i++;
        System.out.println(i);
        i--;
        System.out.println(i);

        //Imprimindo o numero negativo
        System.out.println(-i);

        //incrementando i em mais 1 numero
        System.out.println(++i);

        //nega o valor de uma expressão booleana.
        boolean b = false;
        System.out.println("Inverteu:" + !b);
    }
}

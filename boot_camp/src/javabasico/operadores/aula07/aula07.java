package javabasico.operadores.aula07;

public class aula07 {
    public static void main(String[] args) {
        //operador logicos

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("True");
        } else if (condicao1 || condicao2) {
            System.out.println("Umas das condiçãos são verdadeira");
        }

    }
}

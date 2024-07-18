package javabasico.Java_Antomia_classes.aula06;

public class MinhaClass {
    public static void main(String[] args) {
        //Java Beans Variáveis

        //Não recomendado
        double salMedio = 1500.23; //variável abreviada, oque dificulta a compreensão
        String emails1 = "aluno@escola.com"; //confuso se a variável seria um array ou único e-mail
        String myName = "JOSEPH"; //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não

        //Recomendado
        double salarioMedio=1500.23;
        String email ="aluno@escola.com";
        String [] email2 = {"aluno@escola.com","professor@escola.com"};
        String meuNome = "JOSEPH";

        System.out.println(salMedio);
        System.out.println(emails1);
        System.out.println(myName);
        System.out.println(salarioMedio);
        System.out.println(email);
        System.out.println(email2);
        System.out.println(meuNome);


    }
}

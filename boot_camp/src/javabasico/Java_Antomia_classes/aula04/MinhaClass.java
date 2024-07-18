package javabasico.Java_Antomia_classes.aula04;
//Abaixo, veja um exemplo de um algoritmo de validação, de aprovação de estudante.
public class MinhaClass{
    public static void main(String[] args) {
     int mediaFinal = 6;

     if (mediaFinal < 6){
         System.out.println("Reprovador");
     }else if (mediaFinal == 6){
         System.out.println("Prova minerva");
     }else {
         System.out.println("Aprovado");
     }
    }
}

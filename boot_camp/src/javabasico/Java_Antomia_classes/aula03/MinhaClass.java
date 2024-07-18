package javabasico.Java_Antomia_classes.aula03;

public class MinhaClass {
    public static void main(String[] args) {
        String carro = "BMW";
        int ano = 2019;

        System.out.println("nome do carro: " + carro +" ano do carro: " + ano+" carro a venda: "+carroAvenda(false));


    }
    public static boolean carroAvenda (boolean venda){
        return venda;
    }
}
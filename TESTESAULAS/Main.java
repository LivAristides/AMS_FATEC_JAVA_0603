package TESTESAULAS;

//classes em java => tipo de dados composto heterogêneo (utilizada para declarar e instanciar objetos)
//pode ser composta de vários tipos de dados: 
//declaração de dados: atributos ou propriedades
// -dados primitivos escalares; 
// -dados compostos => vetores e matrizes; 
//objetos declarados a partir de outra/mesma classe
//declaração de unidades funcionais (métodos):
// -declaração de uma função (pode ter retorno de valor ou não)

public class Main {
    public static void main(String args[]) {
        // Declaração de objetos
        Triangulo triangulo;
        Triangulo triangulo2;

        // Instanciação dos objetos
        triangulo = new Triangulo();
        triangulo2 = new Triangulo(10.1, 5.75, 6.45);

        // Definição dos lados do primeiro triângulo
        triangulo.setLado1(100.123);
        triangulo.setLado2(50.3);
        triangulo.setLado3(70.12);

        // Pegando os valores dos lados
        double l1 = triangulo.getLado1();
        double l2 = triangulo.getLado2();
        double l3 = triangulo.getLado3();

        // Exibindo os lados e perímetro dos triângulos
        System.out.println("\nLados do triângulo 1: " + l1 + " " + l2 + " " + l3 + 
                           " | Perímetro: " + triangulo.perimetro());
        
        System.out.println("\nLados do triângulo 2: " + triangulo2.getLado1() + 
                           " " + triangulo2.getLado2() + " " + triangulo2.getLado3() +
                           " | Perímetro: " + triangulo2.perimetro());

        // Verificando se é um triângulo válido
        if (!triangulo.ehTriangulo()) { 
            System.out.println("\nTriângulo 1 NÃO forma um triângulo válido!");
        } else {
            System.out.println("\nTriângulo 1 forma um triângulo válido!");
        }
    }
}


//classe privada e interna => só pode ser usada dentro desse arquivo e só existe dentro desse arquivo
/*class Sample {
    //atributos
}*/




package TESTESAULAS;

public class Triangulo {
    // Atributos privados para garantir encapsulamento
    private double lado1;
    private double lado2;
    private double lado3;

    // Construtor padrão (vazio)
    public Triangulo() {
        System.out.println("\nExecutando construtor vazio");
        this.lado1 = this.lado2 = this.lado3 = 0.0;
    }

    // Construtor com parâmetros
    public Triangulo(double lado1, double lado2, double lado3) {
        System.out.println("\nExecutando construtor com parâmetros");
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    //métodos => permitem a manipulação dos atributos (set e get)
    // tipo de dado retorno
    // nome método
    // lista de argumentos => tipo de dado e o nome do argumento, tipo nome ...
    //{...código...}
    //public, private ou protected
    //usado externamente

    // Métodos Getters e Setters
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado1() {
        return this.lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado2() {
        return this.lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getLado3() {
        return this.lado3;
    }

    // Método para calcular o perímetro do triângulo
    public double perimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }

    // Método para verificar se os lados formam um triângulo
    public boolean ehTriangulo() {
        return (this.lado1 + this.lado2 > this.lado3) &&
               (this.lado1 + this.lado3 > this.lado2) &&
               (this.lado2 + this.lado3 > this.lado1);
    }
}

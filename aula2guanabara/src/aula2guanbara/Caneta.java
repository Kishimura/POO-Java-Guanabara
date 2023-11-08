package aula2guanbara;

public class Caneta {

    // ESSES SÃO OS ATRIBUTOS
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    // ESTES SÃO OS METODOS
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Está tampada? " + this.tampada);

    }
    void rabiscar(){
        if (this.tampada == true ) {
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }

    }

    void tampar(){
        this.tampada = true;

    }

    void destampar() {

    }
}
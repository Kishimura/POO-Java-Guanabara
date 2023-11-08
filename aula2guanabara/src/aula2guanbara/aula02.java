package aula2guanbara;

public class aula02 {
    public static void main(String[] args) {
        // instanciando uma nova classe
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.ponta = 1.0f;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}

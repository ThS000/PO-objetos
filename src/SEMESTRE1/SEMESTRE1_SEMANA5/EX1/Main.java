package SEMESTRE1.SEMESTRE1_SEMANA5.EX1;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat", "Uno", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2022);
        Carro carro3 = new Carro("Toyota", "Corolla", 2023);

        System.out.println(" ESTADO INICIAL ");
        System.out.println(carro1.obterInfo());
        System.out.println(carro2.obterInfo());
        System.out.println(carro3.obterInfo());
        System.out.println();

        // ⚡ Testar os métodos: Acelerar cada carro 3x (com valores diferentes)
        carro1.acelerar(15);
        carro1.acelerar(32);
        carro1.acelerar(53);

        // Carro 2: Acelera 3x
        carro2.acelerar(50);
        carro2.acelerar(23);
        carro2.acelerar(92);

        // Carro 3: Acelera 3x
        carro3.acelerar(10);
        carro3.acelerar(10);
        carro3.acelerar(10);


        System.out.println(" APÓS ACELERAR E FREAR");
        System.out.println(carro1.obterInfo());
        System.out.println(carro2.obterInfo());
        System.out.println(carro3.obterInfo());
        System.out.println();

        // ⚡ Testar os métodos: Parar os carros (vamos parar o carro 3 como exemplo)
        carro3.parar(); // Velocidade esperada: 0 km/h

        System.out.println("=== ESTADO FINAL (Carro 3 Parado) ===");
        System.out.println(carro1.obterInfo());
        System.out.println(carro2.obterInfo());
        System.out.println(carro3.obterInfo()); // Deve exibir 0.0 km/h
    }
}


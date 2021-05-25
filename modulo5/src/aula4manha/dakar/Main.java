package modulo5.src.aula4manha.dakar;

public class Main {
    public static void main(String[] args) {
        Corrida c = new Corrida(100, 100000,  "Dakar", 4 );

        c.registrarCarro( 100, 5, 20, "123RALLY");
        c.registrarCarro(110, 5, 21, "124RALLY");
        c.registrarCarro(111, 4, 35, "122RALLY");
        c.registrarCarro(140, 6, 1, "001RALLY");

        c.registrarCarro(9, 6, 35, "013NORMAL");

        c.removerVeiculo("001RALLY");
        
        Veiculo v = c.getVeiculo("123RALLY");
        c.removerVeiculo(v);

        c.registrarMoto(90, 7, 60, "124MOTO");
        c.registrarMoto(91, 8, 32, "135MOTO");

        c.socorrerCarro("124RALLY");
        c.socorrerMoto("124MOTO");
        c.removerVeiculo("124MOTO");

        c.vencedor();

    }
}

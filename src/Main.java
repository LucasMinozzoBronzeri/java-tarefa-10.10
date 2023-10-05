import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carta> cartas = Arrays.asList(
                new Carta("Black Lotus", "Artefato", "Mítica", 10000.0),
                new Carta("Lightning Bolt", "Feitiço Instantâneo", "Comum", 2.0),
                new Carta("Island", "Tera Básica","Comum",0.1),
                new Carta("Serra Angel", "Criatura","Incomum", 1.5));

                var cartascomuns = cartas.stream().filter(Carta-> Carta.getRaridade().equals("Comum")).toList();
                System.out.println("As cartas comuns são: \r\n" + cartascomuns);

                var cartascaras = cartas.stream().filter(Carta-> Carta.getPreco()>5).toList();
                System.out.println("\r\nAs cartas comuns são: \r\n" + cartascaras);

                for ()


    }


    }

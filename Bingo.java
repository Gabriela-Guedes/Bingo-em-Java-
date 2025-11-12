import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Bingo {
    private List<Integer> numerosDisponiveis;
    private List<Integer> numerosSorteados;
    private Random random;

    public Bingo() {
        numerosDisponiveis = new ArrayList<>();
        for (int i = 1; i <= 75; i++) { // pode ajustar o limite
            numerosDisponiveis.add(i);
        }
        numerosSorteados = new ArrayList<>();
        random = new Random();
    }

    public Integer sortearNumero() {
        if (numerosDisponiveis.isEmpty()) {
            return null; // todos os números já foram sorteados
        }
        int indice = random.nextInt(numerosDisponiveis.size());
        Integer numero = numerosDisponiveis.remove(indice);
        numerosSorteados.add(numero);
        return numero;
    }

    public List<Integer> getNumerosSorteados() {
        return Collections.unmodifiableList(numerosSorteados);
    }
}
package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SorteioService {

    private List<String> nomes = new ArrayList<>();
    private List<String> sorteados = new ArrayList<>();
    private Random random = new Random();

    public void adicionarNome(String nome) {
        nomes.add(nome);
    }

    public void listarNomes() {
        System.out.println("Nomes cadastrados:");
        nomes.forEach(System.out::println);
    }

    public void listarSorteados() {
        System.out.println("Nomes já sorteados:");
        sorteados.forEach(System.out::println);
    }

    public String sortear() {
        if (nomes.isEmpty()) {
            return "Não há mais nomes para sortear!";
        }
        int index = random.nextInt(nomes.size());
        String sorteado = nomes.remove(index);
        sorteados.add(sorteado);
        return sorteado;
    }

    public void recolocarTodos() {
        nomes.addAll(sorteados);
        sorteados.clear();
    }

    public boolean recolocarUm(String nome) {
        if (sorteados.contains(nome)) {
            sorteados.remove(nome);
            nomes.add(nome);
            return true;
        }
        return false;
    }
}
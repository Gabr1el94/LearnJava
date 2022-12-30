import java.util.*;

public class LearnList {
    public static void main(String args[]) {
        /**
         * List
         * -------------------------------------------------
         * Elementos duplicados e garante ordem de inserção;
         */
        List<Double> notas = new ArrayList<>();

        System.out.println("Crie uma lista e adicione as sete notas:");
        notas.add(8.00);
        notas.add(10.00);
        notas.add(3.00);
        notas.add(6.00);

        System.out.println("\n Notas inseridas:");
        System.out.println(Arrays.asList(notas));

        System.out.println("\n Atualizar a nota 5.00 na posição 3:");
        notas.set(3, 5.00);
        System.out.println(Arrays.asList(notas));

        System.out.println("\n Exiba a posição da nota 10.00: " + notas.indexOf(10d));

        System.out.println("\n Adicione na lista a nota 7 na posição 4");
        notas.add(4, 7d);
        System.out.println(Arrays.asList(notas));

        System.out.println("\n Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("\n Exiba a menor nota: " + Collections.min(notas));

        System.out.println("\n Exiba a maior nota: " + Collections.max(notas));

        System.out.println("\n Remova a nota 10.00");
        notas.remove(10d);
        System.out.println(Arrays.asList(notas));

    }
}
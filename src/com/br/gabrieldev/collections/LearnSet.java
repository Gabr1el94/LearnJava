import java.util.*;

public class LearnSet {
    public static void main(String args[]) {
        /**
         * Set
         * 
         * Não permite elementos duplicados;
         * e também não possui índice;
         */
        System.out.println("Crie um conjunto e adicione as notas:");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("\n Confira se a nota 5 está no conjunto:" + notas.contains(5d));

        System.out.println("\n Exiba a menor nota: " + Collections.min(notas));

        System.out.println("\n Exiba a maior nota: " + Collections.max(notas));

        System.out.println("\n Remova a nota 0");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\n Exiba todas as notas na ordem em que foram informados:");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("\n Exiba todas as notas na ordem crescente:");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

    }
}
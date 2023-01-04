package com.br.gabrieldev.collections;

import java.util.*;

public class LearnMap {
     public static void main(String[] args) {
        /**
         * Map
         * Elementos únicos(key) para cada valor(value)
         * 
         */
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos");
        Map<String, Double> carrosPopulares = new HashMap<String, Double>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 14.5);
                put("kwid", 15.6);
            }
        };

        System.out.println(carrosPopulares.toString());

        System.out.println("\n Substitua o consumo do gol por 15,2 km/L:");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out
                .println("\n Confira se o modelo 'tucson' está no dicionário:" + carrosPopulares.containsKey("tucson"));

        System.out.println("\n Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("\n Exiba os modelos");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("\n Exiba os consumos dos carros");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("\n Exiba o modelo mais econômico e seu consumo");
        Double valueMax = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(valueMax)) {
                modeloMaisEficiente = entry.getKey();
            }
        }

        System.out.println("Modelo mais eficiente:" + modeloMaisEficiente + " - " + valueMax);

        System.out.println("\n Exiba o modelo menos econômico e seu consumo");
        Double valueMin = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries2 = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : entries2) {
            if (entry.getValue().equals(valueMin)) {
                modeloMenosEficiente = entry.getKey();
            }
        }

        System.out.println("Modelo menos eficiente:" + modeloMenosEficiente + " - " + valueMin);

        Double soma = 0d;
        for (Map.Entry<String, Double> entry : entries2) {
            soma += entry.getValue();
        }
        System.out.println("\n Exibe a soma dos consumos :" + soma);

        System.out.println(
                "\n Exibe a média dos consumos deste dicionário de carros: " + (soma / carrosPopulares.size()));

    }

}
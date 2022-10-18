import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("- Crie um dicionário e relacione os estados e suas populações");
        Map<String, Integer> populationNE = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populationNE.toString());
        System.out.println();

        System.out.println("- Substitua a população do estado do RN por 3.534.165");
        populationNE.put("RN", 4039277);
        System.out.println(populationNE);
        System.out.println();

        System.out.println("- Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277");
        System.out.println(populationNE.containsKey("PB"));
        populationNE.put("PB", 4039277);
        System.out.println(populationNE);
        System.out.println();

        System.out.println("Exiba a população PE");
        System.out.println(populationNE.get("PE"));
        System.out.println();

        System.out.println("- Exiba todos os estados e suas populações na ordem que foi informado");
        Map<String, Integer> populationNE2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(populationNE2.toString());
        System.out.println();

        System.out.println("- Exiba os estados e suas populações em ordem alfabética");
        Map<String, Integer> populationNE3 = new TreeMap<>(populationNE2);
        System.out.println(populationNE3.toString());
        System.out.println();

        System.out.println("- Exiba o estado com o menor população e sua quantidade");


        Collection<Integer> population = populationNE.values();
        //System.out.println(population);  [9187103, 4039277, 9616621, 3351543, 4039277]
        String stateLargestPopulation = "";
        String stateSmallestPopulation = "";
        for (Map.Entry<String, Integer> entry : populationNE.entrySet()) {
            if (entry.getValue().equals(Collections.max(population))) stateLargestPopulation = entry.getKey();
            if (entry.getValue().equals(Collections.min(population))) stateSmallestPopulation = entry.getKey();
        }
        System.out.println("Estado com a menor população: " + stateSmallestPopulation
                + " com " + Collections.min(population) + " habitantes");
        System.out.println("Estado com a maior população: " + stateLargestPopulation
                + " com " + Collections.max(population) + " habitantes");
        System.out.println();

        System.out.println("- Exiba a soma da população desses estados");
        int soma = 0;
        Iterator<Integer> iterator = populationNE.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);
        System.out.println();

        System.out.println("- Exiba a média da população deste dicionário de estados");
        System.out.println(soma / populationNE.size());
        System.out.println();

        System.out.println("- Remova os estados com a população menor que 4.000.000");
        Iterator<Integer> iterator1 = populationNE.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() < 4000000) {
                iterator1.remove();
            }
        }
        System.out.println(populationNE);
        System.out.println();

        System.out.println("- Apague o dicionário de estados");
        populationNE.clear();
        System.out.println(populationNE);
        System.out.println();

        System.out.println("- Confira se o dicionário está vazio");
        System.out.println(populationNE.isEmpty());


    }
}
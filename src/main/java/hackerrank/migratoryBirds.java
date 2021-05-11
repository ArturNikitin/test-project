package hackerrank;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class migratoryBirds {
    public static void main(String[] args) {
    }

    public static int migratoryBirds(List<Integer> arr) {
        int type = 0;
        int population = 0;
        Set<Integer> checkedTypes = new HashSet<>();


        for (int i = 0; i < arr.size(); i++) {
            int intermediatePopulation = 0;
            int intType = arr.get(i);
            if (!checkedTypes.contains(intType)) {
                intermediatePopulation++;
                for (int j = i; j < arr.size(); j++) {
                    if (intType == arr.get(j) && i != j) {
                        intermediatePopulation++;
                    }
                }
                if (intermediatePopulation > population) {
                    type = intType;
                    population = intermediatePopulation;
                } else if (intermediatePopulation == population && intType < type) {
                    type = intType;
                    population = intermediatePopulation;
                }
                checkedTypes.add(intType);
            }

        }
        return type;
    }
}

package edu.aluismarte.diplomado;
import java.util.ArrayList;
import java.util.List;

/**
 * Parejas que suman igual
 * Escribir un método que returne la lista de parejas que sumados (cada numero separado por una coma en un string) sea igual a el resultado esperado
 * <p>
 * Ejemplo:
 * <p>
 * numbers = [1,4,5,0]
 * target = 5
 * <p>
 * Example output
 * 1,4
 * 5,0
 *
 * @author aluis on 4/24/2022.
 */
/*public class Exercise1Week1 {

    public static List<String> pairOfSumToTarget(List<Integer> numbers, int target) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                Integer a = numbers.get(i);
                Integer b = numbers.get(j);
                if (a + b == target) {
                    result.add(a + "," + b);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> results = pairOfSumToTarget(List.of(1, 4, 5, 0), 5);
        for (String result : results) {
            System.out.println(result);
        }
    }

}
*/


public class Tarea1_Ronny {
    public static List<String> SumaParesOjetivos(List<Integer> numbers, int Objetivo) {
        List<String> resultado = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                Integer x = numbers.get(i);
                Integer y = numbers.get(j);
                if (x + y == Objetivo) {
                    resultado.add(x + "," + y);
                }
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        List<String> resultados = SumaParesOjetivos(List.of(1, 2, 3, 4, 5), 6);
        for (String resultado : resultados) {
            System.out.println("Las parejas que cumplen con la suma objetivo son ("+ resultado + " )");
        }
    }
}

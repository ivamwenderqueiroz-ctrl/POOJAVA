import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

    public class Pizza {
    private List<String> ingredientes = new ArrayList<>();
    private static Map<String, Integer> ingredientesUsados = new HashMap<>();
 }

    // Adiciona ingrediente à pizza
    public void adicionaIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
        contabilizaIngrediente(ingrediente);
    }

    // Calcula preço da pizza
    public double getPreco() {
        int qtd = ingredientes.size();
        if (qtd <= 2) {
            return 15.0;
        } else if (qtd <= 5) {
            return 20.0;
        } else {
            return 23.0;
        }
    }

    // Método estático para contabilizar ingredientes
    private static void contabilizaIngrediente(String ingrediente) {
        ingredientesUsados.put(ingrediente, ingredientesUsados.getOrDefault(ingrediente, 0) + 1);
    }

    // Retorna mapa de ingredientes usados
    public static Map<String, Integer> getIngredientesUsados() {
        return ingredientesUsados;
    }

    // Verifica se a pizza tem ingredientes
    public boolean temIngredientes() {
        return !ingredientes.isEmpty();
    }
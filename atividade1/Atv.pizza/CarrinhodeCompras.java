import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CarrinhodeCompras {
    private List<Pizza> pizzas = new ArrayList<>();

    // Adiciona pizza ao carrinho (não aceita pizza sem ingredientes)
    public void adicionaPizza(Pizza pizza) {
        if (pizza.temIngredientes()) {
            pizzas.add(pizza);
        } else {
            System.out.println("Pizza sem ingredientes não pode ser adicionada!");
        }
    }
}
// Calcula valor total do carrinho
    public double getTotal() {
        double total = 0;
        for (Pizza p : pizzas) {
            total += p.getPreco();
        }
        return total;
    }


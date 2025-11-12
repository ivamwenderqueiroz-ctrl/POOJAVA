
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Criando pizzas
        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Queijo");
        pizza1.adicionaIngrediente("Tomate");

        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Calabresa");
        pizza2.adicionaIngrediente("Cebola");
        pizza2.adicionaIngrediente("Queijo");

        Pizza pizza3 = new Pizza();
        pizza3.adicionaIngrediente("Frango");
        pizza3.adicionaIngrediente("Catupiry");
        pizza3.adicionaIngrediente("Milho");
        pizza3.adicionaIngrediente("Azeitona");
        pizza3.adicionaIngrediente("Orégano");
        pizza3.adicionaIngrediente("Tomate");

        // Criando carrinho e adicionando pizzas
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionaPizza(pizza1);
        carrinho.adicionaPizza(pizza2);
        carrinho.adicionaPizza(pizza3);

        // Imprimindo total
        System.out.println("Total do Carrinho: R$ " + carrinho.getTotal());

        // Imprimindo ingredientes usados
        System.out.println("\nIngredientes utilizados:");
        for (Map.Entry<String, Integer> entry : Pizza.getIngredientesUsados().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
}

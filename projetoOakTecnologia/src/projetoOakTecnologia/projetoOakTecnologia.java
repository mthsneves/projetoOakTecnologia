package projetoOakTecnologia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
    String name;
    String description;
    double value;
    boolean available;

    public Product(String name, String description, double value, boolean available) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.available = available;
    }
}

class RetailStore {
    List<Product> products;

    public RetailStore() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
        Collections.sort(this.products, Comparator.comparingDouble(p -> p.value)); // Ordena por valor (do menor para o maior)
    }

    public void listProducts() {
        System.out.println("Lista de Produtos:");
        for (Product product : this.products) {
            System.out.printf("Nome: %s, Valor: R$%.2f, Disponível: %s%n",
                    product.name, product.value, product.available ? "Sim" : "Não");
        }
    }

    public static void main(String[] args) {
        RetailStore loja = new RetailStore();

        // Adiciona alguns produtos de exemplo
        loja.addProduct(new Product("Notebook", "Notebook de alto desempenho", 1200.00, true));
        loja.addProduct(new Product("Celular", "Smartphone mais recente", 800.00, true));
        loja.addProduct(new Product("Fones de ouvido", "Fones de ouvido com cancelamento de ruído", 150.00, false));

        // Lista todos os produtos
        loja.listProducts();

        // Adiciona um novo produto
        Product novoProduto = new Product("Tablet", "Tablet de 10 polegadas", 300.00, true);
        loja.addProduct(novoProduto);

        // Lista os produtos após adicionar o novo produto
        loja.listProducts();
    }

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}



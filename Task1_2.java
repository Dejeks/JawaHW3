package org.example.Homework.HW3;
import java.util.ArrayList;
import java.util.List;

public class Task1_2 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Высший товар 1", 10.0, "1-й сорт"));
        products.add(new Product("Товар 2", 5.0, "2-й сорт"));
        products.add(new Product("Товар 3", 5.0, "1-й сорт"));
        products.add(new Product("Высший товар 4", 20.0, "2-й сорт"));
        products.add(new Product("Товар 5", 25.0, "1-й сорт"));
        products.add(new Product("Товар 6", 5.0, "1-й сорт"));

        double maxPrice = findMaxPriceOfGrade(products, "высший");
        System.out.println("Наибольшая цена товаров 1го или 2-го сорта с названием, содержащим 'высший': " + maxPrice);

        List<String> namesWithMinPrice = getNamesWithMinPriceOfGrade(products, "1-й сорт");
        System.out.println("Наименования товаров 1-го сорта с наименьшей ценой: " + namesWithMinPrice);
    }

    public static double findMaxPriceOfGrade(List<Product> products, String keyword) {
        double maxPrice = Double.MIN_VALUE;
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(keyword.toLowerCase()) &&
                    (product.getGrade().equals("1-й сорт") || product.getGrade().equals("2-й сорт"))) {
                maxPrice = Math.max(maxPrice, product.getPrice());
            }
        }
        return maxPrice;
    }

    public static List<String> getNamesWithMinPriceOfGrade(List<Product> products, String grade) {
        double minPrice = Double.MAX_VALUE;
        for (Product product : products) {
            if (product.getGrade().equals(grade)) {
                minPrice = Math.min(minPrice, product.getPrice());
            }
        }

        List<String> namesWithMinPrice = new ArrayList<>();
        for (Product product : products) {
            if (product.getGrade().equals(grade) && product.getPrice() == minPrice) {
                namesWithMinPrice.add(product.getName());
            }
        }
        return namesWithMinPrice;
    }
}

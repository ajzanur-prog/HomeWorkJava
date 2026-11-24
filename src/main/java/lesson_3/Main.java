package lesson_3;

class Main {

    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 16 Pro", "15.01.2025",
                "Apple Inc.", "USA", 6299, false);
        productsArray[2] = new Product("Xiaomi 15", "10.03.2025",
                "Xiaomi Corp.", "China", 3499, true);
        productsArray[3] = new Product("Google Pixel 9", "20.12.2024",
                "Google LLC", "USA", 4799, false);
        productsArray[4] = new Product("Huawei P70", "05.04.2025",
                "Huawei Technologies", "China", 3999, false);

        for (Product p : productsArray) {
            p.printInfo();
        }
    }
}

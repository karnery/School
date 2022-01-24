package com.array;

class Product {
    String name;

    public Product(String name) {
        this.name = name;
    }
}

class User {
    Product[] products;

    public User(Product[] products) {
        this.products = products;
    }
}

class ArrayExample {
    public static void main(String[] args) {
        User[] users = new User[2];
        Product[] userFirstProducts = new Product[3];
        userFirstProducts[0] = new Product("Хлеб");
        userFirstProducts[1] = new Product("Рыба");
        userFirstProducts[2] = new Product("Кефир");

        users[0] = new User(userFirstProducts);

        Product[] userSecondProducts = new Product[4];
        userSecondProducts[0] = new Product("Мясо");
        userSecondProducts[1] = new Product("Фрукты");
        userSecondProducts[2] = new Product("Молоко");
        userSecondProducts[3] = new Product("Яйца");
        users[1] = new User(userSecondProducts);

        Product[] allProduct = getAllProducts(users);
        for (int i = 1; i < allProduct.length; i++) {
            Product currentProduct = allProduct[i];
            System.out.println(i + ". " + currentProduct.name);
        }
    }

    private static Product[] getAllProducts(User[] users) {
        MyListProduct listProduct = new MyListProduct();
        for (int i = 0; i < users.length; i++) {
            User currentUser = users[i];
            for (int a = 0; a < currentUser.products.length; a++) {
                Product currentProduct = currentUser.products[a];
                listProduct.add(currentProduct);
            }
        }
        return listProduct.getAllProduct();
    }
}

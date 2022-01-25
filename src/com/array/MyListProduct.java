package com.array;

public class MyListProduct {
    private Product[] allProduct = new Product[1];
    private int currentIndex = 0;

    public void add(Product product) {
        if (currentIndex >= allProduct.length) {
            reCreateArray();
        }
        allProduct[currentIndex] = product;
        currentIndex = currentIndex + 1;
    }

    public Product[] getAllProduct() {
        return allProduct;
    }

    public void reCreateArray() {
        Product[] old = allProduct;
        allProduct = new Product[old.length + 1];
        for (int i = 0; i < old.length; i++) {
            allProduct[i] = old[i];
        }
    }
}
// проверить есть ли место в массиве аллпродакт (if) если каррент индекс больше текущего массива, тогда вызываем метод реКреат,
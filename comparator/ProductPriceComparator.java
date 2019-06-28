package com.francis.tmall.comparator;

import java.util.Comparator;

import com.francis.tmall.pojo.Product;

public class ProductPriceComparator implements Comparator<Product>{
    @Override
    public int compare(Product p1, Product p2) {
        return (int) (p2.getPromotePrice()-p1.getPromotePrice());
    }
}

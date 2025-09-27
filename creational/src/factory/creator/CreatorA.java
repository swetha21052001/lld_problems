package factory.creator;

import factory.product.Product;
import factory.product.ProductA;

public class CreatorA extends Creator {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}

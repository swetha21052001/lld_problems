package factory.creator;

import factory.product.Product;

public abstract class Creator {
    public abstract Product createProduct();

    public void productName(){
         Product product = createProduct();
         product.printMessage();
    }
}

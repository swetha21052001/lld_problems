package factory;

import factory.creator.Creator;
import factory.creator.CreatorA;
import factory.creator.CreatorB;

public class FactoryExecute {
    public static void main(String[] args){
        Creator creator;
        creator = new CreatorA();
        creator.productName();
        creator = new CreatorB();
        creator.productName();
    }
}

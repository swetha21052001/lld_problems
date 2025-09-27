package builder;

public class BuilderExecute {
    public static void main(String[] args){
        Product product = new Product
                .Builder("Alex")
                .age(20)
                .gender("M")
                .role("Manager")
                .build();
        System.out.println(product.toString());
    }
}

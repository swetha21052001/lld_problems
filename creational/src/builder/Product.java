package builder;

public class Product {
    private final String name;
    private final int age;
    private final String gender;
    private final String role;

    public Product(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.role = builder.role;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public static class Builder{
        private final String name;
        private int age = 18;
        private String gender = null;
        private String role = null;

        public Builder(String name){
            this.name = name;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder gender(String gender){
            this.gender = gender;
            return this;
        }
        public Builder role(String role){
            this.role = role;
            return this;
        }
        public Product build(){
            return new Product(this);
        }
    }
}

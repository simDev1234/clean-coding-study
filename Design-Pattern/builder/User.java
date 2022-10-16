package builder;

public class User {
    private long id;
    private String name;
    private int age;
    private String address;
    private String phoneNumber;

    public static User builder(){
        return null;
    }

    public User(User.Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
    }

    public static class Builder{
        private long id;
        private String name;
        private int age;
        private String address;
        private String phoneNumber;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public User builder(){
            return new User(this);
        }
    }
}

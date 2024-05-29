package pojo;

public class Person {
    private String name;
    private String password;
    private Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", page=" + age +
                '}';
    }

    public Person(String name, String password, Integer page) {
        this.name = name;
        this.password = password;
        this.age = page;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPage() {
        return age;
    }

    public void setPage(Integer page) {
        this.age = page;
    }
}

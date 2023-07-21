import java.util.Objects;

public class Cat {
    private String name;
    private String kin;
    private int age;

    public Cat() {
    }

    public Cat(String name, String kin, int age) {
        this.name = name;
        this.kin = kin;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKin() {
        return kin;
    }

    public void setKin(String kin) {
        this.kin = kin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", kin='" + kin + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(kin, cat.kin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, kin, age);
    }
}

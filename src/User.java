import java.util.Objects;

public class User implements Comparable {
    private int age;
    private String name;


    public User() {
        age = (int) Math.random();
        name = Double.toString(Math.random());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

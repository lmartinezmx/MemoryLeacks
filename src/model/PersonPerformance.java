package model;

import java.util.Objects;

public class PersonPerformance {

    public String name;

    public PersonPerformance(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonPerformance)) {
            return false;
        }
        if (o == null || getClass() != o.getClass()) return false;
        PersonPerformance that = (PersonPerformance) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        return result;
    }
}

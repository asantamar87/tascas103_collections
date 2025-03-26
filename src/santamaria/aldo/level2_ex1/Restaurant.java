package santamaria.aldo.level2_ex1;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>{


    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    @Override
    public int compareTo(Restaurant other) {

       int result = other.name.compareTo((this.name));

        if (result != 0) {
            return Integer.compare(other.getScore(), this.score);
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
       if(obj == null || getClass() != obj.getClass())  return false;
       Restaurant that = (Restaurant) obj;
        return score == that.score && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Restaurant{name='" + name + "', score=" + score + "}";
    }


}

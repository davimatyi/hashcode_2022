import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

public class Contributor {

    private String name;
    private HashMap<String, Integer> skills;

    public Contributor(String name) {
        this.name = name;
        this.skills = new HashMap<>();

    }

    void addSkill(String skill) {
        var split = skill.split(" ");
        skills.put(split[0], Integer.parseInt(split[1]));
    }

    int getSkillLevel(String skill) {
        return skills.getOrDefault(skill, 0);
    }

    @Override
    public String toString() {
        return name + " skills: " + skills;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contributor that = (Contributor) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
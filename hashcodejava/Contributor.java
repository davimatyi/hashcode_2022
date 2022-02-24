// import java.io.*;
import java.util.*;

public class Contributor {

    private String name;
    private List<Role> skills;

    public Contributor(String name) {
        this.name = name;
        this.skills = new ArrayList<>();

    }

    void addSkill(String skill) {
        var split = skill.split(" ");
        skills.add(new Role(split[0], Integer.parseInt(split[1])));
    }

    int getSkillLevel(String skill) {
        return skills.stream().filter(r -> r.getSkill().equals(skill)).findFirst().map(Role::getLevel).orElse(0);
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

    public String getName() {
        return name;
    }
}
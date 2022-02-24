// import java.io.*;
import java.util.*;

public class Contributor {

    private String name;
    private List<Role> skills;
    private boolean assigned;

    public Contributor(String name) {
        this.name = name;
        this.skills = new ArrayList<>();
        this.assigned = false;
    }

    void addSkill(String skill) {
        var split = skill.split(" ");
        skills.add(new Role(split[0], Integer.parseInt(split[1])));
    }

    int getSkillLevel(String skill) {
        return skills.stream().filter(r -> r.getSkill().equals(skill)).findFirst().map(Role::getLevel).orElse(0);
    }

    void increaseSkillLevel(String skill) {
        skills.forEach(r -> {
            if(r.getSkill().equals(skill)) r.increaseLevel();
        });
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

    public void setAssigned(boolean ass) {
        this.assigned = ass;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public boolean getLessThenReq(int req, String skill) {
        if(skills.contains(skill)) {
            for(Role role: skills) {
                if(role.getLevel() - 1 == req) {
                    return true;
                }
            }
        }
        return false;
    }


    public boolean getEquals(int req, String skill) {
        if(skills.contains(skill)) {
            for(Role role: skills) {
                if(role.getLevel() == req) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isMore(int req, String skill) {
          if(skills.contains(skill)) {
            for(Role role: skills) {
                if(role.getLevel() > req) {
                    return true;
                }
            }
        }

        return false;

    }
}
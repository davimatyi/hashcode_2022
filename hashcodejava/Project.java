import java.util.*;

public class Project {

    private String name;
    private List<Role> roles;
    private int duration;
    private int score;
    private int bestBefore;
    private int roleCount;
    

    public Project(String in) {
        roles = new ArrayList<>();
        var s = in.split(" ");
        name = s[0];
        duration = Integer.parseInt(s[1]);
        score = Integer.parseInt(s[2]);
        bestBefore = Integer.parseInt(s[3]);
        roleCount = Integer.parseInt(s[4]);
    }

    void addRole(String role) {
        var split = role.split(" ");
        roles.add(new Role(split[0], Integer.parseInt(split[1])));
    }

    public int getRoleCount() {
        return roleCount;
    }

    @Override
    public String toString() {
        return this.name + " " + this.duration + " " + this.score + " "
            + this.bestBefore + " " + this.roleCount + " " + this.roles;
    }


}
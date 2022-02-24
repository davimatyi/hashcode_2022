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
        roles.add(new Role(Integer.parseInt(split[1]), split[3], Integer.parseInt(split[5])));
    }

    public int getRoleCount() {
        return roleCount;
    }


}
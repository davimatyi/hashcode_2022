import java.util.*;

public class Project {

    private String name;
    private List<Role> roles;
    private int duration;
    private int score;
    private int bestBefore;
    private int roleCount;

    private int startDay;

    private Map<Role, Contributor> associations;
    

    public Project(String in) {
        roles = new ArrayList<>();
        associations = new HashMap<>();
        var s = in.split(" ");
        name = s[0];
        duration = Integer.parseInt(s[1]);
        score = Integer.parseInt(s[2]);
        bestBefore = Integer.parseInt(s[3]);
        roleCount = Integer.parseInt(s[4]);
        startDay = 0;
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

    public String getName() {
        return name;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public int getDuration() {
        return duration;
    }

    public int getScore() {
        return score;
    }

    public int getBestBefore() {
        return bestBefore;
    }

    public Map<Role, Contributor> getAssociations() {
        return associations;
    }

    public String getContributorsString() {
        String s = "";
        for(Role r : roles) s += associations.get(r).getName() + " ";
        return s.substring(0, s.length()-1);
    }

    public void setStartDay(int currentDay) {
        this.startDay = currentDay;
    }

    public int getStartDay() {
        return startDay;
    }


}
import java.util.Objects;

public class Role {

    private String skill;
    private int level;

    public Role( String skill, int level) {
        this.skill = skill;
        this.level = level;
    }
    
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return level == role.level && Objects.equals(skill, role.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skill, level);
    }

    @Override
    public String toString() {
        return skill + " " + level;
    }
}

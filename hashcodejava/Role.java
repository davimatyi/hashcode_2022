import java.util.Objects;

public class Role {

    private int index;
    private String skill;
    private int level;


    public Role(int index, String skill, int level) {
        this.index = index;
        this.skill = skill;
        this.level = level;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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
        return index == role.index && level == role.level && Objects.equals(skill, role.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, skill, level);
    }

    @Override
    public String toString() {
        return "Role " + index + " requiring " +  skill + " level " + level;
    }
}

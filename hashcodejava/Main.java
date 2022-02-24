import java.io.*;
import java.util.*;

class Main {

    private ArrayList<Contributor> contributors;
    private ArrayList<Project> projects;

    public Main() {
        contributors = new ArrayList<>();
        projects = new ArrayList<>();
        readFromFile(contributors, projects, "../inputs/a_an_example.in.txt");
        contributors.forEach(System.out::println);
        projects.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Main();
    }
    
    void readFromFile(List<Contributor> conts, List<Project> projs, String file) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            int num_conts, num_projs;
            String buf = br.readLine();
            num_conts = Integer.parseInt(buf.split(" ")[0]);
            num_projs = Integer.parseInt(buf.split(" ")[1]);
            for(int i = 0; i < num_conts; i++) {
                buf = br.readLine();
                int num_skills = Integer.parseInt(buf.split(" ")[1]);
                var cont = new Contributor(buf.split(" ")[0]);
                for(int j = 0; j < num_skills; j++) {
                    cont.addSkill(br.readLine());
                }
                conts.add(cont);
            }
            for(int i = 0; i < num_projs; i++) {
                buf = br.readLine();
                var proj = new Project(buf);
                for(int j = 0; j < proj.getRoleCount(); j++) {
                    proj.addRole(br.readLine());
                }
                projs.add(proj);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
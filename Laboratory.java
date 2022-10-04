import java.util.ArrayList;

public class Laboratory {
  private String name;
  private ArrayList<Student> students;
  private ArrayList<Professor> professors;

  public Laboratory() {
  }

  public Laboratory(String name) {
    this.name = name;
    this.students = new ArrayList<Student>();
    this.professors = new ArrayList<Professor>();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addMember(Student s) {
    this.students.add(s);
  }

  public void addMember(Professor p) {
    this.professors.add(p);
  }
  
  public ArrayList<String> getContactInfos() {
    // COMPLETE-ME
    // Construa um ArrayList<String> contendo informações de contato (ContactInfo)
    // de cada um dos estudantes e professores
    ArrayList<String> list = new ArrayList<String>();
    for(int i = 0; i < students.size(); i++){
    	list.add(students.get(i).getContactInfo());
    }
    
    for(int j = 0; j < professors.size(); j++){
    	list.add(professors.get(j).getContactInfo());
    }
    return list;
  }

  public boolean userExists(String userId) {
    // COMPLETE-ME
    
    for(int i = 0; i < students.size(); i++){
    	if(students.get(i).getname() == userId) return true;
    }
    
    for(int i = 0; i < professors.size(); i++){
    	if(professors.get(i).getname() == userId) return true;
    }
    
    
    return false;
  }

  public int countMembers() {
    // COMPLETE-ME
    // Retorne o total de membros do laboratório (estudantes e professores)
    int contador;
    contador = students.size() + professors.size();
    return contador;
    
  }


}

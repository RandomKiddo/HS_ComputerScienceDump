public class SAETester{
  public static void main(String [] args){
    Person bob = new SAE("Bob",17,11,"Olentangy Liberty High School", "basketball", "server", "BW3");
    System.out.println(bob);
  }
}
class Person{
  private String name;
  private int age;
  public Person(String n, int a){
    name = n;
    age = a;
  }
  public String getName(){ return name; }
  public int getAge(){ return age; }
  public String toString(){
    return name + " is " + age + " years old.";
  }
}
interface Student{
  void setGrade(int to);
  void setSchool(String to);
  int getGrade();
  String getSchool();
}
interface Athlete{
  void setSport(String to);
  String getSport();
}
interface Employee{
  void setJobTitle(String to);
  void setJobLocation(String to);
  String getJobTitle();
  String getJobLocation();
}
class SAE extends Person implements Student, Athlete, Employee{
  private int grade;
  private String school, sport, jobTitle, jobLocation;
  public SAE(String n, int a, int g, String s, String sp, String jt, String jl){
    super(n,a);
    setGrade(g);
    setSchool(s);
    setSport(sp);
    setJobTitle(jt);
    setJobLocation(jl);
  }
  public void setGrade(int to){ grade = to; }
  public void setSchool(String to){ school = to; }
  public int getGrade(){ return grade; }
  public String getSchool(){ return school; }
  public void setSport(String to){ sport = to; }
  public String getSport(){ return sport; }
  public void setJobTitle(String to){ jobTitle = to; }
  public void setJobLocation(String to){ jobLocation = to; }
  public String getJobTitle(){ return jobTitle; }
  public String getJobLocation(){ return jobLocation; }
  public String toString(){
    String tos = super.toString() + "\n";
    tos += "He/She is in grade " + grade + " at " + school + "\n";
    tos += "where he/she plays " + sport + ".\n";
    tos += "He/She is also at " + jobTitle + " at " + jobLocation + ".";
    return tos;
  }
}
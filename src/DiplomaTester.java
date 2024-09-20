public class DiplomaTester{
    public static void main(String [] args){
        Diploma d1 = new Diploma("Murray Smith", "Gardening");
        System.out.println(d1);
        System.out.println();
        Diploma d2 = new DiplomaWithHonors("Lisa Smith","Evolutionary Psychology");
        System.out.println(d2);
    }
}
class Diploma{
    protected String name;
    protected String subject;
    public Diploma(String n, String s){
        name = n; subject = s;
    }
    public String toString(){
        String tos = "This certifies that";
        tos += "\n";
        tos += name;
        tos += "\n";
        tos += "has completed a course in " + subject;
        return tos;
    }
}
class DiplomaWithHonors extends Diploma{
    public DiplomaWithHonors(String n, String s){
        super(n,s);
    }
    public String toString(){
        String tos = super.toString();
        tos += "\n***with honors***";
        return tos;
    }
}

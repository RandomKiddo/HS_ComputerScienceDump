//For Nithil 7:28AM 3/5/2020
public class Test{
  public static void main(String [] args){
    A var = new B();
    var.a();
    //var.b();
  }
}
class A{
  public void a(){ System.out.println("a"); }
}
class B extends A{
  public void a(){ System.out.println("b"); }
  public void b(){}
}
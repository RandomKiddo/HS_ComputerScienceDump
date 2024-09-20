public class Fraction{
  //Fields
  private int num;
  private int denom;
  //Constructor
  public Fraction (int n, int d){
    num = n;
    denom = d;
  }
  //Methods
  public String toString(){
    return num + " / " + denom;
  }
  public void invert(){
    int store = num;
    num = denom;
    denom = store;
  }
  public double toDouble(){
    return (double)num/(double)denom;
  }
  public Fraction simplify(){
    int n = num;
    int d = denom;
    for (int a = 2; a <= denom; a++){
      if (n % a == 0 && d % a == 0){
        n /= a;
        d /= a;
      }
    }
    Fraction simplified = new Fraction(n,d);
    return simplified;
  }
  public static Fraction add(Fraction a, Fraction b){
    int c, d, e, f;
    c = a.denom * b.denom;
    d = a.num * b.denom;
    e = a.denom * b.num;
    f = d + e;
    Fraction temp = new Fraction(f,c);
    temp = temp.simplify();
    return temp;
  }
}
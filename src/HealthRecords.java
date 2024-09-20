public class HealthRecords{
  //Fields
  private String firstName;
  private String lastName;
  private String gender;
  private int month;
  private int date;
  private int year;
  private int height;
  private int weight;
  //Constructors
  public HealthRecords (String a, String b, String c, int d, int e, int f, int g, int h){
    firstName = a;
    lastName = b;
    gender = c;
    month = d;
    date = e;
    year = f;
    height = g;
    weight = h;
  }
  //Methods
  public String toString(){
    return firstName + " " + lastName + "\nGender : " + gender + "\nDate of Birth : " + month + "/" + date + "/" + year + "\nHeight : " + height + " inches\nWeight : " + weight + " pounds";
  }
  public String getFirstName(){
    return firstName;
  }
  public String getLastName(){
    return lastName;
  }
  public String getGender(){
    return gender;
  }
  public int getBirthMonth(){
    return month;
  }
  public int getBirthDate(){
    return date;
  }
  public int getBirthYear(){
    return year;
  }
  public int getHeight(){
    return height;
  }
  public int getWeight(){
    return weight;
  }
  public int getAge(){
    int age;
    int cYear = 2018;
    if ((month == 9 && date > 21) || month > 9){
      age = cYear - year - 1;
    } else {
      age = cYear - year;
    }
    return age;
  }
  public int getMaximumHeartRate(){
    return 220-getAge();
  }
  public double getBMI(){
    double bmi, num, denom;
    num = weight * 703.0;
    denom = (double)height * height;
    bmi = num / denom;
    return bmi;
  }
}
public class WelcomeMessageTester{
  public static void main(String [] args){
    WelcomeMessage msg = new WelcomeEnglish();
    print(msg);
    msg = new WelcomeSpanish();
    print(msg);
    msg = new WelcomeFrench();
    print(msg);
    msg = new WelcomeGerman();
    print(msg);
  }
  public static void print(WelcomeMessage msg){
    System.out.println(msg.getWelcomeMessage());
  }
}
interface WelcomeMessage{
  String getWelcomeMessage();
}
class WelcomeEnglish implements WelcomeMessage{
  public String getWelcomeMessage(){
    return "Hello, Welcome";
  }
}
class WelcomeSpanish implements WelcomeMessage{
  public String getWelcomeMessage(){
    return "Hola, Bienvenidos";
  }
}
class WelcomeFrench implements WelcomeMessage{
  public String getWelcomeMessage(){
    return "Bonjour, Bienvenue";
  }
}
class WelcomeGerman implements WelcomeMessage{
  public String getWelcomeMessage(){
    return "Hallo, Willkommen";
  }
}
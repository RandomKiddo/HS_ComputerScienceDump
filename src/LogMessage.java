public class LogMessage{
  private String machineId;
  private String description;
  
  public LogMessage(String message){
    int index = message.indexOf(':');
    String mId = message.substring(0,index);
    String des = message.substring(index +1);
    machineId = mId;
    description = des;
  }
  
  public String getMachineId(){
    return machineId;
  }
  public String getDescription(){
    return description;
  }
  
  public boolean containsWord(String keyword){
    int index = description.indexOf(keyword);
    String t1 = " " + keyword;
    String t2 = keyword + " ";
    boolean a, b, c;
    a = false;
    b = false;
    c = false;
    while (index != -1){
      a = true;
      b = false;
      c = false;
      if (index == 0 || description.charAt(index - 1) == ' '){
        b = true;
      }
      if (index == description.length() - keyword.length() || description.charAt(index+keyword.length()) == ' '){
        c = true;
      }
      index = description.indexOf(keyword, index + 1);
    }
    if (a == true && b == true && c == true){
      return true;
    }
    return false;
  }
}
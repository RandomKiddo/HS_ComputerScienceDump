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
    if (index != -1 && ((index == 0 || description.charAt(index - 1) == ' ') || (index == description.length() - keyword.length() || description.charAt(index+1) == ' ')){
      return true;
    } else {
      return false;
    }
  }
}
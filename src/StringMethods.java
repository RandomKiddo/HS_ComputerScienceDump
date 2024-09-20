public class StringMethods{
  public static String removeDashes(String ssn){
    String noDashes = ssn.replace("-", "");
    return noDashes;
  }
  public static String reformatDate(String date){
    int a = date.indexOf("/");
    String month = date.substring(0, a);
    int m = Integer.parseInt(month);
    if(m < 10){
      month = "0" + month;
    }
    int b = date.indexOf("/", a + 1);
    String day = date.substring(a + 1, b);
    int d = Integer.parseInt(day);
    if(d < 10){
      day = "0" + day;
    }
    String year = date.substring(b + 1, date.length());
    String reformat = day + "-" + month + "-" + year;
    return reformat;
  }
  public static String capitalizeEveryOtherWord(String input){
        String ans = "";
        String trimmed = input.trim();
        char temp;
        int check = 1;
        for (int cnt = 0; cnt < trimmed.length(); cnt++){
            temp = trimmed.charAt(cnt);
            if (check == 1 && temp != ' '){
                temp = Character.toLowerCase(temp);
                ans += temp;
            } else if (check == -1 && temp != ' '){
                temp = Character.toUpperCase(temp);
                ans += temp;
            } else {
                ans += " ";
                check *= -1;
            }
        }
        return ans;

  }
}
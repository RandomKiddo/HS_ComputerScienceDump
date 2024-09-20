public class Time{
  //Fields
  private int hours;
  private int minutes;
  //Constructor
  public Time(int h, int m){
    hours = h;
    minutes = m;
  }
  private int toMins(){
    return (hours * 60) + minutes;
  }
  public boolean lessThan(Time t){
    if (this.hours < t.hours || (this.hours == t.hours && this.minutes < t.minutes)){
      return true;
    } else {
      return false;
    }
  }
  public int elapsedSince(Time t){
    int a, b, c;
    if (t.lessThan(this)){
      a = this.minutes - t.minutes;
      b = this.hours - t.hours;
      c = a + (b*60);
    } else {
      a = this.minutes - t.minutes;
      b = 24 - t.hours + this.hours;
      c = a + (b*60);
    }
    return c;
  }
  public void addTime(int h, int m){
    hours += h;
    minutes += m;
    while (minutes > 59){
      minutes -= 60;
      hours++;
    }
    while (hours >= 24){
      hours -= 24;
    }
  }
  public String toString(){
    String a = minutes + "";
    String b = hours + "";
    if (minutes < 10){
      a = "0" + minutes;
    }
    if(hours < 10){
      b = "0" + hours;
    }
    return b + ":" + a;
  }
  public String to12HourClock(){
    String a, b = minutes + "";
    int h = hours;
    if (hours > 12 && hours <= 23){
      h -= 12;
      if (minutes < 10){
        b = "0" + minutes;
      }
      a = h + ":" + b + "PM";
    } else if (hours == 0){
      h += 12;
      if (minutes < 10){
        b = "0" + minutes; 
      }
      a = h + ":" + b + "AM";
    } else if (hours == 12){
      if (minutes < 10){
        b = "0" + minutes;
      }
      a = h + ":" + b + "PM";
    } else {
      if (minutes < 10){
        b = "0" + minutes;
      }
      a = h + ":" + b + "AM";
    }
    return a;
  }
}
package LogikLag;

import java.io.Serializable;

public class MyDate implements Serializable
{
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year)
  {
    set(day, month, year);
  }


  public String getDate(){
    return this.day + ":" + this.month + ":" + this.year;
  }

  public void set(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }


  public MyDate copy(){
    return new MyDate(day, month, year);
  }
}

import java.io.*;
class Outter{
  static int data=30;
  static class Inner{
    void Message(){
      System.out.println("The value of data is"+data);
    }
  }
  public static void main(String args[]){
    Outter.Inner obj=new Outter.Inner();
    obj.Message();
  }
}

class A
 {
   int a=10;
  }
class B extends A
   {
     int a=20;
     void show()
   {
      System.out.println(a);
   }
}
  class SuperKyword
  {
     public static void main(String[] args)
     {
      B r=new B();
      r.show();
  }
}
package courses.intro;

public class MyFirstClass {

    public static void main(String[] args) {
        System.out.println("Hello,World!");
        //define variable
        int x;

        x= 10;
        System.out.println(x);
       boolean isPrime=true;
       char ch='A';
       //constanta - immutable
       final double PI=3.14;
        System.out.println(PI*12*12);
//  string is immutable
      String firstName ="John Doelanescu";
        System.out.println(firstName);

        System.out.println("division" + ((float)5/2));
        System.out.println("modulo" + 5%2);

//        increment = crestere cu 1
        x = x+1;
        System.out.println(x);
        x=+2;
        System.out.println(x);
    }
}

package courses.oop1;

public class Pixuri {
    public String culoare;
    public String culoarePasta;
    public String tip;
    int lungime;
    int grosime;


    public String scrie(){
        return("pixul scrie" + culoare);
    }
    public void scrie(String text){
        System.out.println("<" + culoarePasta+  text +"</" + culoarePasta+"</");
    }
    }


package courses.oop1;

public class Main {
    public static void main(String[] args) {
        //instantiere de tip pixuri
        Pixuri pixulVerdeGri = new Pixuri();
        //imitializare atribute
        pixulVerdeGri.culoare = "verde";
        pixulVerdeGri.culoarePasta="albastru";
        pixulVerdeGri.tip="gel";
        System.out.println(pixulVerdeGri.scrie());
        pixulVerdeGri.scrie("Primul meu obiect");

    }
}

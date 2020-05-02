package design.build;

public class MyTest {
    public static void main(String[] args) {
        Materiel materiel = new Materiel.MaterielBuild().Iqc("aA").build();
        System.out.println(materiel);
    }
}

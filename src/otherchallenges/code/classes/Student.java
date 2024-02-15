package otherchallenges.code.classes;

public class Student {

    public String name;
    public long registration;
    public double[] grades;

    public Student(String name, long registration, double... grades) {
        this.name = name;
        this.registration = registration;
        this.grades = grades;
    }

    public void gradeValidation(){
        double soma = 0;

        for(int i = 0; i < grades.length; i++){
            soma += grades.length;
        }

        double media = soma / grades.length;

        System.out.println(media);

        if(media < 7.0){
            System.out.printf("Media igual a %.2f. REPROVADO\n", media);
        }
        if(media == 7.0){
            System.out.printf("Media igual a %.2f. APROVADO/RECUPERAÇÃO\n", media);
        }
        if(media >= 10.0){
            System.out.printf("Media igual a %.2f. APROVADO\n", media);
        }
    }
}

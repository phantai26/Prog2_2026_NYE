public class Student {

    private String name;
    private double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double calculateAverage() {
        if (grades == null || grades.length == 0) {
            return 0.0;
        }

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }

    public static void main(String[] args) {
        double[] gradesArray = {4.0, 5.0, 3.5, 4.5};

        Student s1 = new Student("Phan Duc Tai", gradesArray);

        System.out.println("Name: " + s1.name);
        System.out.println("Average: " + s1.calculateAverage());
    }
}

class Test {
    protected String name;
    protected String date;

    public Test(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public void Show() {
        System.out.println("Test: " + name + ", Date: " + date);
    }
}

class Exam extends Test {
    protected String subject;

    public Exam(String name, String date, String subject) {
        super(name, date);
        this.subject = subject;
    }

    @Override
    public void Show() {
        System.out.println("Exam: " + name + ", Date: " + date + ", Subject: " + subject);
    }
}

class FinalExam extends Exam {
    private boolean isGraduationExam;

    public FinalExam(String name, String date, String subject, boolean isGraduationExam) {
        super(name, date, subject);
        this.isGraduationExam = isGraduationExam;
    }

    @Override
    public void Show() {
        String graduation = isGraduationExam ? "Yes" : "No";
        System.out.println(
                "Final Exam: " + name + ", Date: " + date + ", Subject: " + subject + ", Graduation: " + graduation);
    }
}

class Trial extends Test {
    private String typeOfTrial;

    public Trial(String name, String date, String typeOfTrial) {
        super(name, date);
        this.typeOfTrial = typeOfTrial;
    }

    @Override
    public void Show() {
        System.out.println("Trial: " + name + ", Date: " + date + ", Type of Trial: " + typeOfTrial);
    }
}

public class task_1 {
    public static void main(String[] args) {
        Test[] tests = new Test[4];

        tests[0] = new Test("Simple Test", "2024-09-25");
        tests[1] = new Exam("Math Exam", "2024-10-01", "Mathematics");
        tests[2] = new FinalExam("Final History Exam", "2024-10-15", "History", true);
        tests[3] = new Trial("Trial for Project", "2024-11-01", "Project Presentation");

        for (Test test : tests) {
            test.Show();
        }
    }
}

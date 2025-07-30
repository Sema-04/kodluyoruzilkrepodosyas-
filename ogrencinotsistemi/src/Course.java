public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int writtenNote;
    int verbalNote;
    double verbalEffect;

    public Course(String name, String code, String prefix, double verbalEffect) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.writtenNote = 0;
        this.verbalNote = 0;
        this.verbalEffect = verbalEffect; // örn: 0.2
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    public double calculateCourseAverage() {
        return (this.verbalNote * this.verbalEffect) + (this.writtenNote * (1 - this.verbalEffect));
    }
}

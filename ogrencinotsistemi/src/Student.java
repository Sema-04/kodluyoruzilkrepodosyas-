public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int matWritten, int fizikWritten, int kimyaWritten,
                                int matVerbal, int fizikVerbal, int kimyaVerbal) {

        if (matWritten >= 0 && matWritten <= 100) {
            this.mat.writtenNote = matWritten;
        }
        if (fizikWritten >= 0 && fizikWritten <= 100) {
            this.fizik.writtenNote = fizikWritten;
        }
        if (kimyaWritten >= 0 && kimyaWritten <= 100) {
            this.kimya.writtenNote = kimyaWritten;
        }

        if (matVerbal >= 0 && matVerbal <= 100) {
            this.mat.verbalNote = matVerbal;
        }
        if (fizikVerbal >= 0 && fizikVerbal <= 100) {
            this.fizik.verbalNote = fizikVerbal;
        }
        if (kimyaVerbal >= 0 && kimyaVerbal <= 100) {
            this.kimya.verbalNote = kimyaVerbal;
        }
    }

    public void isPass() {
        if (this.mat.writtenNote == 0 || this.fizik.writtenNote == 0 || this.kimya.writtenNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti.");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAverage() {
        this.average = (mat.calculateCourseAverage() +
                fizik.calculateCourseAverage() +
                kimya.calculateCourseAverage()) / 3.0;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + mat.writtenNote + " (Sözlü: " + mat.verbalNote + ")");
        System.out.println("Fizik Notu : " + fizik.writtenNote + " (Sözlü: " + fizik.verbalNote + ")");
        System.out.println("Kimya Notu : " + kimya.writtenNote + " (Sözlü: " + kimya.verbalNote + ")");
    }
}

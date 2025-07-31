public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    public double tax() {
        if (this.salary < 1000) {
            return 0; // Vergi yok
        } else {
            return this.salary * 0.03;
        }
    }


    public double bonus() {
        if (this.workHours > 40) {
            int extraHours = this.workHours - 40;
            return extraHours * 30;
        }
        return 0;
    }


    public double raiseSalary() {
        int currentYear = 2021;
        int yearsWorked = currentYear - this.hireYear;

        if (yearsWorked < 10) {
            return this.salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    public String toString() {
        double taxAmount = tax();
        double bonusAmount = bonus();
        double raiseAmount = raiseSalary();
        double salaryWithBonus = this.salary + bonusAmount;
        double totalSalary = this.salary - taxAmount + bonusAmount + raiseAmount;

        return "Adı : " + this.name + "\n" +
                "Maaşı : " + this.salary + "\n" +
                "Çalışma Saati : " + this.workHours + "\n" +
                "Başlangıç Yılı : " + this.hireYear + "\n" +
                "Vergi : " + taxAmount + "\n" +
                "Bonus : " + bonusAmount + "\n" +
                "Maaş Artışı : " + raiseAmount + "\n" +
                "Vergi ve Bonuslar ile birlikte Maaş : " + salaryWithBonus + "\n" +
                "Toplam Maaş : " + totalSalary;
    }
}

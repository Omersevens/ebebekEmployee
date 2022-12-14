package gitebebek;
public class Calisan {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Calisan(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void print() {	// Calisanin maas bilgilerini yazdiran method.
        System.out.println("New Employee!!");
        System.out.println("calisanin ismi: " + this.name);
        System.out.println("calisanin normal maasi: " + this.salary);
        System.out.println("calisanin haftalik calisma saati: " + workHours);
        System.out.println("calisanin ise giris senesi: " + this.hireYear);
        System.out.println("calisanin vergisi: " + tax());
        System.out.println("calisanin bonuslari: " + bonus());
        System.out.println("calisanin yillik maas artisi: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas : " + toplam());
        System.out.println("\tToplam maas: " + (this.salary + toplam()));

    }

    int toplam() {
        int toplam = raiseSalary() + bonus() - tax();
        return toplam;
    }

    int tax() {                          
        int tax = 0;
        if (this.salary < 1000) {
            return 0;
        }
        tax = (int) (this.salary * 0.03);
        return tax;
    }

    int bonus() {
        int workHours = 0;
        if (this.workHours > 40) {
            workHours = this.workHours - 40;
            return workHours * 120;
        }
        return 0;
    }

    int raiseSalary() {
        int raise;
        if ((2021 - this.hireYear) < 10) {
            raise = (int) (this.salary * 0.05);
            return raise;
        } else if (((2021 - this.hireYear) < 20) && ((2021 - this.hireYear > 9))) {
            raise = (int) (this.salary * 0.1);
            return (int) raise;
        } else if ((2021 - this.hireYear) > 19) {
            raise = (int) (this.salary * 0.15);
            return raise;
        }
        return (int) this.salary;
    }

}
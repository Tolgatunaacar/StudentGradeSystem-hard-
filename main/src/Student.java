public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    double average;
    boolean isPass;

    Student(String name,String stuNo,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;
        this.average = 0.0;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.c1.examNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.c2.examNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.c3.examNote = kimya;
        }

    }

    public void addBulkProjectNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.c1.projectNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.c2.projectNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.c3.projectNote = kimya;
        }
    }

    public void calAverage(){
        average = ((this.c1.examNote*0.8 + this.c1.projectNote*0.2)+(this.c2.examNote*0.8 + this.c2.projectNote*0.2)+(this.c3.examNote*0.8 + this.c3.projectNote*0.2))/3.0;
    }

    boolean isPassCheck(){
        calAverage();
        return average >= 55;
    }
    public void isPass() {
        if (this.c1.examNote == 0 || this.c2.examNote == 0 || this.c3.examNote == 0) {
            System.out.println("Sinav notlari tam olarak girilmemiş");
        } else if (this.c1.projectNote == 0 || this.c2.projectNote == 0 || this.c3.projectNote == 0) {
            System.out.println("Proje notlari tam olarak girilmemiş");
        } else {
            this.isPass = isPassCheck();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);

        System.out.println("Matematik Sinav Notu : " + this.c1.examNote);
        System.out.println("Matematik Proje Notu : " + this.c1.projectNote);

        System.out.println("Fizik Sinav Notu : " + this.c2.examNote);
        System.out.println("Fizik Proje Notu : " + this.c2.projectNote);

        System.out.println("Kimya Sinav Notu : " + this.c3.examNote);
        System.out.println("Kimya Proje Notu : " + this.c3.projectNote);
    }
}

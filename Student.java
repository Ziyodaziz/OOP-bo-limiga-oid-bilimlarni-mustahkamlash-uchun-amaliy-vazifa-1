package OOPamaliyot;

public class Student extends Person{
    @Override
    void getName(String name) {

    }

    @Override
    void getAddress(String address) {

    }


    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        this.program = program;
        this.year = year;
        this.fee = fee;

        this.name=name;
        this.address = address;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String toString(){
        return name+" "+address+" "+program+ " " +year+ " " +fee+"$";
    }



    public static void main(String[] args) {
        Student s1 = new Student("Jasur", "Andijon","Java dasturchi",2003,200);
        Student s2 = new Student("Azam", "Namangan","Backend dasturchi",2002,300);

        System.out.println(s1);
        System.out.println(s2);




    }



}

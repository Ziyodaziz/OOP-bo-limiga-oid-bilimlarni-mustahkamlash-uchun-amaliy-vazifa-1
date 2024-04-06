package OOPamaliyot;

public class Staff extends Person{

    @Override
    void getName(String name) {

    }

    @Override
    void getAddress(String address) {

    }

    private String school;
    private double pay;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    Staff(String name, String address, String school, double pay){
        this.school=school;
        this.pay=pay;

        this.name=name;
        this.address=address;

    }

    public String toString(){
        return name+" "+address+" "+school+" "+pay;
    }

    public static void main(String[] args) {
        Staff st1 = new Staff("Aziz","Toshkent","Mohirdev",350);

        System.out.println(st1);
    }
}

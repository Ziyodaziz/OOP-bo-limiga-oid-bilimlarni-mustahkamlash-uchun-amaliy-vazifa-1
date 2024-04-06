package OOPamaliyot;

public abstract class Person {

    String name;
    String address;

    abstract void getName(String name);

    abstract void getAddress(String address);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}

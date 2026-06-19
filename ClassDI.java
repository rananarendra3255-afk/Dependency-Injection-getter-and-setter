package depndency.injection;

public class ClassDI {

    private String name;
    private String fname;
    private int rollno;
    private Address address;

    public ClassDI() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display() {

        System.out.println("Student Name : " + name);
        System.out.println("Student FName : " + fname);
        System.out.println("Student RollNo : " + rollno);
        System.out.println(" ");
        System.out.println(" -------- Address value print by Tostring methods ------- ");
        System.out.println(" ");

        System.out.println("Student Address : " + address);
        System.out.println(" ");
        System.out.println(" -------- Address value print by getter and setter methods ------- ");
        System.out.println(" ");

        System.out.println("House No : " + address.getHouseNo());
        System.out.println("City : " + address.getCity());
        System.out.println("PinCode : " + address.getPinCode());
        System.out.println("State : " + address.getState());
    }
}
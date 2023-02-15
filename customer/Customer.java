package bank;

public class Customer {
    private String Name;
    private String Surname;
    private int age;

    private int Rownumber;
    private int Credit;


    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return age;
    }

    public int getRownumber() {
        return Rownumber;
    }

    public int getCredit() {
        return Credit;
    }


    public void setName(String Name) {
        this.Name = Name;

    }

    public void setSurname(String Surname) {
        this.Surname = Surname;

    }

    public void setage(int age) {
        this.age = age;

    }

    public void setRownumber(int Rownumber) {
        this.Rownumber = Rownumber;

    }

    public void setCredit(int Credit) {
        this.Credit = Credit;


    }
    public String toString(){

        return Name + " " + Surname + " " + age + " " + Rownumber + " " + Credit;
    }



}












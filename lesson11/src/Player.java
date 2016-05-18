public abstract class Player {

    private String lastname;
    private String firstname;
    private String middlename;
    private int age;
    private char type;

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public int getAge() {
        return age;
    }

    public char getType() {
        return type;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String toString() {
        return firstname + " " + lastname;
    }

    public abstract String makeMove();
}

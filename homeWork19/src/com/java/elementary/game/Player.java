package com.java.elementary.game;

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

    @Override
    public boolean equals(Object obj) {

        if (obj == null)
            return false;

        if (obj.getClass() != this.getClass())
            return false;

        Player player = (Player) obj;

        if (player.lastname == null || player.firstname == null || player.middlename == null)
            return false;

        if (this.lastname.equals(player.lastname) &&
                this.firstname.equals(player.firstname) &&
                this.middlename.equals(player.middlename) &&
                this.age == player.age &&
                this.type == player.type)
            return true;

        return false;
    }
}

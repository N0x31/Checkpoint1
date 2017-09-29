package fr.wcs.checkpoint1n0x31;

public class StudentModel {



    //Attributs privés
    private String firstname;
    private String lastname;
    private String school;
    private String langage;

    //Constructeur portée public et arguments entre ()
    public StudentModel(String firstname, String lastname, String school, String langage) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.school = school;
        this.langage = langage;
    }

    //Getters

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSchool() {
        return school;
    }

    public String getLangage() {
        return langage;
    }

}

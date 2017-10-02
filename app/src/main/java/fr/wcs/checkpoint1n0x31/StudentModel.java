package fr.wcs.checkpoint1n0x31;

import android.os.Parcel;
import android.os.Parcelable;

public class StudentModel implements Parcelable {

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

    protected StudentModel(Parcel in) {
        firstname = in.readString();
        lastname = in.readString();
        school = in.readString();
        langage = in.readString();
    }

    public static final Creator<StudentModel> CREATOR = new Creator<StudentModel>() {
        @Override
        public StudentModel createFromParcel(Parcel in) {
            return new StudentModel(in);
        }

        @Override
        public StudentModel[] newArray(int size) {
            return new StudentModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(firstname);
        parcel.writeString(lastname);
        parcel.writeString(school);
        parcel.writeString(langage);
    }
}

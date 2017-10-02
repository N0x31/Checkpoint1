package fr.wcs.checkpoint1n0x31;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        Intent envoi = getIntent();
        StudentModel studentModel = envoi.getParcelableExtra("student");

        TextView studentFirstname = (TextView)findViewById(R.id.studentFirstName);
        studentFirstname.setText(studentModel.getFirstname());
        TextView studentLastname = (TextView)findViewById(R.id.studentLastName);
        studentLastname.setText("Elève : " + studentModel.getLastname());
        TextView studentSchool = (TextView)findViewById(R.id.studentSchool);
        studentSchool.setText("Ecole : " + studentModel.getSchool());
        TextView studentLangage = (TextView)findViewById(R.id.studentLangage);
        studentLangage.setText("Langage : " + studentModel.getLangage());

    }
}

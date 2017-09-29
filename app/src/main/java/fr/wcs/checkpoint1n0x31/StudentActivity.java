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

        String lastname = getIntent().getStringExtra("firstname");
        String firstname = getIntent().getStringExtra("lastname");
        String school = getIntent().getStringExtra("school");
        String langage = getIntent().getStringExtra("langage");

        TextView studentFirstname = (TextView)findViewById(R.id.studentFirstName);
        TextView studentLastname = (TextView)findViewById(R.id.studentLastName);
        TextView studentSchool = (TextView)findViewById(R.id.studentSchool);
        TextView studentLangage = (TextView)findViewById(R.id.studentLangage);

        studentFirstname.setText(firstname);
        studentLastname.setText("Eleve : " + lastname);
        studentSchool.setText("Ecole : " + school);
        studentLangage.setText("Langage : " + langage);

    }
}

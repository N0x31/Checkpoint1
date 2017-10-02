package fr.wcs.checkpoint1n0x31;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText firstname = (EditText)findViewById(R.id.editFirstname);
        final EditText lastname = (EditText)findViewById(R.id.editLastname);
        final EditText school = (EditText)findViewById(R.id.editSchool);
        final EditText langage = (EditText)findViewById(R.id.editLangage);


        final Button boutonEnvoyer = (Button)findViewById(R.id.buttonEnvoyer);
        boutonEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (firstname.getText().toString().isEmpty()
                        || lastname.getText().toString().isEmpty()
                        || school.getText().toString().isEmpty()
                        || langage.getText().toString().isEmpty()) {

                    //Récupère texte du toast dans string
                    Toast.makeText(MainActivity.this,
                            getResources().getString(R.string.formEmpty),
                            Toast.LENGTH_LONG).show();
                }

                else{
                    StudentModel currentStudent = new StudentModel(firstname.getText().toString(), lastname.getText().toString(),
                            school.getText().toString(),langage.getText().toString());
                    Intent envoi = new Intent(MainActivity.this, StudentActivity.class);
                    envoi.putExtra("student", currentStudent);
                    startActivity(envoi);
                }

            }
        });
    }
}

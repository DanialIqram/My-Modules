package sg.edu.rp.c346.id22022260.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView moduleDetailsTextView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        Intent intent = getIntent();
        Module moduleDetails = (Module) intent.getSerializableExtra("moduleDetails");

        moduleDetailsTextView = findViewById(R.id.moduleDetailsTextView);
        backButton = findViewById(R.id.backButton);

        String result = "Module Code: " + moduleDetails.code;
        result += "\nModule Name: " + moduleDetails.name;
        result += "\nAcademic Year: " + moduleDetails.year;
        result += "\nSemester: " + moduleDetails.semester;
        result += "\nModule Credits: " + moduleDetails.credits;
        result += "\nVenue: " + moduleDetails.venue;

        moduleDetailsTextView.setText(result);

//        moduleCodeTV.setText("Module Code: " + moduleDetails.code);
//        moduleNameTV.setText("Module Name: " + moduleDetails.name);
//        academicYearTV.setText("Academic Year: " + moduleDetails.year);
//        semesterTV.setText("Semester: " + moduleDetails.semester);
//        creditTV.setText("Module Credits: " + moduleDetails.credits);
//        venueTV.setText("Venue: " + moduleDetails.venue);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
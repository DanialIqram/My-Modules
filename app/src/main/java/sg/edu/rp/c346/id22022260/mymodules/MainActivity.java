package sg.edu.rp.c346.id22022260.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonC203, buttonC206, buttonC218, buttonC235, buttonC346, buttonG953;
    Module c203Details, c206Details, c218Details, c235Details, c346Details, g953Details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonC203 = findViewById(R.id.buttonC203);
        c203Details = new Module("C203", "Web AppIn Development in php");

        buttonC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("moduleDetails", c203Details);
                startActivity(intent);
            }
        });

        buttonC206 = findViewById(R.id.buttonC206);
        c206Details = new Module("C206", "Software Development Process");

        buttonC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("moduleDetails", c206Details);
                startActivity(intent);
            }
        });

        buttonC218 = findViewById(R.id.buttonC218);
        c218Details = new Module("C218", "UI/UX Design for Apps");

        buttonC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("moduleDetails", c218Details);
                startActivity(intent);
            }
        });

        buttonC235 = findViewById(R.id.buttonC235);
        c235Details = new Module("C235", "IT Security and Management");

        buttonC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("moduleDetails", c235Details);
                startActivity(intent);
            }
        });

        buttonC346 = findViewById(R.id.buttonC346);
        c346Details = new Module("C346", "Mobile App Development", "E63A");

        buttonC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("moduleDetails", c346Details);
                startActivity(intent);
            }
        });

        buttonG953 = findViewById(R.id.buttonG953);
        g953Details = new Module("G953", "Life Skills III", 2023, 1, 1, "Self-Paced eLearning");

        buttonG953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("moduleDetails", g953Details);
                startActivity(intent);
            }
        });
    }
}
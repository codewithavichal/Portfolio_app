package com.example.portfolio_app;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button skill=(Button)findViewById(R.id.btnskill);
        Button education=(Button)findViewById(R.id.btnedu);
        Button projects=(Button)findViewById(R.id.btnach);
        Button certification=(Button)findViewById(R.id.btncer);

        skill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x;
                x=new Intent(MainActivity.this,MainActivity2.class);
                x.putExtra("Title","Skill");
                x.putExtra("Description"," • Programming: JAVA, C, SQL,XML\n" +"\n"+
                        " • Developer Tools: GitHub, Visual Studio Code, Android Studio\n");
                startActivity(x);
            }
        });

        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x;
                x=new Intent(MainActivity.this,MainActivity2.class);
                x.putExtra("Title","Education");
                x.putExtra("Description"," \n" +
                        "• Galgotia’s University, Greater Noida, Uttar Pradesh\n" +
                        " Master’s in Computer Applications\n" +
                        " Percentage: 79.08%\n" +"\n"+
                        " • Harishchandra P.G College, Varanasi, Uttar Pradesh\n" +
                        " Bachelor’s in Computer Application\n" +
                        " Percentage:70.02%\n");
                startActivity(x);
            }
        });


        projects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x;
                x=new Intent(MainActivity.this,MainActivity2.class);
                x.putExtra("Title","Projects");
                x.putExtra("Description","• Music Player — (HTML, CSS ,JavaScript) \n" +
                        " Designed and developed a dynamic Music Player platform that facilitates seamless music listening.\n" +"\n"+
                        " • Uttar Pradesh’s Tourist Places — (HTML, CSS ,JavaScript, ReactJs) \n" +
                        " This project contains information about the different tourist places in Uttar Pradesh and also\n" +
                        " allows us to give feedback about that place.\n" +"\n"+
                        " • Tic Tac Toe game — (XML, Java, Android Studio) View Live\n" +
                        " Developed a TIC TAC TOE game in Android Studio, utilizing XML for designing an intuitive user\n" +
                        " interface and Java for implementing game logic. The app supports two-player game play with a\n" +
                        " clean and responsive layout.");
                startActivity(x);
            }
        });

        certification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x;
                x=new Intent(MainActivity.this,MainActivity2.class);
                x.putExtra("Title","Certification");
                x.putExtra("Description","AICTE Android Virtual Internship");
                startActivity(x);
            }
        });





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
String Alphabets[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    String Countries[]={"Afghanistan","Albania", "Argentina","Armenia","Australia","Austria","Bahrain","Bangladesh","Belgium",
                        "Belize","Benin","Bhutan","Botswana","Brazil","Cambodia","Canada","China","Colombia","Cyprus","Denmark",
                        "Dominica","Dominican Republic","Egypt","Equatorial Guinea","Eritrea","Estonia","France","Finland","Fiji",
                        "Gambia","Georgia","Germany","Greece","Haiti","Honduras","Hungary","Iceland","India","Indonesia","Iran",
                        "Iraq","Israel","Italy","Jamaica","Japan","Jordan","Kazakhstan","Kenya","Kuwait","Lebanon","Lesotho",
                        "Liberia","Libya","Malaysia","Maldives","Mali","Malta","Mexico","Micronesia","Moldova","Nepal",
                        "Netherlands","New Zealand","Nigeria","Norway","Oman","Pakistan","Palau","Philippines","Poland",
                        "Portugal","Qatar","Romania","Russia","Rwanda","Saint Kitts and Nevis","Saudi Arabia","Singapore",
                        "Slovenia","Solomon Islands","South Africa","South Korea","Spain","Sri Lanka","Switzerland","Syria",
                        "Thailand","Tonga","Turkey","Turkmenistan","Tuvalu","United Arab Emirates","United Kingdom",
                        "United States of America","Vanuatu","Venezuela","Wale(Part of UK)","Yemen","Zambia","Zimbabwe"};
 TextView tv,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv=(TextView) findViewById(R.id.tv);
        tv2=(TextView) findViewById(R.id.tv2);
        String item= getIntent().getStringExtra("keyitem");

        for(int i=0;i<100;i++) {

            String c = Countries[i];
            for(int j=0;j<26;j++) {

                String a=Alphabets[j];
                if (item.equals(a)) {
                    if(item.equals("X")){
                        tv.setText("There are no countries that start with the letter \"X\"");
                    }else if(c.startsWith(a)){
                        tv2.setText("COUNTRIES THAT START WITH THE LETTER "+a+":");
                    tv.append(c + "\n");
                    }
                }
            }
        }
    }
}
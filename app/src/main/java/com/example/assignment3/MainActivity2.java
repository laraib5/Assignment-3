package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private TextView Email, Password;
    TextView tv;

    String u1[] = {"laraib@gmail.com", "laraib"};
    String u2[] = {"amber@gmail.com", "amber"};
    String u3[] = {"azka@gmail.com", "azka"};
    String u4[] = {"sana@gmail.com", "sana"};
    String u5[] = {"rimsha@gmail.com", "rimsha"};
    String u6[] = {"ahlala@gmail.com", "ahlala"};
    String u7[] = {"abc@gmail.com", "abc"};
    String u8[] = {"xyz@gmail.com", "xyz"};
    String u9[] = {"user9@gmail.com", "user9"};
    String u10[] = {"user10@gmail.com", "user10"};

    GridView grid;
    static final String[] gridViewValue=new
            String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Email = (TextView) findViewById(R.id.email);
        Password= (TextView) findViewById(R.id.password);
        tv=(TextView) findViewById(R.id.tv);

        String email= getIntent().getStringExtra("keyemail");
        String password= getIntent().getStringExtra("keypassword");
        if((!email.equals(u1[0]) || !password.equals(u1[1])) && (!email.equals(u2[0]) || !password.equals(u2[1])) &&
                (!email.equals(u3[0]) || !password.equals(u3[1])) && (!email.equals(u4[0]) || !password.equals(u4[1])) &&
                        (!email.equals(u5[0]) || !password.equals(u5[1])) && (!email.equals(u6[0]) || !password.equals(u6[1])) &&
                                (!email.equals(u7[0]) || !password.equals(u7[1])) && (!email.equals(u8[0]) || !password.equals(u8[1])) &&
                                        (!email.equals(u9[0]) || !password.equals(u9[1])) && (!email.equals(u10[0]) || !password.equals(u10[1]))) {

            Email.setText("Email: "+email);
            Password.setText("Password: "+password);
            tv.setText("INCORRECT!");
            Toast.makeText(MainActivity2.this, "INVALID EMAIL OR PASSWORD!", Toast.LENGTH_LONG).show();

        }else{

            grid= findViewById(R.id.grid);

            ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,gridViewValue);
            grid.setAdapter(adapter);

            grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String item= ((TextView) view).getText().toString();
                   Intent in2= new Intent(MainActivity2.this, MainActivity3.class);
                    in2.putExtra("keyitem",item);
                   startActivity(in2);
                   Toast.makeText(getApplicationContext(),((TextView) view).getText()+" is Clicked", Toast.LENGTH_SHORT).show();
            }
            });
        }



    }
}
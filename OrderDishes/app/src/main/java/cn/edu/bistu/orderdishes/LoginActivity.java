package cn.edu.bistu.orderdishes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView tv_count;
    private EditText et_count;
    private TextView tv_password;
    private EditText et_password;
    private Button btn_login;
    private Button ben_goto_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tv_count = (TextView)findViewById(R.id.tv_count);
        et_count = (EditText) findViewById(R.id.et_count);
        tv_password = (TextView)findViewById(R.id.tv_password);
        et_password= (EditText) findViewById(R.id.et_password);
        btn_login=(Button)findViewById(R.id.btn_login);
        ben_goto_register=(Button)findViewById(R.id.btn_goto_register);
        ben_goto_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}

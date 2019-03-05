package cn.edu.bistu.orderdishes;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    private TextView tv_count;
    private EditText et_count;
    private TextView tv_password;
    private EditText et_passwrod;
    private TextView tv_sex;
    private EditText et_sex;
    private TextView tv_phone;
    private EditText et_phone;
    private Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null){
            actionbar.hide();
        }

        tv_count=(TextView)findViewById(R.id.tv_count);
        et_count=(EditText)findViewById(R.id.et_count);
        tv_password=(TextView)findViewById(R.id.tv_password);
        et_passwrod=(EditText)findViewById(R.id.et_password);
        tv_sex=(TextView)findViewById(R.id.tv_sex);
        et_sex=(EditText) findViewById(R.id.et_sex);
        tv_phone=(TextView)findViewById(R.id.tv_phone);
        et_phone=(EditText)findViewById(R.id.et_phone);
        btn_register=(Button) findViewById(R.id.btn_register);


    }
}

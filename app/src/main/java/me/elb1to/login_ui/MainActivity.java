package me.elb1to.login_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import me.elb1to.login_ui.dialogs.Alert;
import me.elb1to.login_ui.dialogs.DialogTypeEnum;

public class MainActivity extends AppCompatActivity {

    private EditText user, contra;
    private RadioButton estudianteRbtn, profesorRbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startControllers();
    }

    private void startControllers() {
        user = findViewById(R.id.userField);
        contra = findViewById(R.id.passwordField);
        estudianteRbtn = findViewById(R.id.studentR);
        profesorRbtn = findViewById(R.id.professorR);
    }

    public void checkEnteredValues(View view) {
        try {
            String username = user.getText().toString();
            String password = contra.getText().toString();

            if (!estudianteRbtn.isChecked() && !profesorRbtn.isChecked()) {
                DialogTypeEnum.OPTIONS_NOT_SELECTED.getAlert().show(getSupportFragmentManager(), "OptionsNull");
                return;
            }

            if (profesorRbtn.isChecked()) {
                DialogTypeEnum.IN_DEVELOPMENT.getAlert().show(getSupportFragmentManager(), "InDev");
                return;
            }

            if (estudianteRbtn.isChecked()) {
                if (username.isEmpty() || password.isEmpty()) {
                    DialogTypeEnum.WRONG_CREDENTIALS.getAlert().show(getSupportFragmentManager(), "WrongCreds");
                    return;
                }

                if (username.equals("Juan") && password.equals("1234")) {
                    DialogTypeEnum.SUCCESSFUL_LOGIN.getAlert().show(getSupportFragmentManager(), "LoggedIn");
                } else {
                    DialogTypeEnum.WRONG_CREDENTIALS.getAlert().show(getSupportFragmentManager(), "WrongCreds");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
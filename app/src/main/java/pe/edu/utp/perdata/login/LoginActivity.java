package pe.edu.utp.perdata.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pe.edu.utp.perdata.R;
import pe.edu.utp.perdata.databinding.ActivityLoginBinding;
import pe.edu.utp.perdata.MarcoFragment;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private ActivityLoginBinding loginBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginBinding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(loginBinding.getRoot());
        
        loginBinding.btnloginingresar.setOnClickListener(this);

    }
    public void ingresar(){
        Intent marco = new Intent(this, MarcoFragment.class);
        startActivity(marco);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnloginingresar:ingresar();break;
           //case R.id.btnloginingresar: getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,new MenuFragment()).commit();
           //break;
        }
        //getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,new MenuFragment()).commit();

    }
}
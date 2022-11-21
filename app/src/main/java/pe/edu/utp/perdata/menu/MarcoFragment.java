package pe.edu.utp.perdata.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import pe.edu.utp.perdata.R;
import pe.edu.utp.perdata.databinding.MarcoFragmentBinding;


public class MarcoFragment extends AppCompatActivity {

    InicioFragment inicioFragment = new InicioFragment();
    ComprasFragment comprasFragment = new ComprasFragment();
    CarritoFragment carritoFragment = new CarritoFragment();
    YoFragment yoFragment = new YoFragment();

    private MarcoFragmentBinding fragmentMenuBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragmentMenuBinding = MarcoFragmentBinding.inflate(getLayoutInflater());
        setContentView(fragmentMenuBinding.getRoot());

        BottomNavigationView navigationView =  findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(mOnNa);
    }

    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNa = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.inicioFragment:
                    loadFragment(inicioFragment);
                    return true;
                case R.id.comprasFragment:
                    loadFragment(comprasFragment);
                    return true;
                case R.id.carritoFragment:
                    loadFragment(carritoFragment);
                    return true;
                case R.id.yoFragment:
                    loadFragment(yoFragment);
                    return true;
            }
            return false;
        }
    };

    public void loadFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_container,fragment);
        fragmentTransaction.commit();

    }
}
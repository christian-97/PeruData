package pe.edu.utp.perdata;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.ui.AppBarConfiguration;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import pe.edu.utp.perdata.databinding.MarcoFragmentBinding;
import pe.edu.utp.perdata.menu.navegacionBaja.CarritoFragment;
import pe.edu.utp.perdata.menu.navegacionBaja.ComprasFragment;
import pe.edu.utp.perdata.menu.navegacionBaja.HomeFragment;
import pe.edu.utp.perdata.menu.navegacionBaja.YoFragment;
import pe.edu.utp.perdata.ui.adapter.ProductoAdapter;
import pe.edu.utp.perdata.viewmodel.ProductoViewModel;


public class MarcoFragment extends AppCompatActivity {

    HomeFragment homeFragment = new HomeFragment();
    ComprasFragment comprasFragment = new ComprasFragment();
    CarritoFragment carritoFragment = new CarritoFragment();
    YoFragment yoFragment = new YoFragment();

    private MarcoFragmentBinding fragmentMenuBinding;
    private ProductoViewModel productoViewModel;
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragmentMenuBinding = MarcoFragmentBinding.inflate(getLayoutInflater());
        setContentView(fragmentMenuBinding.getRoot());

        loadFragment(homeFragment);
        titulo("Inicio");

        BottomNavigationView navigationView =  findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(mOnNa);

    }

    public void titulo(String titulo){
        this.setTitle(titulo);
    }

    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNa = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.inicioFragment:
                    loadFragment(homeFragment);
                    titulo("Home");
                    return true;
                case R.id.comprasFragment:
                    loadFragment(comprasFragment);
                    titulo("Compras");
                    return true;
                case R.id.carritoFragment:
                    loadFragment(carritoFragment);
                    titulo("Carrito");
                    return true;
                case R.id.yoFragment:
                    loadFragment(yoFragment);
                    titulo("Yo");
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.inicio, menu);
        return true;
    }


}
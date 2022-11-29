package pe.edu.utp.perdata.viewmodel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import pe.edu.utp.perdata.apirest.ProductoClient;
import pe.edu.utp.perdata.model.Producto;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductoViewModel extends AndroidViewModel {

    public MutableLiveData<List<Producto>> listMutableLiveData = new MutableLiveData<>();
    public MutableLiveData<String> listaproducto = new MutableLiveData<>();


    public ProductoViewModel(@NonNull Application application) {
        super(application);
    }

    public void getProductos(){
        ProductoClient.getINSTANCE().getProductos().enqueue(new Callback<List<Producto>>() {
            @Override
            public void onResponse(Call<List<Producto>> call, Response<List<Producto>> response) {
                Log.i("DATAREST",response.body().toString());
                listMutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Producto>> call, Throwable t) {
                listaproducto.setValue(t.getMessage());
            }
        });
    }
}

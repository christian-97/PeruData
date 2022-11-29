package pe.edu.utp.perdata.apirest;

import java.util.List;

import pe.edu.utp.perdata.model.Producto;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProductoClient {

    private static final String BASE_URL = "https://cgutierrezrosas.herokuapp.com/apiproyecto/";
    private ProductoInterface productoInterface;
    private static ProductoClient INSTANCE;

    public ProductoClient(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        productoInterface = retrofit.create(ProductoInterface.class);
    }

    public static ProductoClient getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new ProductoClient();
        }
        return INSTANCE;
    }

    public Call<List<Producto>> getProductos(){
        return productoInterface.getProductos();
    }

}

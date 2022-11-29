package pe.edu.utp.perdata.apirest;

import java.util.List;

import pe.edu.utp.perdata.model.Producto;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductoInterface {

    @GET("productos")
    public Call<List<Producto>> getProductos();
}

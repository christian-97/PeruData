package pe.edu.utp.perdata.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import pe.edu.utp.perdata.databinding.ItemProductosBinding;
import pe.edu.utp.perdata.model.Producto;

public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.ViewHolder>{

    private List<Producto> productoList = new ArrayList<>();
    LayoutInflater inflater;

    @NonNull
    @Override
    public ProductoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemProductosBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoAdapter.ViewHolder holder, int position) {
        final Producto objProducto = productoList.get(position);
        holder.binding.tvid.setText((int) objProducto.getId());
        holder.binding.tvtitulo.setText(objProducto.getDescripcion());

    }

    @Override
    public int getItemCount() {
        return productoList.size();
    }

    public void setProductoList(List<Producto> lista){
        this.productoList.addAll(lista);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemProductosBinding binding;
        public ViewHolder(ItemProductosBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}

package anna.ruiz.ejerciciolistacompra.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ConcurrentModificationException;
import java.util.List;

import anna.ruiz.ejerciciolistacompra.Modelos.Producto;

public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter> {
    //Lista dnd almacenamos los card a mostrar
    private List<Producto> objects;
    //Almacena el num de la fila/view que queremos mostrar
    private int resource;
    //El contexto/actividad donde lo queremos mostrar
    private Context context;


    //Creamos un constructor de la clase

    public ProductoAdapter(List<Producto> objects, int resource, Context context) {
        this.objects = objects;
        this.resource = resource;
        this.context = context;
    }


    //Los tres metodos que nos pide implementar al hacer q extienda RecyclerView

    @NonNull
    @Override
    public ProductoAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Creamos la vista q recibe actividad y filas
        View productoView = LayoutInflater.from(context).inflate(resource, null);

        //le pasamos la info de como se va a ver el card
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT

        );
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoAdapter holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

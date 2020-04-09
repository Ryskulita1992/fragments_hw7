package kg.geektech.fragments_hw7;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    PressOnRecyclerView mpressOnRecyclerView;
    ArrayList <String>mdata=new ArrayList<>();


    public MainAdapter(ArrayList<String>data, PressOnRecyclerView pressOnRecyclerView){
        this.mdata=data;
        this.mpressOnRecyclerView=pressOnRecyclerView;

    }



    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.view_holder_main, parent, false);
        return new MainViewHolder(v,mpressOnRecyclerView);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.textView.setText(mdata.get(position));



    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }
}
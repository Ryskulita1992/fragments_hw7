package kg.geektech.fragments_hw7;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import javax.xml.transform.Result;

public class MainViewHolder extends ViewHolder implements PressOnRecyclerView {
    public TextView textView;
    PressOnRecyclerView pressOnRecycler;

    public MainViewHolder(@NonNull View itemView, PressOnRecyclerView pressOnRecyclerView) {
        super(itemView);

        textView = itemView.findViewById(R.id.holder_text_view);
        this.pressOnRecycler=pressOnRecyclerView;
        itemView.setOnClickListener((View.OnClickListener) this);

    }
@Override
    public void onClick(View view) {
        pressOnRecycler.pressOnRecyclerView(getAdapterPosition());
    }




    @Override
    public void pressOnRecyclerView(int number) {

    }
}


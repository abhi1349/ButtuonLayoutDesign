package com.example.abhi.buttonlayoutdesign;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class DaysDataAdapter extends RecyclerView.Adapter<DaysDataAdapter.View_Holder> {

    List<DaysData> list;
    Context context;

    public DaysDataAdapter(List<DaysData> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.days_row_layout, parent, false);
        View_Holder holder = new View_Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(final View_Holder holder, final int position) {
        holder.button.setText(list.get(position).getBtname());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, ""+list.get(position).getBtnId(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class View_Holder extends RecyclerView.ViewHolder {
        CardView cv;
        Button button;

        View_Holder(View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.cardView);
            button = itemView.findViewById(R.id.btn);
        }
    }

}
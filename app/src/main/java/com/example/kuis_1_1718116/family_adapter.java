package com.example.kuis_1_1718116;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class family_adapter extends RecyclerView.Adapter<family_adapter.familyViewHolder> {

    private ArrayList<family> dataList;

    public family_adapter(ArrayList<family> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public family_adapter.familyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_family, parent, false);
        return new familyViewHolder(view);
    }

    public void onBindViewHolder(familyViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNpm.setText(dataList.get(position).getStatus());
        holder.srcGambar.setImageDrawable(dataList.get(position).getGambar());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class familyViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNpm, txtNoHp;
        private ImageView srcGambar;

        public familyViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_keluarga);
            txtNpm = (TextView) itemView.findViewById(R.id.txt_status);
            srcGambar = (ImageView) itemView.findViewById(R.id.gambarku);
        }
    }
}

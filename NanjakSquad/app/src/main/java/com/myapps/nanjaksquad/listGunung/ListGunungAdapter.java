package com.myapps.nanjaksquad.listGunung;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.myapps.nanjaksquad.R;
import com.myapps.nanjaksquad.data.GunungEntity;
import com.myapps.nanjaksquad.databinding.ItemListGunungBinding;
import com.myapps.nanjaksquad.detailApp.DetailGunungActivity;

import java.util.ArrayList;
import java.util.List;

public class ListGunungAdapter extends RecyclerView.Adapter<ListGunungAdapter.ListGunungViewHolder> {
    private final List<GunungEntity> listGunung = new ArrayList<>();

    void setListGunung(List<GunungEntity> listGunung){
        if (listGunung == null) return;
        this.listGunung.clear();
        this.listGunung.addAll(listGunung);
    }

    @NonNull
    @Override
    public ListGunungViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewTyper){
        ItemListGunungBinding binding = ItemListGunungBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ListGunungViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ListGunungViewHolder holder, int position){
        GunungEntity gunung = listGunung.get(position);
        holder.bind(gunung);
    }

    @Override
    public int getItemCount(){return listGunung.size();}

    static class ListGunungViewHolder extends RecyclerView.ViewHolder{
        private final ItemListGunungBinding binding;

        ListGunungViewHolder(ItemListGunungBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(GunungEntity gunung) {
            binding.tvNama.setText(gunung.getNama());
            itemView.setOnClickListener(v -> {
                Intent intent = new Intent(itemView.getContext(), DetailGunungActivity.class);
                intent.putExtra(DetailGunungActivity.EXTRA_DETAILS, gunung.getNama());
                itemView.getContext().startActivity(intent);
            });
            Glide.with(itemView.getContext())
                    .load(gunung.getimage())
                    .apply(RequestOptions.placeholderOf(R.drawable.mountain).error(R.drawable.ic_error))
                    .into(binding.ivPosterList);
        }
    }
}
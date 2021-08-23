package com.myapps.nanjaksquad.listGunung;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myapps.nanjaksquad.R;
import com.myapps.nanjaksquad.data.GunungEntity;
import com.myapps.nanjaksquad.databinding.FragmentListGunungBinding;

import java.util.List;

public class ListGunungFragment extends Fragment{
    private FragmentListGunungBinding fragmentListGunungBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @androidx.annotation.Nullable ViewGroup container, @androidx.annotation.Nullable Bundle savedInstanceState){
        fragmentListGunungBinding = FragmentListGunungBinding.inflate(inflater, container, false);
        return fragmentListGunungBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @androidx.annotation.Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        if (getActivity() !=null){
            ListGunungViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(ListGunungViewModel.class);
            List<GunungEntity> gunung = viewModel.getGunung();

            ListGunungAdapter listGunungAdapter = new ListGunungAdapter();
            listGunungAdapter.setListGunung(gunung);

            fragmentListGunungBinding.rvGunung.setLayoutManager(new LinearLayoutManager(getContext()));
            fragmentListGunungBinding.rvGunung.setHasFixedSize(true);
            fragmentListGunungBinding.rvGunung.setAdapter(listGunungAdapter);
        }
    }
}
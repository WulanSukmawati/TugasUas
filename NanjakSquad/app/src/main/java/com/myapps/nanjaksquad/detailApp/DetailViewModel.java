package com.myapps.nanjaksquad.detailApp;

import androidx.lifecycle.ViewModel;

import com.myapps.nanjaksquad.data.GunungEntity;
import com.myapps.nanjaksquad.utils.DataDummy;

import java.util.ArrayList;

public class DetailViewModel extends ViewModel {
    private String nama;

    public void setSelectedEntity(String nama){this.nama = nama;}

    public GunungEntity getEntity(){
        GunungEntity data = null;
        ArrayList<GunungEntity> entities = DataDummy.generateGunungData();

        for (GunungEntity entity : entities){
            if (entity.getNama().equals(nama)){
                data = entity;
            }
        }
        return data;
    }
}

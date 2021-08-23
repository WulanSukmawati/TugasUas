package com.myapps.nanjaksquad.listGunung;

import androidx.lifecycle.ViewModel;

import com.myapps.nanjaksquad.data.GunungEntity;
import com.myapps.nanjaksquad.utils.DataDummy;

import java.util.List;

public class ListGunungViewModel extends ViewModel {

    public List<GunungEntity> getGunung(){return DataDummy.generateGunungData(); }
}
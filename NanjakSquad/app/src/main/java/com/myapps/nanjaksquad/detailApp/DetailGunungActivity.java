package com.myapps.nanjaksquad.detailApp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.myapps.nanjaksquad.R;
import com.myapps.nanjaksquad.data.GunungEntity;
import com.myapps.nanjaksquad.databinding.ActivityDetailGunungBinding;
import com.myapps.nanjaksquad.databinding.ContentDetailBinding;

public class DetailGunungActivity extends AppCompatActivity {

    public static final String EXTRA_DETAILS = "extra_details";
    private ContentDetailBinding contentDetailBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDetailGunungBinding activityDetailGunungBinding = ActivityDetailGunungBinding.inflate(getLayoutInflater());
        contentDetailBinding = activityDetailGunungBinding.detailContent;

        setContentView(activityDetailGunungBinding.getRoot());

        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle(R.string.detail);
        String title = actionBar.getTitle().toString();

        DetailViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(DetailViewModel.class);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String nama = extras.getString(EXTRA_DETAILS);
            if (nama != null){
                viewModel.setSelectedEntity(nama);
                populateDetails(viewModel.getEntity());
            }
        }
    }

    private void populateDetails(GunungEntity gunungEntity){
        contentDetailBinding.textNama.setText(gunungEntity.getNama());
        contentDetailBinding.textKetinggian.setText(gunungEntity.getKetinggian());
        contentDetailBinding.textLokasi.setText(gunungEntity.getLokasi());
        contentDetailBinding.textKeterangan.setText(gunungEntity.getKeterangan());

        Glide.with(this)
                .load(gunungEntity.getimage())
                .transform(new RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.mountain)
                    .error(R.drawable.ic_error))
                .into(contentDetailBinding.imagePoster);
    }
}
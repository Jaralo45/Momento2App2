package com.example.ftienda;

import android.os.Bundle;

import com.example.ftienda.models.ComputerModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class DetailActivity extends BaseActivity {

    private FloatingActionButton fab_detail_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        super.init();
        init();

        model = (ComputerModel) getIntent().getSerializableExtra("model");
        if (model != null){
            makeSimpleAlertDialog("Información","Valor: "+model.getSerial());
            Bundle bundle = new Bundle();
            bundle.putSerializable("model", model);
            DataDetailFragment.receiveData(bundle);
        }else{
            makeSimpleAlertDialog("Error", "Modelo Vacío");
        }

        fab_detail_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToList();
            }
        });
    }

    protected void init(){
        fab_detail_list = findViewById(R.id.fab_detail_list);
    }

}

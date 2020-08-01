package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class general extends AppCompatActivity {

    TextView txtTitle;
    GridView gridView;
    public static String titleMenu;
    public ArrayList<item_model_menu_general> listomumi,listtakhasosi,listmaqalat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        txtTitle = findViewById(R.id.title_general);
        gridView = findViewById(R.id.grid_menu);

        Bundle bundle = getIntent().getExtras();
        Boolean omumi = bundle.getBoolean("omumi");
        Bundle bundle_takhasosi = getIntent().getExtras();
        Boolean takhasosi = bundle_takhasosi.getBoolean("takhasosi");
        Bundle bundle_maqalat = getIntent().getExtras();
        Boolean maqalat = bundle_maqalat.getBoolean("maqalat");

        if (omumi) {
            setOmumi();
            adapter_menu_general adapter = new adapter_menu_general(general.this, R.layout.item_grid_menu_general, listomumi);
            gridView.setAdapter(adapter);
        }else if (takhasosi){
            setTakhasosi();
            adapter_menu_general adapter = new adapter_menu_general(general.this, R.layout.item_grid_menu_general, listtakhasosi);
            gridView.setAdapter(adapter);
        }else if (maqalat){
            setMaqalat();
            adapter_menu_general adapter = new adapter_menu_general(general.this, R.layout.item_grid_menu_general, listmaqalat);
            gridView.setAdapter(adapter);
        }
    }

    private void setMaqalat() {
        listmaqalat = new ArrayList<>();
        listmaqalat.add(new item_model_menu_general(R.drawable.test3,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listmaqalat = new ArrayList<>();
        listmaqalat.add(new item_model_menu_general(R.drawable.test3,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
    }

    private void setTakhasosi() {
        listtakhasosi = new ArrayList<>();
        listtakhasosi.add(new item_model_menu_general(R.drawable.test2,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listtakhasosi = new ArrayList<>();
        listtakhasosi.add(new item_model_menu_general(R.drawable.test2,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
    }

    private void setOmumi() {
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
        listomumi = new ArrayList<>();
        listomumi.add(new item_model_menu_general(R.drawable.test,
                "درس شبکه های اینترنتی",
                "مهندسی نرم افزار",
                "3500"));
    }

}
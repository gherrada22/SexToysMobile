package com.example.project.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.project.Adaptor.PopluarAdaptor;
import com.example.project.Domain.CategoryDomain;
import com.example.project.Adaptor.CatregoryAdaptor;
import com.example.project.Domain.FoodDomain;
import com.example.project.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter, adapter2;
    private RecyclerView recyclerViewCategoryList, RecyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();
        recyclerViewPopular();
        BottomNavigation();
    }

    private void BottomNavigation() {
        FloatingActionButton floatingActionButton = findViewById(R.id.cartBtn);
        LinearLayout homeBtn = findViewById(R.id.home_Btn);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CartListActivity.class));
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList = findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category = new ArrayList<>();
        category.add((new CategoryDomain("Mujeres", "cat_1")));
        category.add((new CategoryDomain("Hombres", "cat_2")));
        category.add((new CategoryDomain("Lesbi", "cat_3")));
        category.add((new CategoryDomain("Gays", "cat_4")));
        category.add((new CategoryDomain("Trios", "cat_5")));

        adapter = new CatregoryAdaptor(category);
        recyclerViewCategoryList.setAdapter(adapter);
    }

    private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerViewPopularList = findViewById(R.id.recyclerView2);
        RecyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodList = new ArrayList<>();
        foodList.add(new FoodDomain("Pulpo", "pop_1", "Vibrador pulpo PARA MUJER: el vibrador pulpo con lengua puede estimular los pezones, el clítoris y la vagina o cualquier punto sensible. Puede cambiar a lamer de lengua para jugar al clítoris y los pezones a voluntad. ¡La estimulación instantánea bajo doble definitivamente te hará llorar!\n" +
                "Modos de lamer de lengua: el juguete de pulpo tiene una función de vibración de lamer de lengua única. Una lengua de pulpo lamerá su clítoris, pezones, vagina y otras áreas sensibles, de suave A salvaje, brindándole un placer húmedo picazón y embriagante, que le proporcionará el clímax que nunca imaginó.", 120.76));
        foodList.add(new FoodDomain("Siri2", "pop_2", "Sí, hay más 'Siris' aparte de la voz de tu iPhone. Este Siri es un divertido masajeador ultra potente que responde al sonido ambiente, tanto si está sonando tu 'playlist' favorita como si es la voz de tu pareja. Y podría pasar perfectamente por una depiladora.", 88.79));
        foodList.add(new FoodDomain("Endless Love", "pop_3", "Este vibrador estimula de la forma que quieras: delante, encima, dentro, debajo,... Tiene tres motores y más de 100 combinaciones de vibraciones para elegir", 75.5));

        adapter2 = new PopluarAdaptor(foodList);
        RecyclerViewPopularList.setAdapter(adapter2);


    }
}
package com.p.g.j.lenovo.jgp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    private Fruit[] fruits={new Fruit("Orange",R.drawable.orange),new Fruit("apple",R.drawable.apple),new Fruit("grapes",R.drawable.grapes)
    ,new Fruit("cherry",R.drawable.chreey)};
    private List<Fruit> fruitList = new ArrayList<>();
    private FruitAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar =(Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        initFruits();
        RecyclerView rv = (RecyclerView)findViewById(R.id.recycler_view);
        GridLayoutManager layoutManager =new GridLayoutManager(this,2);
        rv.setLayoutManager(layoutManager);
        adapter = new FruitAdapter(fruitList);
        rv.setAdapter(adapter);
    }
    private void initFruits(){
        fruitList.clear();
        for(int i = 0;i<50;i++){
            Random random = new Random();
            int index = random.nextInt(fruits.length);
            fruitList.add(fruits[index]);
        }
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toobar,menu);
        return  true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add:
                Toast.makeText(this, "add", Toast.LENGTH_SHORT).show();
        }
        return  true;
    }

}

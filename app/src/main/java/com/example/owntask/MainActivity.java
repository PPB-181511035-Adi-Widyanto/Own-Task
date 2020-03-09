package com.example.owntask;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter adapter;
    //private RecyclerView taskList;
    //ArrayList<Card> taskCard = new ArrayList<>();

    int request_Code = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new ViewPageAdapter(getSupportFragmentManager());


        //add fragment
        adapter.AddFragment(new FragmentToDoList(),"ToDoList");
        adapter.AddFragment(new FragmentOnProgress(),"OnProgress");
        adapter.AddFragment(new FragmentDone(),"Done");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void onClick(View view) {
        startActivityForResult(new Intent("com.example.owntask.AddCardActivity"),request_Code);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == request_Code) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(this,data.getData().toString(),Toast.LENGTH_SHORT).show();
                /*taskCard.add(new Card(data.getStringExtra("task_name"), data.getStringExtra("description"),R.drawable.date));
                adapter = new RecyclerViewAdapter(taskCard);
                this.taskList.setAdapter(adapter);*/
            }
        }
    }

}
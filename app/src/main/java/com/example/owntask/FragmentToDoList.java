package com.example.owntask;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentToDoList extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Card> lstCard;

    public FragmentToDoList() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.todolist_fragment,container,false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.todolist_recyclerview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstCard);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstCard = new ArrayList<>();
        lstCard.add(new Card("Membuat makalah proyek","Makalah harus dikumpulkan minggu depan",R.drawable.date));
        lstCard.add(new Card("Menyelesaikan puzzle","Teka teki yang ada di ruangan serba guna",R.drawable.date));
        lstCard.add(new Card("Tugas matematika","Di buku paket halaman 10 no 1 s/d 30",R.drawable.date));
        lstCard.add(new Card("Tugas ahasa inggris","Mempelajari grammar lebih dalam",R.drawable.date));
        lstCard.add(new Card("Tugas design poster","Bertemakan 17 agustus 1945",R.drawable.date));
        lstCard.add(new Card("Belanja bulanan","Membeli keperluan yang habis",R.drawable.date));
        lstCard.add(new Card("Ulang tahun Rani","Memberi hadiah boneka",R.drawable.date));

    }
}

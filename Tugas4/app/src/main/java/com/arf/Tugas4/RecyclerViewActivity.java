package com.arf.Tugas4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private com.arf.Tugas4.MahasiswaAdapter mAdapter;
    private RecyclerView rvMahasiswa;
    private ArrayList<com.arf.Tugas4.Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);

        mAdapter = new com.arf.Tugas4.MahasiswaAdapter(mahasiswaArrayList);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(mAdapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new com.arf.Tugas4.Mahasiswa("Annaufal Risvanda Firdaus", "E41192290", "Teknik Informatika"));
        mahasiswaArrayList.add(new com.arf.Tugas4.Mahasiswa("Daro Qutni Alfarisi", "E41191975", "Teknik  Informatika"));
        mahasiswaArrayList.add(new com.arf.Tugas4.Mahasiswa("Riyan", "E41192426", "Teknik  Informatika"));
        mahasiswaArrayList.add(new com.arf.Tugas4.Mahasiswa("Anton", "E41191929", "Teknik  Informatika"));
        mahasiswaArrayList.add(new com.arf.Tugas4.Mahasiswa("Dimas", "E41192208", "Teknik  Informatika"));
        mahasiswaArrayList.add(new com.arf.Tugas4.Mahasiswa("Indra", "E41192478", "Teknik  Informatika"));
        mahasiswaArrayList.add(new com.arf.Tugas4.Mahasiswa("Pras", "E41192428", "Teknik  Informatika"));
    }
}
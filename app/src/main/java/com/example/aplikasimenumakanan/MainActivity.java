package com.example.aplikasimenumakanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private final ArrayList<String> fotoMakanan = new ArrayList<>();
    private final ArrayList<String> namaMakanan = new ArrayList<>();
    private final ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){
        namaMakanan.add("Bibimbap");
        fotoMakanan.add("https://en.m.wikipedia.org/wiki/File:Dolsot-bibimbap.jpg");
        infoMakanan.add("Bibimbap adalah masakan Korea berupa semangkuk nasi putih dengan lauk di atasnya berupa sayur-sayuran, daging sapi, telur, dan saus pedas gochujang. Namanya secara harafiah berarti \"nasi campur\" yang berasal dari kata 비빔 dan 밥. Sebelum dimakan, nasi dan lauk diaduk menjadi satu.           Harga : Rp.32.000");

        namaMakanan.add("Tteokbokki");
        fotoMakanan.add("https://img.kurio.network/Qs5ftrYRMianlEZD3jwb5Yi0iPI=/411x231/filters:quality(80)/https://kurio-img.kurioapps.com/21/04/07/bd3a52b2-0b46-45b1-85f4-0d3597e3ec00.jpe");
        infoMakanan.add("Tteokbokki adalah makanan Korea berupa tteok dari tepung beras yang dimasak dalam bumbu gochujang yang pedas dan manis. Tteok yang dipakai berbentuk batang yang memanjang. Makanan ini juga termasuk dalam makanan internasional. Harga : Rp.25.000");

        namaMakanan.add("Ramyeon");
        fotoMakanan.add("https://cdn-popbela-com.cdn.ampproject.org/ii/w820/s/cdn.popbela.com/content-images/post/20200820/b258482e88d42cf8a15823e9538211bd_750x500.png");
        infoMakanan.add("Ramyeon atau Ramyun adalah hidangan mi kuah ala Korea. Mi ramyeon dapat dibuat dari mi basah atau mi instan, beberapa merek ramyeon instan selain dikonsumsi di Korea Selatan, ada juga yang diekspor ke luar negeri, seperti ke Tiongkok, Hong Kong, Makau, Jepang, dan Indonesia.        Harga : Rp.36.000");

        namaMakanan.add("Gimbap");
        fotoMakanan.add("https://www.seriouseats.com/thmb/HOoaiima986yCHxArNMxE4VKTXo=/450x0/filters:no_upscale():max_bytes(150000):strip_icc()/__opt__aboutcom__coeus__resources__content_migration__serious_eats__seriouseats.com__2020__01__20200122-gimbap-vicky-wasik-24-f5ed1075f35846a29e0812ee053a1bf8.jpg");
        infoMakanan.add("Gimbap adalah jenis makanan Korea yang terdiri dari nasi yang dibungkus dengan rumput laut. Gimbap populer sebagai makanan yang dibawa piknik, hiking atau aktivitas lain di luar ruangan.              Harga : Rp.25.000");


        prosesRecyclerViewAdapter();
    }

}
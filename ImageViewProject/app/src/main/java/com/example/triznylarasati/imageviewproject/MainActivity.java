package com.example.triznylarasati.imageviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //membuat global variable
    Button btn_back;
    Button btn_next;
    int current_image = 0; //untuk image counter
    int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3}; //inisiasi image array
    ImageView image_view_obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //memanggil global variable
        btn_back = (Button)findViewById(R.id.btn_back);
        btn_next = (Button)findViewById(R.id.btn_next);
        image_view_obj = (ImageView)findViewById(R.id.image1);

        //memanggil button back dan mengisi perintahnya
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_image == 0) { //jika image berada di array posisi 0 (image1)
                    current_image = images.length; //image tetap berada di image1
                } else {
                    current_image--;//jika image di posisi array selain 0, image kembali ke posisi array sebelumnya
                }
                current_image = current_image % images.length;//i
                image_view_obj.setImageResource(images[current_image]);
            }
        });

        //memanggil button next dan mengisi perintahnya
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_image++; //posisi image terus bertambah dari posisi array sebelumnya
                current_image = current_image % images.length;
                image_view_obj.setImageResource(images[current_image]);
            }
        });
    }
}

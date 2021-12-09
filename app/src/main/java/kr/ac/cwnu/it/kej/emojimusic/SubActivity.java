package kr.ac.cwnu.it.kej.emojimusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    private Button btn_spr;
    private ImageView img_spr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        btn_spr = findViewById(R.id.btn_spr);
        btn_spr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/tXV7dfvSefo"));
                startActivity(intent);
            }
        });

        img_spr = (ImageView) findViewById(R.id.img_spr);
        img_spr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "하단 버튼을 눌러주세요!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
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

public class SubActivity1 extends AppCompatActivity {

    private Button btn_sum;
    private ImageView img_sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        btn_sum = findViewById(R.id.btn_sum);
        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/ESKfHHtiSjs"));
                startActivity(intent);
            }
        });

        img_sum = (ImageView) findViewById(R.id.img_sum);
        img_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "하단 버튼을 눌러주세요!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
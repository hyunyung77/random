package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.chip.Chip;

public class RandomAG extends AppCompatActivity {

    Chip chip_a, chip_b, chip_c, chip_d;
    TextView click1, click2, click3, click4;
    TextView per1, per2, per3, per4;
    TextView chance1, chance2, chance3, chance4;
    Button bt;

    int click1N, click2N, click3N, click4N;
    double per1N, per2N, per3N, per4N;
    double chance1N, chance2N, chance3N, chance4N;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_ag);

        chip_a = (findViewById(R.id.chipa));
        chip_b = (findViewById(R.id.chipb));
        chip_c = (findViewById(R.id.chipc));
        chip_d = (findViewById(R.id.chipd));

        click1 = (findViewById(R.id.click1));
        click2 = (findViewById(R.id.click2));
        click3 = (findViewById(R.id.click3));
        click4 = (findViewById(R.id.click4));

        per1 = (findViewById(R.id.per1));
        per2 = (findViewById(R.id.per2));
        per3 = (findViewById(R.id.per3));
        per4 = (findViewById(R.id.per4));

        chance1 = (findViewById(R.id.chance1));
        chance2 = (findViewById(R.id.chance2));
        chance3 = (findViewById(R.id.chance3));
        chance4 = (findViewById(R.id.chance4));

        bt = (findViewById(R.id.bt));

        click1N = Integer.parseInt(click1.getText().toString());
        click2N = Integer.parseInt(click2.getText().toString());
        click3N = Integer.parseInt(click3.getText().toString());
        click4N = Integer.parseInt(click4.getText().toString());
        per1N = Double.parseDouble(per1.getText().toString());
        per2N = Double.parseDouble(per2.getText().toString());
        per3N = Double.parseDouble(per3.getText().toString());
        per4N = Double.parseDouble(per4.getText().toString());
        chance1N = Double.parseDouble(chance1.getText().toString());
        chance2N = Double.parseDouble(chance2.getText().toString());
        chance3N = Double.parseDouble(chance3.getText().toString());
        chance4N = Double.parseDouble(chance4.getText().toString());

        //double perT = click1N + click2N + click3N + click4N;    //전체값
        //double P = 0;                                           //해당값에 대한 백분율



        chip_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //클릭수 증가
                click1N++;
                click1.setText(String.valueOf(click1N));

                //백분율
                double perT = click1N + click2N + click3N + click4N;
                double P1 = 0, P2 = 0, P3 = 0, P4 = 0;
                P1 = click1N / perT;
                per1.setText(String.valueOf(P1));
                P2 = click2N / perT;
                per2.setText(String.valueOf(P2));
                P3 = click3N / perT;
                per3.setText(String.valueOf(P3));
                P4 = click4N / perT;
                per4.setText(String.valueOf(P4));

                //추천확률
                chance1N = P1 * 100;
                chance1.setText(String.valueOf(chance1N) + "%");
                chance2N = P2 * 100;
                chance2.setText(String.valueOf(chance2N) + "%");
                chance3N = P3 * 100;
                chance3.setText(String.valueOf(chance3N) + "%");
                chance4N = P4 * 100;
                chance4.setText(String.valueOf(chance4N) + "%");
                
            }
        });

        chip_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //클릭수 증가
                click2N++;
                click2.setText(String.valueOf(click2N));

                //백분율
                double perT = click1N + click2N + click3N + click4N;
                double P1 = 0, P2 = 0, P3 = 0, P4 = 0;
                P1 = click1N / perT;
                per1.setText(String.valueOf(P1));
                P2 = click2N / perT;
                per2.setText(String.valueOf(P2));
                P3 = click3N / perT;
                per3.setText(String.valueOf(P3));
                P4 = click4N / perT;
                per4.setText(String.valueOf(P4));

                //추천확률
                chance1N = P1 * 100;
                chance1.setText(String.valueOf(chance1N) + "%");
                chance2N = P2 * 100;
                chance2.setText(String.valueOf(chance2N) + "%");
                chance3N = P3 * 100;
                chance3.setText(String.valueOf(chance3N) + "%");
                chance4N = P4 * 100;
                chance4.setText(String.valueOf(chance4N) + "%");
                
            }
        });

        chip_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //클릭수 증가
                click3N++;
                click3.setText(String.valueOf(click3N));

                //백분율
                double perT = click1N + click2N + click3N + click4N;
                double P1 = 0, P2 = 0, P3 = 0, P4 = 0;
                P1 = click1N / perT;
                per1.setText(String.valueOf(P1));
                P2 = click2N / perT;
                per2.setText(String.valueOf(P2));
                P3 = click3N / perT;
                per3.setText(String.valueOf(P3));
                P4 = click4N / perT;
                per4.setText(String.valueOf(P4));

                //추천확률
                chance1N = P1 * 100;
                chance1.setText(String.valueOf(chance1N) + "%");
                chance2N = P2 * 100;
                chance2.setText(String.valueOf(chance2N) + "%");
                chance3N = P3 * 100;
                chance3.setText(String.valueOf(chance3N) + "%");
                chance4N = P4 * 100;
                chance4.setText(String.valueOf(chance4N) + "%");
            }
        });

        chip_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click4N++;
                click4.setText(String.valueOf(click4N));

                //백분율
                double perT = click1N + click2N + click3N + click4N;
                double P1 = 0, P2 = 0, P3 = 0, P4 = 0;
                P1 = click1N / perT;
                per1.setText(String.valueOf(P1));
                P2 = click2N / perT;
                per2.setText(String.valueOf(P2));
                P3 = click3N / perT;
                per3.setText(String.valueOf(P3));
                P4 = click4N / perT;
                per4.setText(String.valueOf(P4));

                //추천확률
                chance1N = P1 * 100;
                chance1.setText(String.valueOf(chance1N) + "%");
                chance2N = P2 * 100;
                chance2.setText(String.valueOf(chance2N) + "%");
                chance3N = P3 * 100;
                chance3.setText(String.valueOf(chance3N) + "%");
                chance4N = P4 * 100;
                chance4.setText(String.valueOf(chance4N) + "%");
            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click1N = 0;
                click1.setText(String.valueOf(click1N));
                click2N = 0;
                click2.setText(String.valueOf(click2N));
                click3N = 0;
                click3.setText(String.valueOf(click3N));
                click4N = 0;
                click4.setText(String.valueOf(click4N));
            }
        });



    }
}
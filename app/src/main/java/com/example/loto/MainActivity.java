package com.example.loto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    LocalDateTime date1 = LocalDateTime.now();
    DateTimeFormatter dtformat1 =
            DateTimeFormatter.ofPattern("SSSyyyyss");
    String fdate1 = dtformat1.format(date1);
    int num = Integer.parseInt(fdate1);

    DateTimeFormatter dtformat2 =
            DateTimeFormatter.ofPattern("ssddMM");
    String fdate2 = dtformat2.format(date1);
    int num2 = Integer.parseInt(fdate2);

    int seed = num;
    int seed2 = num2*9;

    private Button loto6;
    private Button loto7;
    private Button mini;
    private Button numb3;
    private Button numb4;
    private Button bingo;
    private Button reset;
    private Button ikkatsu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text_loto6 = findViewById(R.id.loto6V);
        final TextView text_loto7 = findViewById(R.id.loto7V);
        final TextView text_mini = findViewById(R.id.miniV);
        final TextView text_numb3 = findViewById(R.id.numb3V);
        final TextView text_numb4 = findViewById(R.id.numb4V);
        final TextView text_bingo = findViewById(R.id.bingoV);


        loto6 = findViewById(R.id.button_Qloto6);
        loto7 = findViewById(R.id.button_Qloto7);
        mini = findViewById(R.id.button_Qmini);
        numb3 = findViewById(R.id.button_Qnumb3);
        numb4 = findViewById(R.id.button_Qnumb4);
        bingo = findViewById(R.id.button_Qbingo);
        reset = findViewById(R.id.button_Qreset);
        ikkatsu = findViewById(R.id.button_Qikkatsu);

        loto6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text_loto6.setText(String.valueOf(loto6M()));
            }
        });

        loto7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text_loto7.setText(String.valueOf(loto7M()));
            }
        });

        mini.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text_mini.setText(String.valueOf(miniM()));
            }
        });

        numb3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text_numb3.setText(String.valueOf(numb3M()));
            }
        });

        numb4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text_numb4.setText(String.valueOf(numb4M()));
            }
        });

        bingo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    text_bingo.setText(String.valueOf(bingoM()));
            }
        });

        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text_loto6.setText(R.string.click_d_01);
                text_loto7.setText(R.string.click_d_01);
                text_mini.setText(R.string.click_d_01);
                text_numb3.setText(R.string.click_d_01);
                text_numb4.setText(R.string.click_d_01);
                text_bingo.setText(R.string.click_d_01);
            }
        });

        ikkatsu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text_loto6.setText(String.valueOf(loto6M()));
                text_loto7.setText(String.valueOf(loto7M()));
                text_mini.setText(String.valueOf(miniM()));
                text_numb3.setText(String.valueOf(numb3M()));
                text_numb4.setText(String.valueOf(numb4M()));
                text_bingo.setText(String.valueOf(bingoM()));
            }
        });

    }

    ///---------------------------------------------------------
    public List loto6M() {
        int maxNum = 43;
        int setNum = 6;
        Random rand1 = new Random(seed);
        int key = rand1.nextInt(seed/seed2);

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        for(int i=0; i<maxNum; i++) {
            list.add(i+1);
        }
        for(int i=0; i<key; i++) {
            Collections.shuffle(list);
        }
        for(int i=0; i<setNum; i++) {
            list1.add(list.get(i+setNum));
        }
        Collections.sort(list1);
        return list1;
    }
    ///---------------------------------------------------------
    public List loto7M() {
        int maxNum = 37;
        int setNum = 7;
        Random rand1 = new Random(seed);
        int key = rand1.nextInt(seed/seed2);

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        for(int i=0; i<maxNum; i++) {
            list.add(i+1);
        }
        for(int i=0; i<key; i++) {
            Collections.shuffle(list);
        }
        for(int i=0; i<setNum; i++) {
            list1.add(list.get(i+setNum));
        }
        Collections.sort(list1);
        return list1;
    }
    ///---------------------------------------------------------
    public List miniM() {
        int maxNum = 31;
        int setNum = 5;
        Random rand1 = new Random(seed);
        int key = rand1.nextInt(seed/seed2);

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        for(int i=0; i<maxNum; i++) {
            list.add(i+1);
        }
        for(int i=0; i<key; i++) {
            Collections.shuffle(list);
        }
        for(int i=0; i<setNum; i++) {
            list1.add(list.get(i+setNum));
        }
        Collections.sort(list1);
        return list1;
    }
    ///---------------------------------------------------------
    public List numb3M() {
        int maxNum = 10;
        int setNum = 3;
        LocalDateTime date3 = LocalDateTime.now();
        DateTimeFormatter dtformat3 =
                DateTimeFormatter.ofPattern("SSSHH");
        String fdate3 = dtformat3.format(date3);
        int rnum3 = Integer.parseInt(fdate3);
        List<Integer> list1 = new ArrayList<>();
        Random rand1 = new Random(seed%rnum3*10);
        for(int i=0; i<setNum; i++) {
            list1.add(rand1.nextInt(maxNum));
        }
        return list1;
    }
    ///---------------------------------------------------------
    public List numb4M() {
        int maxNum = 10;
        int setNum = 4;
        LocalDateTime date3 = LocalDateTime.now();
        DateTimeFormatter dtformat3 =
                DateTimeFormatter.ofPattern("SSSHH");
        String fdate3 = dtformat3.format(date3);
        int rnum3 = Integer.parseInt(fdate3);
        List<Integer> list1 = new ArrayList<>();
        Random rand1 = new Random(seed%rnum3*10);
        for(int i=0; i<setNum; i++) {
            list1.add(rand1.nextInt(maxNum));
        }
        return list1;
    }
    ///---------------------------------------------------------
    public List bingoM() {
        int maxNum = 5;
        int setNum = 5;
        int box = 8;
        int boxC = 0;
        LocalDateTime date3 = LocalDateTime.now();
        DateTimeFormatter dtformat3 =
                DateTimeFormatter.ofPattern("SSSHH");
        String fdate3 = dtformat3.format(date3);
        int rnum3 = Integer.parseInt(fdate3);
        Random rand1 = new Random(seed%rnum3*10);
        List<Integer> list1 = new ArrayList<>();
        for(int i=0; i<box; i++) {
            list1.add(rand1.nextInt(maxNum)+1+(setNum*boxC));
            boxC++;
        }
        return list1;
    }







}

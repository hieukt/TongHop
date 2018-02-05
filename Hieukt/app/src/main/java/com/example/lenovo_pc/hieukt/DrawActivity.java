package com.example.lenovo_pc.hieukt;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.OnColorSelectedListener;
import com.flask.colorpicker.builder.ColorPickerClickListener;
import com.flask.colorpicker.builder.ColorPickerDialogBuilder;

/**
 * Created by Lenovo-PC on 2/1/2018.
 */

public class DrawActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "DrawActivity";
    private ImageView ivColor;
    private ImageView ivDone;
    private RadioButton rbThin;
    private RadioButton rbMedium;
    private RadioButton rbStrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);

        setupUI();
    }

    private void setupUI() {
        ivColor = findViewById(R.id.iv_color);
        ivDone = findViewById(R.id.iv_done);
        rbThin = findViewById(R.id.rb_thin);
        rbMedium = findViewById(R.id.rb_medium);
        rbStrong = findViewById(R.id.rb_strong);
        ivColor.setOnClickListener(this);
        ivDone.setOnClickListener(this);
        rbThin.setOnClickListener(this);
        rbMedium.setOnClickListener(this);
        rbStrong.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_color: {
                ColorPickerDialogBuilder
                        .with(this)
                        .setTitle("Choose color")
                        .initialColor(-888888)
                        .wheelType(ColorPickerView.WHEEL_TYPE.FLOWER)
                        .density(20)
                        .setOnColorSelectedListener(new OnColorSelectedListener() {
                            @Override
                            public void onColorSelected(int selectedColor) {

                            }
                        })
                        .setPositiveButton("Ok", new ColorPickerClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int selectedColor, Integer[] allColors) {
                                Toast.makeText(DrawActivity.this, " " + selectedColor, Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        })
                        .build()
                        .show();
                break;
            }
            case R.id.iv_done: {
                break;
            }
            case R.id.rb_thin: {
                Toast.makeText(DrawActivity.this, "Thin", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.rb_medium: {
                Toast.makeText(DrawActivity.this, "Medium", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.rb_strong: {
                Toast.makeText(DrawActivity.this, "Strong", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }
}


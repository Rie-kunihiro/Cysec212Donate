package com.example.donate;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.util.Log;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Donate extends AppCompatActivity {
    private final int CAMERA_REQ_CODE = 100;
    private Button Apply;
    private RadioGroup paymentMethod;
    private EditText amountText;
    private TextView amountTotal;
    private int totalDonated = 0;
    private boolean TargetAchieved = false;

    ImageView imgCamera;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        Apply = findViewById(R.id.Apply);
        if (Apply != null){
            Log.v("Donate", "Nice donation")
        }


        ImageView imgCamera = findViewById(R.id.imgCamera);
        Button btnCamera = findViewById(R.id.btnCamera);
        paymentMethod = findViewById(R.id.paymentMethod);
        progressBar = findViewById(R.id.progressbar);
        amountText =findViewById(R.id.patmentAmount);
                amountTotal = findViewById(R.id.total$);
                progressBar.setMax(10000);




                public boolean onCreateOptionsMenu(Menu menu){
                    getMenuInflater().inflate(R.menu.main_menu. menu);
                    return true;
        }

        boolean onOptionsItemSelected(MenuItem item){
                    int id = item.getItemId();

                    if (id == R.id.action_settings){

                    }
        }
        public void ApplyButtonProssed (View view){
                    String method = paymentMethod.getCheckedRadioButtonId() == R.id.gcash ? "Gcash" : "Payaaya";
                    int donatedAmount = amountnumber.getValue();
                    if (donatedAmount == 0)
                    {
                        String text = amountText.getText().toString();
                        if (!text.equals(""))
                            donatedAmount = Integer.parseInt(text);
                    }

                    if (!targetAchieved)
                    {
                        totalDonated = totalDonated + donatedAmount;
                        targetAchieved = totalDonated >= 10000;
                        progressBar.setProgress(totalDonated);
                        String totalDonatedStr = " $." + totalDonated;
                        amountTotal.setText(totalDonatedStr);
                    }
                    else
                    {
                        Toast toast = Toast.makeText(this, "Target Exceeded!", Toast.LENGTH_SHORT);
                        toast.show();
                    }

                    Log.v("Donate", amountPicker.getValue() + "donated by " + method + "\nCurrent total" + totalDonated);

        }

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(iCamera,CAMERA_REQ_CODE);


            }
        });






    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode==RESULT_OK){
            if (requestCode==CAMERA_REQ_CODE);

            Bitmap img = (Bitmap)(data.getExtras().get("data"));
            imgCamera.setImageBitmap(img);
        }

    }
}
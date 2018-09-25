package training.ipb.ipbtrainingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//Version 1
//public class MainActivity extends AppCompatActivity {
//    private EditText namaEditText;
//    private Button masukButton;
//    private String nama;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        //Binding the view
//        namaEditText = findViewById(R.id.inputNamaEditText);
//        masukButton = findViewById(R.id.masukButton);
//        //Click Listener
//        masukButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                nama = namaEditText.getText().toString();
//                //Creating Intent and put the data inside Intent
//                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
//                intent.putExtra("data", nama);
//                startActivity(intent);
//            }
//        });
//    }
//}

//Version 2
//public class MainActivity extends AppCompatActivity {
//    private EditText namaEditText;
//    private Button masukButton;
//    private String nama;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        //Binding the view
//        namaEditText = findViewById(R.id.inputNamaEditText);
//        masukButton = findViewById(R.id.masukButton);
//        //Click Listener
//        masukButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (namaEditText.getText().toString().equals("")){
//                    Toast.makeText(MainActivity.this, "Nama Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
//                }else{
//                    nama = namaEditText.getText().toString();
//                    //Creating Intent and put the data inside Intent
//                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
//                    intent.putExtra("data", nama);
//                    startActivity(intent);
//                }
//            }
//        });
//    }
//}

//Version 3 with POJO
public class MainActivity extends AppCompatActivity {
    private EditText namaEditText, umurEditText, genderEditText, alamatEditText;
    private Button masukButton;
    private String nama, gender, alamat;
    private int umur;
    private User userData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Binding the view
        namaEditText = findViewById(R.id.inputNamaEditText);
        umurEditText = findViewById(R.id.inputUmurEditText);
        genderEditText = findViewById(R.id.inputGenderEditText);
        alamatEditText = findViewById(R.id.inputAlamatEditText);
        masukButton = findViewById(R.id.masukButton);
        //Click Listener
        masukButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ReceivingActivity.class);
                startActivity(intent);
            }
        });
    }
}
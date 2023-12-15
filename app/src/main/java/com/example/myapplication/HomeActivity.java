package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HomeActivity extends AppCompatActivity {
    DatabaseReference databaseReference;
    Spinner spinnerbus,spinnercoach,spinnernational,spinnerinternational,spinnertram,spinnertusub,spinnertaxi;
    EditText editTextbus,editTextcoach,editTextnational,editTextinternational,editTexttram,editTexttusub,editTexttaxi;
    Button buttonCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        editTextbus = findViewById(R.id.editTextBus);
        editTextcoach = findViewById(R.id.editTextCoach);
        editTextnational = findViewById(R.id.editTextNational);
        editTextinternational = findViewById(R.id.editTextInternational);
        editTexttram = findViewById(R.id.editTextTram);
        editTexttusub = findViewById(R.id.editTextTuSub);
        editTexttaxi = findViewById(R.id.editTextTaxi);
// Thay "R.id.spinner" bằng ID của Spinner của bạn
        spinnerbus = findViewById(R.id.spinnerBus);
        spinnercoach = findViewById(R.id.spinnerCoach);
        spinnernational = findViewById(R.id.spinnerNational);
        spinnerinternational = findViewById(R.id.spinnerInternational);
        spinnertram = findViewById(R.id.spinnerTram);
        spinnertusub = findViewById(R.id.spinnerTuSub);
        spinnertaxi = findViewById(R.id.spinnerTaxi);

        // Tạo các options cho Spinner
        List<String> spinnerbus = new ArrayList<>();
        spinnerbus.add("Km");
        spinnerbus.add("Miles");

        List<String> spinnercoach = new ArrayList<>();
        spinnercoach.add("Km");
        spinnercoach.add("Miles");

        List<String> spinnernational = new ArrayList<>();
        spinnernational.add("Km");
        spinnernational.add("Miles");

        List<String> spinnerinternational = new ArrayList<>();
        spinnerinternational.add("Km");
        spinnerinternational.add("Miles");

        List<String> spinnertram = new ArrayList<>();
        spinnertram.add("Km");
        spinnertram.add("Miles");

        List<String> spinnertusub = new ArrayList<>();
        spinnertusub.add("Km");
        spinnertusub.add("Miles");

        List<String> spinnertaxi = new ArrayList<>();
        spinnertaxi.add("Km");
        spinnertaxi.add("Miles");

        // Tạo ArrayAdapter và thiết lập cho Spinner
        ArrayAdapter<String> BusAdapter = new ArrayAdapter<>(HomeActivity.this, android.R.layout.simple_spinner_item, spinnerbus);
        BusAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerbus.setAdapter(BusAdapter);

        ArrayAdapter<String> CoachAdapter = new ArrayAdapter<>(HomeActivity.this, android.R.layout.simple_spinner_item, spinnercoach);
        CoachAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnercoach.setAdapter(CoachAdapter);
    }
}
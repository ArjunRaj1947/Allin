package com.example.all;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecycleView_Activity extends AppCompatActivity {
    RecyclerView recyclerContact;
    ArrayList<ContactModel> arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        recyclerContact=findViewById(R.id.recycleContact);
        recyclerContact.setLayoutManager(new LinearLayoutManager(this));


        //ContactModel model = new ContactModel(R.drawable.dhoni,"Dhoni","8528965544");

//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Dhoni","8528965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Kohli","8228965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Sachin","9528965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Sahwag","7728965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Gambhir","6528965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Raina","8428965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Rohit","8928965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Surya Kumar","7028965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Bhumrah","7928965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Harbhajan","6928965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Kapil Dev","7128965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Jadu","8528965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Ashwin","9928965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Siraj","9328965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Hardik Pandaya","9028965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Kunal Pandaya","9328965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Shikhar Dhawan","8828965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Rishav Pant","7728965544"));
//        arrContacts.add(new ContactModel(R.drawable.dhoni,"Dinesh Kartik","7328965544"));

        RecyclerContactAdapter adapter=new RecyclerContactAdapter(this,arrContacts);
        recyclerContact.setAdapter(adapter);


    }
}
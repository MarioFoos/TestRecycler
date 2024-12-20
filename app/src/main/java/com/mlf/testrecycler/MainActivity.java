package com.mlf.testrecycler;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    // Recycler
    private RecyclerView recycler;
    private ArrayList<SimpleUser> users;
    private UserRecyclerAdapter recyclerAdapter;
    // TextView Name
    private TextView mainUserText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        mainUserText = findViewById(R.id.mainUserText);
        recycler = findViewById(R.id.mainRecycler);
        recyclerAdapter = new UserRecyclerAdapter(getUsers(), R.layout.layout_user, user -> mainUserText.setText(user.getName()));
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(recyclerAdapter);
    }
    public ArrayList<SimpleUser> getUsers()
    {
        users = new ArrayList<>();
        users.add(new SimpleUser("Juan", "juan@miempresa.com", R.drawable.ic_men));
        users.add(new SimpleUser("Ana", "ana@miempresa.com", R.drawable.ic_women));
        users.add(new SimpleUser("Pedro", "pedro@miempresa.com", R.drawable.ic_men));
        users.add(new SimpleUser("Carolina", "carolina@miempresa.com", R.drawable.ic_women));
        users.add(new SimpleUser("Luis", "luis@miempresa.com", R.drawable.ic_men));
        users.add(new SimpleUser("Jorge", "jorge@miempresa.com", R.drawable.ic_men));
        users.add(new SimpleUser("Patricia", "patricia@miempresa.com", R.drawable.ic_women));
        users.add(new SimpleUser("Julia", "julia@miempresa.com", R.drawable.ic_women));
        return users;
    }
}

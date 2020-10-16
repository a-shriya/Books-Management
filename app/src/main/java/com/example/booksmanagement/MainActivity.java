package com.example.booksmanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.booksmanagement.recyclerView.BookAdapter;
import com.example.booksmanagement.modal.Books;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerView;
    private BookAdapter bookAdapter;
    private List<Books> data;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        initmdataBooks();
        setUpBookAdapter();


    }

    public void bindViews()
    {
        recyclerView = findViewById(R.id.recycler_view_category);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
    }

    public void initmdataBooks()
    {
        data= new ArrayList<>();
        data.add(new Books(R.drawable.harry_potter));
        data.add(new Books(R.drawable.swami_vivekananda));

    }

    private void setUpBookAdapter()
    {
        bookAdapter = new BookAdapter(data);
        recyclerView.setAdapter(bookAdapter);
    }

}
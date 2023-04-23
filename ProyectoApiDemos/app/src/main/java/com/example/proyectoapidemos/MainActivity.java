package com.example.proyectoapidemos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ListView list;
    ArrayList<String> titles = new ArrayList<>();
    ArrayAdapter arrayAdapter;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,titles);
        list = findViewById(R.id.list);
        list.setAdapter(arrayAdapter);
        getPost();

    }

    private void getPost() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PostServices postServices = retrofit.create(PostServices.class);
        Call<List<Post>> call= postServices.getPost();


     call.enqueue(new Callback<List<Post>>() {
         @Override
         public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
          for(Post post:response.body()){
                titles.add(post.getId() + "-" + post.getTitle());
             }
             arrayAdapter.notifyDataSetChanged();
         }

         @Override
         public void onFailure(Call<List<Post>> call, Throwable t) {

         }
     });

    }
}
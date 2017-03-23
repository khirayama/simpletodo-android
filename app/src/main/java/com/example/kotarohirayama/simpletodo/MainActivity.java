package com.example.kotarohirayama.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.kotarohirayama.simpletodo.adapters.TaskAdapter;
import com.example.kotarohirayama.simpletodo.data.Task;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.kotarohirayama.simpletodo.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Task> taskList = new ArrayList<Task>();
        for (int i = 0; i < 100; i++) {
            taskList.add(new Task("hoge"));
        }

        ListView listView = (ListView) findViewById(R.id.task_list);
        TaskAdapter taskAdapter = new TaskAdapter(this);
        taskAdapter.setTaskList(taskList);

        listView.setAdapter(taskAdapter);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.edit_message);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_MESSAGE, "ok");
        startActivity(intent);
    }
}

package com.example.kotarohirayama.simpletodo.adapters;

import android.content.Context;
import android.support.constraint.solver.ArrayLinkedVariables;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.kotarohirayama.simpletodo.R;
import com.example.kotarohirayama.simpletodo.data.Task;

import java.util.ArrayList;

/**
 * Created by kotaro.hirayama on 2017/03/22.
 */

public class TaskAdapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater = null;
    ArrayList<Task> taskList;

    public TaskAdapter(Context context) {
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setTaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

    @Override
    public int getCount() {
       return taskList.size();
    }

    @Override
    public Object getItem(int position) {
        return taskList.get(position);
    }

    @Override
    public long getItemId(int position) {
       return taskList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.task_list_item, parent, false);

        ((TextView)convertView.findViewById(R.id.content)).setText(taskList.get(position).getContent());

        return convertView;
    }

    public void handleClick() {

    }
}

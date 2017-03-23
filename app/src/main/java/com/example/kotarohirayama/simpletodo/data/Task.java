package com.example.kotarohirayama.simpletodo.data;

/**
 * Created by kotaro.hirayama on 2017/03/22.
 */

public class Task {
    long id;
    private String content;
    private boolean completed;

    public Task(String initialContent) {
        content = initialContent;
        completed = false;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setContent(String content) {
       this.content = content;
    }

    public void setContent(boolean completed) {
        this.completed = completed;
    }
}

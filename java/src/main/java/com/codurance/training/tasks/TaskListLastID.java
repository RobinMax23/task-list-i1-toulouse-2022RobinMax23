package com.codurance.training.tasks;

public final class TaskListLastID {

    public long lastId = 0;

    public long nextId() {
        return ++lastId;
    }
}
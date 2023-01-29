package com.codurance.training.tasks;

public final class Task {
    public final TaskId id;
    public final TaskDescription description;
    public final TaskDone done;

    public Task(TaskId id, TaskDescription description, TaskDone done) {
        this.id = id;
        this.description = description;
        this.done = done;
    }

}
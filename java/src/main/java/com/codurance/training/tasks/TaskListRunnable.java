package com.codurance.training.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public final class TaskListRunnable implements Runnable {
    private TaskList taskList;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        TaskWriterAndReader TaskWriterAndReader = new TaskWriterAndReader(in, out);
        new TaskListRunnable(new TaskList(TaskWriterAndReader)).run();
    }

    public TaskListRunnable(TaskList taskList) {
        TaskWriterAndReader TaskWriterAndReader = taskList.TaskWriterAndReader;
        this.taskList = new TaskList(new TaskWriterAndReader(TaskWriterAndReader.in, TaskWriterAndReader.out));
    }

    public void run() {
        TaskWriterAndReader TaskWriterAndReader = taskList.TaskWriterAndReader;
        BufferedReader in = TaskWriterAndReader.in;
        PrintWriter out = TaskWriterAndReader.out;

        while (true) {
            out.print("> ");
            out.flush();
            String command;
            try {
                command = in.readLine();
            } catch (IOException exception) {
                throw new RuntimeException(exception);
            }
            if (command.equals("quit")) {
                break;
            }
            taskList.execute(command);
        }
    }
}
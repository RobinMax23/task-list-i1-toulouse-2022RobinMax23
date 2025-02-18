package com.codurance.training.tasks;

import java.io.BufferedReader;
import java.io.PrintWriter;

public final class TaskWriterAndReader {
    public final BufferedReader in;
    public final PrintWriter out;

    public TaskWriterAndReader(BufferedReader reader, PrintWriter writer) {
        this.in = reader;
        this.out = writer;
    }

    public void help() {
        out.println("Commands:\n  show\n  add project <project name>\n  add task <project name> <task description>\n  check <task ID>\n  uncheck <task ID>\n");
    }

    public void error(String command) {
        out.printf("I don't know what the command \"%s\" is.", command);
        out.println();
    }
}
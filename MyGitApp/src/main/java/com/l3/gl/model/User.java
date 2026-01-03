package com.l3.gl.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class User{
    private List<Product> tasks = new ArrayList<>();
    private final String FILE = "tasks.txt";

    public User() {
        load();
    }

    public void addTask(Product task) {
        tasks.add(task);
        save();
    }

    public void removeTask(Product task) {
        tasks.remove(task);
        save();
    }

    public List<Product> getTasks() {
        return tasks;
    }

    private void save() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE))) {
            for (Product t : tasks) {
                pw.println(t.toFileString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void load() {
        File f = new File(FILE);
        if (!f.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                tasks.add(Product.fromFileString(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
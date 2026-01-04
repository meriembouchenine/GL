package com.l3.gl.Controller;

import com.l3.gl.model.Product;
import com.l3.gl.model.User;
import com.l3.gl.view.Ui;
import com.l3.gl.view.task;

import java.util.List;

public class Controller {

    private User user;

    public Controller() {
        user = new User();
        new Ui(this);
    }
    
    

    public void showTaskUI() {
        new task(this);
    }

    public void addTask(Product p) {
        user.addTask(p);
    }

    public void removeTask(Product p) {
        user.removeTask(p);
    }

    public List<Product> getTasks() {
        return user.getTasks();
    }

    public static void main(String[] args) {
        new Controller();
    }
}
package com.example.examen;

import com.example.examen.observer.Observable;
import com.example.examen.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Service implements Observable {
    private List<Observer> observers = new ArrayList<>();

    //("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres")

    @Override
    public void addObserver(Observer e) {
        observers.add(e);
    }

    @Override
    public void removeObserver(Observer e) {
        observers.remove(e);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(x->x.update());
    }
}

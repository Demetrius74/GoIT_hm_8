package org.example;

public abstract class Shape {

    // Туй ми виводимо назву дочірньї фігури.
    // Не впевнений що так правильно, але це зручно, оскільки функціонал простий.
    public String getName() {
        return this.getClass().getSimpleName();
    }
}

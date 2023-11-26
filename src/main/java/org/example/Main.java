package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    private static final Random random = new Random();

    public static void main(String[] args) {

        List<Shape> shapes = Arrays.asList(new Circle(),
                new Dodecahedron(),
                new Octahedron(),
                new Parallelepiped(),
                new Tetrahedron()
        );

        // Тут рандомну фігуру вибираємо
        Shape randomShape = shapes.get(random.nextInt(shapes.size()));

        new PrintShape().printShapeName(randomShape);
    }
}
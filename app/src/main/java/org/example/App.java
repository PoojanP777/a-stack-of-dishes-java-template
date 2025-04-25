package org.example;

public class App {
    public static void main(String[] args) {
        DishStack stack = new DishStack();

        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");

        System.out.println("Initial stack size: " + stack.size());

        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);
        stack.push(blueDish);

        System.out.println("Size after pushes: " + stack.size());

        Dish peekedDish = stack.peek();
        if (peekedDish != null) {
            System.out.println("Peeked dish: " + peekedDish.getDescription());
        }

        Dish poppedDish = stack.pop();
        if (poppedDish != null) {
            System.out.println("Popped dish: " + poppedDish.getDescription());
        }

        Dish anotherPoppedDish = stack.pop();
        if (anotherPoppedDish != null) {
            System.out.println("Another popped dish: " + anotherPoppedDish.getDescription());
        }

        System.out.println("Final size: " + stack.size());
    }

    // Required for the appHasAGreeting test in the template
    public String getGreeting() {
        return "Hello Stack!";
    }
}

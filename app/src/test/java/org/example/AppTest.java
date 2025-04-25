package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    // Fix for the original test filter
    @Test
    public void appHasAGreeting() {
        App app = new App();
        assertNotNull(app.getGreeting());
    }

    @Test
    public void testPushAndSize() {
        DishStack stack = new DishStack();
        assertEquals(0, stack.size());

        stack.push(new Dish("Plate 1"));
        stack.push(new Dish("Plate 2"));

        assertEquals(2, stack.size());
    }

    @Test
    public void testPop() {
        DishStack stack = new DishStack();
        Dish dish1 = new Dish("Plate 1");
        Dish dish2 = new Dish("Plate 2");
        stack.push(dish1);
        stack.push(dish2);

        Dish popped = stack.pop();
        assertEquals("Plate 2", popped.getDescription());
        assertEquals(1, stack.size());
    }

    @Test
    public void testPeek() {
        DishStack stack = new DishStack();
        Dish dish = new Dish("Peekable Plate");
        stack.push(dish);

        Dish peeked = stack.peek();
        assertEquals("Peekable Plate", peeked.getDescription());
        assertEquals(1, stack.size());
    }

    @Test
    public void testPopEmpty() {
        DishStack stack = new DishStack();
        assertNull(stack.pop());
    }

    @Test
    public void testPeekEmpty() {
        DishStack stack = new DishStack();
        assertNull(stack.peek());
    }

    @Test
    public void testClear() {
        DishStack stack = new DishStack();
        stack.push(new Dish("A"));
        stack.push(new Dish("B"));
        stack.clear();
        assertEquals(0, stack.size());
    }
}

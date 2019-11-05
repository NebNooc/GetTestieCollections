package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {

    ArrayList<Person> al;
    Person horseman, red, wolf;

    @Before
    public void stuff() {
        al = new ArrayList<>();
        horseman = new Person("Headless", 1888);
        red = new Person("Red Hood", 1884);
        wolf = new Person("Bad Wolf", 1869);

        al.add(horseman);
        al.add(red);
        al.add(wolf);
    }

    @Test
    public void testRemove() {
        al.remove(wolf);

        Integer actual = al.size();
        Integer expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSize() {
        Integer actual = al.size();
        Integer expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContains() {
        Boolean test = al.contains(wolf);

        Assert.assertTrue(test);
    }

    @Test
    public void testClear() {
        al.clear();

        Integer actual = al.size();
        Integer expected = 0;

        Assert.assertEquals(expected, actual);
    }
}

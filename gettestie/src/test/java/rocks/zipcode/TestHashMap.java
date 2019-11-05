package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class TestHashMap {

    private HashMap<Person, Address> hm;
    private Person horseman, red, wolf;
    private Address home, grandmas, woods;

    @Before
    public void stuff() {
        hm = new HashMap<>();
        horseman = new Person("Headless", 1888);
        red = new Person("Red Hood", 1884);
        wolf = new Person("Bad Wolf", 1869);

        home = new Address("Sleepy Hollow Way", "Sleepy Hollow", "12345", "Grimm");
        grandmas = new Address("Rickety Cabin Road", "Middle O' Nowhere", "98765", "Grimm");
        woods = new Address("Through da Woods", "Middle O' Nowhere", "98765", "Grimm");

        hm.put(horseman, home);
        hm.put(red, grandmas);
        hm.put(wolf, woods);
    }

    @Test
    public void testRemove() {
        hm.remove(wolf);

        Integer actual = hm.size();
        Integer expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSize() {
        Integer actual = hm.size();
        Integer expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContains() {
        Boolean test = hm.containsKey(wolf);

        Assert.assertTrue(test);
    }

    @Test
    public void testClear() {
        hm.clear();

        Integer actual = hm.size();
        Integer expected = 0;

        Assert.assertEquals(expected, actual);
    }
}

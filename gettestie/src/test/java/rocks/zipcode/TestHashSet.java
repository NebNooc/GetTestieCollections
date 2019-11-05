package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestHashSet {
    private HashSet<Person> hs;
    private Person horseman, red, wolf;

    @Before
    public void getStuff() {
        hs = new HashSet<>();
        horseman = new Person("Headless", 1888);
        red = new Person("Red Hood", 1884);
        wolf = new Person("Bad Wolf", 1869);

        hs.add(horseman);
        hs.add(red);
        hs.add(wolf);
    }

    @Test
    public void testRemove() {
        hs.remove(red);

        Integer actual = hs.size();
        Integer expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSize() {
        Integer actual = hs.size();
        Integer expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContains() {
        Boolean test = hs.contains(horseman);

        Assert.assertTrue(test);
    }

    @Test
    public void testClear() {
        hs.clear();

        Integer actual = hs.size();
        Integer expected = 0;

        Assert.assertEquals(expected, actual);
    }
}

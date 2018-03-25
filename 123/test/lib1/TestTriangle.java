package lib1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangle {

    @Test
    public void testTriangle() {
        assertEquals("this is not triganle!",new Triangle().triganles(1,2,3));
        assertEquals("this is a equilateral triganle!",new Triangle().triganles(1,1,1));
        assertEquals("this is a isosceles triganle!",new Triangle().triganles(2,2,3));
        assertEquals("this is a scalene triganle!",new Triangle().triganles(2,3,4));
    }

}

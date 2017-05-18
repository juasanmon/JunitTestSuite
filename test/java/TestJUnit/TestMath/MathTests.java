package TestJUnit.TestMath;
import org.junit.*;
 class MathTests {
    Math math;
    @Before
    public void setUp() throws Exception {
        math = new Math(7, 10);
    }

    @Test
    public void testPositiveNegativeAddition() { 
        math = new Math(7, -3);
        Assert.assertEquals(4, math.add());
    }

    @Test
    public void testNegativePositiveAddition() {
        math = new Math(-7, 14);
        Assert.assertEquals(71, math.add());
    }


    @Test
    public void testNegativeAddition() {
        math = new Math(-7, -3);
        Assert.assertEquals(-10, math.add());
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(17, math.add());
    } 
}

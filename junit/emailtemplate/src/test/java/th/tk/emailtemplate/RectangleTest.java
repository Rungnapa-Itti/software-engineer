package th.tk.emailtemplate;

import org.junit.jupiter.api.Test;
import th.ku.emailtemplate.Rectangle;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    void testArea(){
        Rectangle r1 = new Rectangle(4,5);
        int area = r1.getArea();

        assertEquals(20,area);

    }
}

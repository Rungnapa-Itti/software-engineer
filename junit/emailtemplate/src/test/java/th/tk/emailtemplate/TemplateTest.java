package th.tk.emailtemplate;

import org.junit.jupiter.api.Test;
import th.ku.emailtemplate.MissingValueException;
import th.ku.emailtemplate.Template;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TemplateTest {

    @Test
    void testEvaluateOneVariable(){
        //setup
        Template template = new Template("Hello, ${name}");
        template.set("name","Rungnapa");
        //test
        String emailBody = template.evaluate();
        assertEquals("Hello, Rungnapa" , emailBody);
    }
    @Test
    void testEvaluateDifferentVariable(){
        //setup
        Template template = new Template("Hello, ${name}");
        template.set("name","Tong");
        //test
        String emailBody = template.evaluate();
        assertEquals("Hello, Tong" , emailBody);
    }

    @Test
    void testEvalueMultipleVariables(){
        Template template = new Template("${greeting}, ${name}");
        template.set("greeting","Sawaddee");
        template.set("name","Rungnapa");

        String emailBody = template.evaluate();
        assertEquals("Sawaddee, Rungnapa",emailBody);
    }
    @Test
    public void testEvaluateMissingValueRaisesException() {
        Throwable exception = assertThrows(MissingValueException.class,
                () -> { new Template("${foo}").evaluate(); });
        assertEquals("No value for ${foo}",
                exception.getMessage());
    }
}


import static org.junit.Assert.*;

import java.net.URI;

import org.junit.*;
public class DocSearchTest {
    @Test 
	public void testReverseInPlaceBug() {
        Handler handler = new Handler("/docsearch");
        assertEquals("Don't know how to handle that path!", handler.handleRequest(new URI("/docsearch")));
	}
}

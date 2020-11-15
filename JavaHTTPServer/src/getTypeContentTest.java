

import static org.junit.Assert.*;

import java.net.Socket;

import org.junit.Test;

public class getTypeContentTest {

	@Test
	public void test() {
		Socket sc=null;
		JavaHTTPServer mys=new JavaHTTPServer(sc);
		String htmlFile="myhtml.html";
		String result=mys.getContentType(htmlFile);
		assertEquals("text/html",result);

	}
	@Test
	public void test2() {
		Socket sc=null;
		JavaHTTPServer mys=new JavaHTTPServer(sc);
		String htmlFile="myhtml.css";
		String result=mys.getContentType(htmlFile);
		assertEquals("text/css",result);

	}

}

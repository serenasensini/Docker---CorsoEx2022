package it.theredcode.example.REST_API;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


// STEP 1b - definire la servlet; in questo caso, questa restituisce un oggetto JSON
@WebServlet(name = "helloJsonServlet", value = "/hello-json-servlet")
public class JSONServlet extends HttpServlet{

    private String message;

    public void init() {
        message = "{\"message\": \"hello JSON!\"}";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");

        // Hello
        PrintWriter out = response.getWriter();
        response.setCharacterEncoding("UTF-8");
        out.print(message);
    }

    public void destroy() {
    }

}

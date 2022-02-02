package com.codecool.hackernews;

import  javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "news", urlPatterns = "/news", loadOnStartup = 2)
public class News extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        out.println(
                "<html>\n" +
                        "<head>" +
                        "  <link rel=\"stylesheet\" type=\"text/css\" href='/static/css/site.css' />" +
                        "</head>\n" +
                        "<body id=body>\n" +
                        "<div class= row>" +
                        "   <div class= column>" +
                        "       <a>Hackson news</a>" +
                        "   </div>" +
                        "   <div class= column>" +
                        "       <a>Top news</a>" +
                        "   </div>" +
                        "   <div class= column>" +
                        "       <a>Newest</a>" +
                        "   </div>" +
                        "   <div class= column>" +
                        "       <a>Jobs</a>" +
                        "   </div>" +
                        "</div>" +
                        "</body></html>"
        );
    }
}


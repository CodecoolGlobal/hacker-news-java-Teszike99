package com.codecool.hackernews;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "hackerNewsServlet", urlPatterns = {"/"}, loadOnStartup = 1)
public class HackerNewServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        out.println(
                "<html>\n" +
                        "<head>" +
                        "  <link rel=\"stylesheet\" type=\"text/css\" href='/static/css/site.css' />" +
                        "    <script src='/static/js/main.js' defer></script>" +
                        "</head>\n" +
                        "<body id=body>\n" +
                        "<div clas= mainDiv>" +
                        "<div class= row id= mainDiv> " +
                        "   <div class= column>" +
                        "       <a href= /api/top?page=1 >Hackson news</a>" +
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

                        "<div class= tableContainer>" +
                        "<table class= table id= table>" +
                        "</table>" +
                        "</div>" +
                        "</div>" +

                        "</body></html>"
        );
    }
}

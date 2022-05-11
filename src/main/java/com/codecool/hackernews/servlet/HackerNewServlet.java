package com.codecool.hackernews.servlet;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@WebServlet(name = "hackerNewsServlet", urlPatterns = {"/"}, loadOnStartup = 1)
public class HackerNewServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String title = "Michael Hackson news";

        out.println(
                "<html>\n" +
                        "<head>" +
                        "  <title>" + title + "</title>" +
                        "  <link rel=\"stylesheet\" type=\"text/css\" href='/static/css/site.css' />" +
                        "<script type=\"text/JavaScript\" src='/static/js/main.js' defer></script>" +
                        "</head>\n" +
                        "<body>\n" +
                        "<ul class=\"navhead\">"+
                            "<li class=\"navbody\"><a class=\"main\" href=\"#home\">Hackers News</a></li>"+
                            "<li class=\"navbody\"><a class=\"news\">Top news</a></li>"+
                            "<li class=\"navbody\"><a class=\"newest\" >Newest</a></li>"+
                            "<li class=\"navbody\"><a class=\"jobs\" >Jobs</a></li>"+
                        "</ul>"+
                        "<button class=\"prevbutton\">Prev</button>" +
                        "<button class=\"nextbutton\">Next</button>" +
                        "<div class=\"flex-container\">"+
                        "</div>\n"+
                        "<footer> indiana_police@cocaiine.ru</footer>"+
                        "</body></html>"
        );
    }
}

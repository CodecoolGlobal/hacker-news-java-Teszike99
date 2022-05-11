package com.codecool.hackernews.servlet;

import com.codecool.hackernews.model.News;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
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

@WebServlet(name = "NewestServlet", urlPatterns = "/newest", loadOnStartup = 5)
public class NewestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String str = request.getParameter("page");
        System.out.println(str);

        PrintWriter out = response.getWriter();

        try {
            String url = "https://api.hnpwa.com/v0/newest/"+ str + ".json";
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            int responseCode = con.getResponseCode();
            System.out.println("\nSending 'GET' request to URL : " + url);
            System.out.println("Response Code : " + responseCode);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response2 = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response2.append(inputLine);
            }
            in.close();
            System.out.println(response2);
            Gson gson = new Gson();
            Type merchantListType = new TypeToken<List<News>>() {}.getType();
            List<News> listNews = gson.fromJson(String.valueOf(response2), merchantListType);
            String json = gson.toJson(listNews);
            out.println(json);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

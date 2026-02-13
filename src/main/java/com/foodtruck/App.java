package com.foodtruck;

import static spark.Spark.*;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        port(4567);

        Menu menu = new Menu();

        get("/", (req, res) -> {

            res.type("text/html");

            String html = "<html><body>";
            html += "<h2>Welcome to the Food Truck!</h2>";
            html += "<ul>";

            for (Map.Entry<String, MenuItem> entry : menu.getAllItems().entrySet()) {
                MenuItem item = entry.getValue();
                html += "<li>" + item.getName() + " - $" + item.getPrice() + "</li>";
            }

            html += "</ul>";
            html += "</body></html>";

            return html;
        });

        System.out.println("Server started at http://localhost:4567");
    }
}

package Protocols;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/timeaction")
public class TimeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String mSec = request.getParameter("time");
        float delta = ((float)(System.currentTimeMillis()-Long.parseLong(mSec)))/1000;
        request.setAttribute("result", delta);
        request.getRequestDispatcher("/jsp/main.jsp").forward(request, response);
    }
}
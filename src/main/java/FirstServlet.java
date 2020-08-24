import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String user = (String) session.getAttribute("current_user");
        if (user == null) {
            // response для анонимного пользователя
            // авторизация
            // регистрация
            // session.setAttribute("current_user", ID);
        }else {
            // response для авторизованного пользователя
        }

//        Integer count = (Integer) session.getAttribute("count");
//        Cart cart = (Cart) session.getAttribute("cart");
//
//        String name = req.getParameter("name");
//        int quantity = Integer.parseInt(req.getParameter("quantity"));
//
//        if (cart == null) {
//            cart = new Cart();
//
//            cart.setName(name);
//            cart.setQuantity(quantity);
//        }

//        session.setAttribute("cart", cart);
//        getServletContext().getRequestDispatcher("/showCart.jsp").forward(req, resp);
//        if (count == null) {
//            session.setAttribute("count", 1);
//            count = 1;
//        } else {
//            session.setAttribute("count", count + 1);
//        }

//        PrintWriter pw = resp.getWriter();
//        String name = req.getParameter("name");
//        String surName = req.getParameter("surName");

//        pw.println("<html>");
//        pw.println("<head>");
//        pw.println("<title> First Servlet </title>");
//        pw.println("</head>");

//        pw.println("<h1> Your count is " + count + " </h1>");
//        pw.println("<h1> Hello, " + name + " " + surName + " </h1>");
//        pw.println("</html>");

//        resp.sendRedirect("/testJsp.jsp");
//        resp.sendRedirect("https://www.google.com");

//        RequestDispatcher dispatcher = req.getRequestDispatcher("https://www.google.com");
//        dispatcher.forward(req, resp);
//        RequestDispatcher dispatcher1 = req.getRequestDispatcher("/testJsp.jsp");
//        dispatcher1.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}

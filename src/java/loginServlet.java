/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Login;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author patels
 */
public class loginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Session se = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tr = se.beginTransaction();

            Criteria cr = se.createCriteria(Login.class);
            cr.add(Restrictions.eq("username", request.getParameter("username")));
            cr.add(Restrictions.eq("password", request.getParameter("password")));
            ArrayList<Login> al = (ArrayList<Login>) cr.list();

            if (al.size() > 0) {
                
                HttpSession hs = request.getSession();
                Login l = al.get(0);
                hs.setAttribute("loginid", l);
                
               
                if(l.getRole().equals("PropertyHolder"))
                {
                out.println(l.getRole());
                RequestDispatcher rd = request.getRequestDispatcher("Propertyholder.jsp");
                rd.forward(request, response);
                
                }
                
               else if(l.getRole().equals("Client"))
                {
                out.println(l.getRole());
                RequestDispatcher rd = request.getRequestDispatcher("Client.jsp");
                rd.forward(request, response);
                }
                
               else if(l.getRole().equals("admin"))
               {
                   out.println(l.getRole());
                   RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
                   rd.forward(request, response);
               }
                //out.println(l.getRole());
                                
                //out.println("sucess");
                
                
            } else {
                out.println("invalide username and password");
            }

            tr.commit();
        } catch (Exception e) {
            out.println(e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

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
import model.Login;
import model.Registration;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author patels
 */
public class viewpropertyholderprofileserv extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            Session se = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tr = se.beginTransaction();
            int i = 0;
            ArrayList<Registration> alr = new ArrayList<>();
            Criteria cr = se.createCriteria(Login.class);
            cr.add(Restrictions.eq("role", "PropertyHolder"));
            ArrayList<Login> al = (ArrayList<Login>) cr.list();
            for (i = 0; i < al.size(); i++) {
                Login l = al.get(i);
                int lid = l.getLid();
                //out.println(lid);

                Criteria cr1 = se.createCriteria(Registration.class);
                cr1.add(Restrictions.eq("lid", l));
                ArrayList<Registration> al1 = (ArrayList<Registration>) cr1.list();
                Registration r = al1.get(0);

                alr.add(r);
            }
            request.setAttribute("alr", alr);

            RequestDispatcher rd = request.getRequestDispatcher("viewpropertyholderprofile.jsp");
            rd.forward(request, response);
        } catch (HibernateException | ServletException | IOException e) {
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

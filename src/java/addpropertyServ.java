/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Addproperty;
import model.Login;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author patels
 */
public class addpropertyServ extends HttpServlet {

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
            
            HttpSession hs = request.getSession();
            Login l = (Login) hs.getAttribute("loginid");
            
             Addproperty a = new Addproperty();
            a.setLid(l);
            a.setPropertytype(request.getParameter("type"));
            a.setPropertyname(request.getParameter("name"));
            a.setWantto(request.getParameter("selltype"));
            a.setSelectcity(request.getParameter("cityname"));
            a.setAddress(request.getParameter("address"));
            a.setSaleprice(request.getParameter("saleprice"));
            a.setRate(request.getParameter("Rate"));
            a.setPhoto(request.getParameter("photo"));
            a.setDescription(request.getParameter("description"));
            a.setName(request.getParameter("yourname"));
            a.setEmailid(request.getParameter("email"));
            a.setContact(request.getParameter("mobilenumber"));
            a.setStatus("Pending");
            se.save(a);
            
            
            tr.commit();
            RequestDispatcher rd = request.getRequestDispatcher("addproperty.jsp");
            rd.forward(request, response);
            out.println("Success");
           
        } 
        catch (Exception e) 
        {
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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo() 
        {
        return "Short description";
        }// </editor-fold>
    
}

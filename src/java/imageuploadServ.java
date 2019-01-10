/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Addproperty;
import model.Login;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Drashti
 */
public class imageuploadServ extends HttpServlet {

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
        HttpSession hs = request.getSession();
        ArrayList<String> al = new ArrayList<>();
        PrintWriter out = response.getWriter();
        try  {
            
            out.println("servlet called");
            String type = "";
            String name = "";
            String selltype = "";
            String cityname = "";
            String address = "";
            String saleprice = "";
            String Rate = "";
            String photo = "1";
            String description = "";
            String yourname = "";
            String email = "";
            String mobilenumber = "";
            // creates FileItem instances which keep their content in a temporary file on disk
            FileItemFactory factory = new DiskFileItemFactory();
            // Create a new file upload handler
            ServletFileUpload upload = new ServletFileUpload(factory);

            //get the list of all fields from request
            List<FileItem> fields = upload.parseRequest(request);
            // iterates the object of list
            Iterator<FileItem> it = fields.iterator();
            //getting objects one by one
            while (it.hasNext()) {
                //assigning coming object if list to object of FileItem
                FileItem fileItem = it.next();
                //check whether field is form field or not
                boolean isFormField = fileItem.isFormField();

                if (isFormField) {
                    //get the filed name 
                    String fieldName = fileItem.getFieldName();
                    if (fieldName.equals("type")) {
                        //getting value of field
                        type = fileItem.getString();
                    } else if (fieldName.equals("name")) {
                        //getting value of field
                        name = fileItem.getString();
                    } else if (fieldName.equals("selltype")) {
                        //getting value of field
                        selltype = fileItem.getString();
                    } else if (fieldName.equals("cityname")) {
                        //getting value of field
                        cityname = fileItem.getString();
                    } else if (fieldName.equals("address")) {
                        //getting value of field
                        address = fileItem.getString();
                    } else if (fieldName.equals("saleprice")) {
                        //getting value of field
                        saleprice = fileItem.getString();
                    } else if (fieldName.equals("Rate")) {
                        //getting value of field
                        Rate = fileItem.getString();
                    } else if (fieldName.equals("description")) {
                        //getting value of field
                        description = fileItem.getString();
                    } else if (fieldName.equals("yourname")) {
                        //getting value of field
                        yourname = fileItem.getString();
                    } else if (fieldName.equals("email")) {
                        //getting value of field
                        email = fileItem.getString();
                    } else if (fieldName.equals("mobilenumber")) {
                        //getting value of field
                        mobilenumber = fileItem.getString();
                    }
                } else {
                    //getting name of file
                    photo = new File(fileItem.getName()).getName();
                    //get the extension of file by diving name into substring
                    String extension = photo.substring(photo.indexOf(".") + 1, photo.length());;
                    //rename file...concate name and extension
                    photo = name + "." + extension;
                    //add multiple images into arraylist
                    al.add(photo);
                    try {
                        String filePath = "C:\\Users\\patels\\Documents\\NetBeansProjects\\leasemanagementsyastem\\web\\images\\";
                        fileItem.write(new File(filePath + photo));
                    } catch (Exception ex) {
                        out.println(ex.toString());
                    }

                }

            }

//             hs.setAttribute("photo", photo);
            Session se = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tr = se.beginTransaction();
            //create for loop for add multiple images in database

            HttpSession hs1 =request.getSession();
            Login l= (Login) hs1.getAttribute("loginid");
            
            Addproperty im = new Addproperty();
            im.setLid(l);
            im.setPropertytype(type);
            im.setPropertyname(name);
            im.setWantto(selltype);
            im.setSelectcity(cityname);
            im.setAddress(address);
            im.setSaleprice(saleprice);
            im.setRate(Rate);
            im.setPhoto(photo);
            im.setDescription(description);
            im.setName(yourname);
            im.setEmailid(email);
            im.setContact(mobilenumber);
            im.setStatus("Pending");
            se.save(im);

            tr.commit();
//             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=TestDB","sa","drashti123");
//            PreparedStatement ps;
//            //RequstDispatcher rd = null;
////            HttpSession sess=request.getSession();
//       
////        String uid=(String)sess.getAttribute("uid");
////            String name=request.getParameter("name");
//            ps = con.prepareStatement("insert into Image_data values(?,?)");
//            ps.setString(1,pname);
//            ps.setString(2,photo);
//             ps.executeUpdate();
            //out.println("success");
            RequestDispatcher rd = request.getRequestDispatcher("addproperty.jsp");
            rd.forward(request, response);
//            response.sendRedirect("viewserv");

        } catch (FileUploadException | HibernateException e) {
            out.println(e.getMessage());
        } finally {
            out.close();
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlet;

import com.ufg.impl.DAOClientsImpl;
import com.ufg.models.ClientsModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/")
public class client extends HttpServlet {

    private DAOClientsImpl clientDAO;

    public client() {
        this.clientDAO = new DAOClientsImpl();
    }
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String action = request.getServletPath();
     
     switch (action) {
         case "/new":
             break;
         case "/add":
             break;
         case "/update":
             break;
         case "/delete":
             break;
         default:
         {
             try {
                 listClients(request, response);
             } catch (Exception ex) {
                 Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
             break;

        }
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
        this.doGet(request, response);
    }

    private void listClients(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException, Exception {
        List<ClientsModel> listClient = clientDAO.getClients();
        request.setAttribute("listClient", listClient);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
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

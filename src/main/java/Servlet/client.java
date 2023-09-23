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
        try {
            String action = request.getServletPath();
            
            switch (action) {
                case "/new":
                    showNewForm(request, response);
                    break;
                case "/add":
                    insertClient(request, response);
                    break;
                case "/edit":
                    showEditForm(request, response);
                    break;
                case "/update":
                    updateClient(request, response);
                    break;
                case "/delete":
                    deleteClient(request, response);
                    break;
                    
                default:   
                    listClients(request, response);
                    break;
            }
        } catch (Exception ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }


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
    
    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("UserForm.jsp");
		dispatcher.forward(request, response);
	}
    
    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		ClientsModel existingClient = clientDAO.selectByID(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("UserForm.jsp");
		request.setAttribute("client", existingClient);
		dispatcher.forward(request, response);
	}
    
    private void insertClient(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		ClientsModel newUser = new ClientsModel();
        try {
            clientDAO.addClient(newUser);
        } catch (Exception ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
		response.sendRedirect("list");
	}

	private void updateClient(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");

		ClientsModel editClient = new ClientsModel();
        try {
            clientDAO.updateClient(editClient);
        } catch (Exception ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
		response.sendRedirect("list");
	}
    
    private void deleteClient(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException, Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		clientDAO.deleteClient(id);
		response.sendRedirect("/");
	}

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

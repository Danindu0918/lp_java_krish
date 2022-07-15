package com.example.pos_servlet.controller;

import com.example.pos_servlet.dao.CustomerDAO;
import com.example.pos_servlet.model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class CustomerServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private CustomerDAO customerDAO = new CustomerDAO();

    public CustomerServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.getWriter().append("Served at :").append(request.getContextPath());

        RequestDispatcher dispatcher = request.getRequestDispatcher("/resource/views/customerRegister.html");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");

        Customer customer = new Customer();
        customer.setFirst_name(firstName);
        customer.setLast_name(lastName);
        customer.setAddress(address);
        customer.setContact(contact);

        try {
            customerDAO.registerCustomer(customer);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/resource/views/customerDetails.html");
        dispatcher.forward(request, response);
    }
}

package com.example.banking;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/account")
public class BankingServlet extends HttpServlet {
    private final BankingService bankingService = new BankingService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        Account account = bankingService.getDemoAccount();
        response.setContentType("text/plain;charset=UTF-8");
        response.getWriter().println("Banking WAR Lab");
        response.getWriter().println("Customer: " + account.getOwner());
        response.getWriter().println("Balance: $" + account.getBalance());
    }
}

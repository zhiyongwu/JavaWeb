package cc.zhiyongwu.chapter2.controller;

import cc.zhiyongwu.chapter2.model.Customer;
import cc.zhiyongwu.chapter2.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by wuzhiyong on 16/1/31.
 */
@WebServlet("/customer")
public class CustomerServlet extends HttpServlet{
    private CustomerService customerService;

    @Override
    public void init() throws ServletException {
        customerService = new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customerList = customerService.getCustomerList();
        req.setAttribute("customerList",customerList);
        System.out.println(customerList.size());
        req.getRequestDispatcher("/WEB-INF/view/customer.jsp").forward(req,resp);
    }
}

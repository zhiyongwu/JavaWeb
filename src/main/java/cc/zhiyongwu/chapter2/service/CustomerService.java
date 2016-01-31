package cc.zhiyongwu.chapter2.service;

import cc.zhiyongwu.chapter2.helper.DatabaseHelper;
import cc.zhiyongwu.chapter2.model.Customer;
import cc.zhiyongwu.chapter2.util.PropsUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by wuzhiyong on 16/1/31.
 */
public class CustomerService {

    public List<Customer> getCustomerList(){
        String sql = "select * from customer";
        return DatabaseHelper.queryEntityList(Customer.class,sql);
    }

    public Customer getCustomer(long id){
        return DatabaseHelper.queryEntity(Customer.class,"select * from customer where id = " + id);
    }

    public boolean createCustomer(Map<String,Object> fieldMap){
        return DatabaseHelper.insertEntity(Customer.class,fieldMap);
    }

    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        return DatabaseHelper.updateEntity(Customer.class,id,fieldMap);
    }

    public boolean deleteCustomer(long id){
        return DatabaseHelper.deleteEntity(Customer.class,id);
    }
}

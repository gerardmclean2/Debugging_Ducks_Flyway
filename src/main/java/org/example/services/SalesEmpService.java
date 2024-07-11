package org.example.services;

import org.example.daos.SalesEmpDao;
import org.example.exceptions.Entity;
import org.example.exceptions.FailedToCreateException;
import org.example.models.DeliveryEmployeeResponse;
import org.example.models.SalesEmpRequest;
import org.example.models.SalesEmployeeResponse;

import java.sql.SQLException;
import java.util.List;

public class SalesEmpService {
    private final SalesEmpDao salesEmpDao;

    public SalesEmpService(final SalesEmpDao dao) {
        this.salesEmpDao = dao;
    }

    public int createSalesEmployee(final SalesEmpRequest salesEmpRequest)
            throws SQLException, FailedToCreateException {
        int id = salesEmpDao.createSalesEmployee(salesEmpRequest);
        if (id == -1) {
            throw new FailedToCreateException(Entity.SALES_EMPLOYEE);
        }
        return id;
    }

    public List<SalesEmployeeResponse> getAllSalesEmployees() throws SQLException {
        return salesEmpDao.getAllSalesEmployees();
    }
}

package org.example.controllers;

import io.swagger.annotations.Api;
import org.example.exceptions.FailedToCreateException;
import org.example.models.SalesEmpRequest;
import org.example.services.SalesEmpService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Api("Engineering Academy - Group Challenge 2 - Team 3 - Sales Employee API")
@Path("/api/sales-employee")
public class SalesEmpController {

    /**
     * The SalesEmployee service.
     */
    private final SalesEmpService salesEmpService;

    /**
     * Constructor for SalesEmployeeController.
     * Takes an instance of SalesEmpService as a parameter.
     * @param salesEmpServ
     */
    public SalesEmpController(final SalesEmpService salesEmpServ) {
        this.salesEmpService = salesEmpServ;
    }

    /**
     * POST request endpoint to create a new SalesEmployee.
     * @param salesEmpRequest
     * @return a response with CREATED status if successful.
     * Server error otherwise.
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createSalesEmployee(final SalesEmpRequest salesEmpRequest) {
        try {
            return Response
                    .status(Response.Status.CREATED)
                    .entity(
                            salesEmpService.createSalesEmployee(salesEmpRequest)
                    )
                    .build();
        } catch (FailedToCreateException | SQLException e) {
            return Response.serverError().build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSalesEmployees() throws SQLException {
        return Response.ok().entity(salesEmpService.getAllSalesEmployees()).build();
    }
}

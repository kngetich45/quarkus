package org.customer.service.entity;

import org.customer.service.models.Customer;
import org.customer.service.repository.CustomerRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("customers")
@ApplicationScoped
public class CustomerEndPoint {
    @Inject
    CustomerRepository customerRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer findById(@PathParam("id") Integer id){
        Customer entity = customerRepository.findCustomerById(id);
        if (entity == null) {
            throw new WebApplicationException("Fruit with id of " + id + " does not exist.", 404);
        }
        //throw new NotFoundException();
        //return customerRepository.findCustomerById(id);
        return entity;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Customer customer){
        if (customer.id != null) {
            customerRepository.createCustomer(customer);
            return Response.status(201).build();

        }else {
            throw new WebApplicationException("User was invalidly set on request.", 404);
        }

    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(Customer customer){
        if (customer.id != null) {
            throw new WebApplicationException("User was invalidly set on request.", 204);
        }else {
            customerRepository.updateCustomer(customer);
            return Response.status(204).build();

        }

    }

    @DELETE
    public Response delete(@QueryParam("id") Integer customerId){

        Customer entity = customerRepository.findCustomerById(customerId);
        if (entity == null) {
            throw new WebApplicationException("Fruit with id of " + customerId + " does not exist.", 404);
        }
        customerRepository.deleteCustomer(customerId);
        return Response.status(204).build();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.proyectoplantillas.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author David
 */
@Provider
public class ExceptionHandler implements ExceptionMapper<Exception>{

    @Override
    public Response toResponse(Exception ex) {
         ex.printStackTrace();
         ExceptionWrapper wrraper;
        if(ex instanceof BussinessException || ex instanceof ArrayIndexOutOfBoundsException) {
             wrraper = new ExceptionWrapper("400", "BAD_REQUEST", ex.getMessage(),
                    "/estudiantes/obtener");    
            return Response.status(Response.Status.BAD_REQUEST).entity(wrraper).build();
        } else {
              wrraper = new ExceptionWrapper("500", "INTERNAL_SERVER_ERROR", "",
                    "/estudiantes/obtener");    
             return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(wrraper).build();
        } 
    }
}
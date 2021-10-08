/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.proyectoplantillas.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author David
 */
@Path("usuariosFolder")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioController {

    
    /**
    * 
    */
   @Path("obtenerUsuario")
   @GET
   public String obtenerUsuario(){
       return "Primer servicio";
   }
   
   @Path("agregarUsuario")
   @POST
   public String agregarUsuario(){
       return "Primer servicio";
   }
   
   @Path("actualizar")
   @PUT
   public String actualizarUsuario(){
       return "Primer servicio";
   }
   
   @DELETE
   public String eliminarUsuario(){
       return "Primer servicio";
   }
   
}

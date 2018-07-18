/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.14).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Cliente;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Api(value = "cliente", description = "the cliente API")
public interface ClienteApi {

    @ApiOperation(value = "agregar un nuevo cliente", nickname = "agregarCliente", notes = "Agregar un nuevo cliente", tags={ "administradores", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Cliente creado"),
        @ApiResponse(code = 400, message = "objeto invalido"),
        @ApiResponse(code = 409, message = "ya existe un cliente con este id") })
    @RequestMapping(value = "/cliente/{idCliente}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> agregarCliente(@ApiParam(value = "id del tliente a agregar",required=true) @PathVariable("idCliente") String idCliente,@ApiParam(value = "cliente a agregar"  )  @Valid @RequestBody Cliente cliente);


    @ApiOperation(value = "buscar cliente", nickname = "buscarCliente", notes = "Enviando un id de cliente devuelve la informacion correspondiente a este ", response = Cliente.class, tags={ "administradores","accionistas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Devuelver el resultado obtenido", response = Cliente.class),
        @ApiResponse(code = 400, message = "parametro incorrecto") })
    @RequestMapping(value = "/cliente/{idCliente}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Cliente> buscarCliente(@ApiParam(value = "id del cliente a buscar",required=true) @PathVariable("idCliente") String idCliente);


    @ApiOperation(value = "eliminar un cliente", nickname = "eliminarCliente", notes = "Eliminar un cliente", tags={ "administradores", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok"),
        @ApiResponse(code = 400, message = "id de cliente inválido"),
        @ApiResponse(code = 404, message = "id de cliente no encontrado") })
    @RequestMapping(value = "/cliente/{idCliente}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> eliminarCliente(@ApiParam(value = "id del cliente a eliminar",required=true) @PathVariable("idCliente") String idCliente);

}
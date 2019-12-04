package com.employee.Exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.employee.model.ErrorMessage;

@Provider
public class DataNotFoundMapper implements ExceptionMapper<DataNotFound> {

	@Override
	public Response toResponse(DataNotFound exception) {
		ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), 404);
		return Response.status(Status.NOT_FOUND).entity(errorMessage).build();
	}

}

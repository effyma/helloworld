package rest.test;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import model.User;

@Path("test")
public class TestService {
	
	@PersistenceContext(unitName = "test")
	private EntityManager em;
	private String hello;
	
	@GET
	@Path("sayHello")
	@Produces(MediaType.APPLICATION_JSON)
	public User sayHello(@QueryParam("name") String name) {
		if(name == null) name = "default";
		//return em.createNamedQuery("User.findAll", User.class).getResultList();
		//return em.createQuery("SELECT u FROM User u", User.class).getResultList();
		User u = em.find(User.class, 1);
		return u;
		

	}
 

}

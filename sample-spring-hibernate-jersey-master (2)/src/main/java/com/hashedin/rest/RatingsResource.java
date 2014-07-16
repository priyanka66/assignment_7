package com.hashedin.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hashedin.model.Ratings;
import com.hashedin.model.topRatedMovies;
import com.hashedin.service.RatingsService;

@Component
@Path("/ratings")
public class RatingsResource {

	@Autowired
	private RatingsService ratingsService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Ratings> list() {
		// Handles GET on /ratings. Lists all the ratings we have in our system.
		return ratingsService.findAll();
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/{ratingId}")
	public Ratings get(@PathParam("ratingId") Long ratingId) {
		// Handles GET on /ratings/{ratingId}. Returns a single rating for the given
		// ratingId.
		return ratingsService.find(ratingId);
	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response create(Ratings rating,
			@Context final HttpServletResponse response)
			throws URISyntaxException {
		// Handles POST on /ratings. Creates a new rating and adds it into an
		// repository.
		ratingsService.save(rating);
		response.setStatus(Response.Status.CREATED.getStatusCode());
		return Response.created(new URI("/ratings/" + rating.getRatingId())).build();
	}

	@PUT
	@Path("/{ratingId}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Ratings update(Ratings rating, @PathParam("ratingId") Long ratingId) {
		// Handles PUT on /ratings/ratingId. Updates the existing rating with the new
		// values.
		return ratingsService.update(rating, ratingId);
	}

	@DELETE
	@Path("/{ratingId}")
	public Ratings delete(@PathParam("ratingId") Long ratingId) {
		// Handles DELETE on /ratings/ratingId. Deletes the existing rating and
		// returns the same.
		return ratingsService.delete(ratingId);
	}
	 @GET
		@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
		@Path("/getmovies")
		public List<topRatedMovies> getMovies() {
			System.out.println(".........." + ratingsService.getMovies());
			List<topRatedMovies> movies = ratingsService.getMovies();
			List<topRatedMovies> topMovies  = new ArrayList<>();
			for(Object movie: movies)
			{
				topMovies.add((topRatedMovies) movie);
			}
			return topMovies;
		}

}

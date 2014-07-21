package com.hashedin.rest;

import java.io.Console;
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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hashedin.model.Movie;
import com.hashedin.model.movieByYear;
import com.hashedin.service.MovieService;




@Component
@Path("/movies")
public class MovieResource {

	@Autowired
	private MovieService movieService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Movie> list1() {
		// Handles GET on /Movies. Lists all the Movies we have in our
		// system.
		return movieService.findAll();
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/{movieId}")
	public Movie get(@PathParam("movieId") Long movieId) {
		// Handles GET on /Movies/{MovieId}. Returns a single Movie for
		// the given MovieId.
		return movieService.find(movieId);
	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response create(Movie movie,
			@Context final HttpServletResponse response)
			throws URISyntaxException {
		// Handles POST on /Movies. Creates a new Movie and adds it into an
		// repository.
		movieService.save(movie);
		response.setStatus(Response.Status.CREATED.getStatusCode());
		return Response.created(new URI("/movies/" + movie.getMovieId()))
				.build();
	}

	@PUT
	@Path("/{movieId}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Movie update(Movie movie,
			@PathParam("movieId") Long movieId) {
		// Handles PUT on /Movies/MovieId. Updates the existing Movie with
		// the new values.
		return movieService.update(movie, movieId);
	}

	@DELETE
	@Path("/{movieId}")
	public Movie delete(@PathParam("movieId") Long movieId) {
		// Handles DELETE on /Movies/MovieId. Deletes the existing Movie
		// and returns the same.
		return movieService.delete(movieId);
	}
	
	@GET
	@Path("/moviesByYear")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<movieByYear> list(
			@QueryParam("startDate") String startDate,
			@QueryParam("endDate") String endDate)  {
		System.out.println(".........." + movieService.getMovieByYear(startDate,endDate));
		List<movieByYear> movies = movieService.getMovieByYear(startDate,endDate);
		System.out.println(movies);
//		List<movieByYear> topMovies  = new ArrayList<>();
//		
//		for(Object movie: movies)
//		{
//			topMovies.add((movieByYear) movie);
//		}
		return movies;
	}
    
//	public List<MoviesByProfession>getMoviesByProfession() {
//		System.out.println(".........." + ratingsService.getMoviesByProfession());
//		List<MoviesByProfession> movies = ratingsService.getMoviesByProfession();
//		List<MoviesByProfession> topMovies  = new ArrayList<>();
//		for(Object movie: movies)
//		{
//			topMovies.add((MoviesByProfession) movie);
//		}
//		return topMovies;
//	}
//	@GET
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	@Path("/{movieId}/tasks")
//	public List<Ratings> getRatings(@PathParam("movieId") Long movieId) {
//
//		return movieService.findRatingsByMovieId(movieId);
//	}
//	@GET
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	@Path("/{movieId}/tasks/?status={status}")
//	public List<Ratings> getRatingsByStatus(@PathParam("movieId") Long movieId,
//			@PathParam("status") String status) {
//
//		return movieService.findRatingsOfMovieByStatus(movieId, status);
//	}
}

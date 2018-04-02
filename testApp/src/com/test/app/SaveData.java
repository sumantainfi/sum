package com.test.app;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;

import com.google.appengine.api.datastore.DatastoreFailureException;
import com.google.appengine.api.datastore.Entity;

public class SaveData {
	
	public void save(Object title,Object author,Object description){
		
		  Entity post = new Entity("BLOG"); // create a new entity
		   
          
		  post.setProperty("title", title);
		  post.setProperty("author", author);
		  post.setProperty("body", description);
		  post.setProperty("timestamp", new Date().getTime());

		  try {
			  GetDataStore.initialize().put(post);
		    // store the entity

		    // Send the user to the confirmation page with personalised confirmation text
		    //String confirmation = "Post with title " + blogContent.get("blogContent_title") + " created.";

		    //req.setAttribute("confirmation", confirmation);
		    //req.getRequestDispatcher("/confirm.jsp").forward(req, resp);
		  } catch (DatastoreFailureException e) {
		    System.err.println(e);
		  }
		}

		
	}

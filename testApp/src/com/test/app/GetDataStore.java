package com.test.app;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;



public class GetDataStore {
	
	public static DatastoreService initialize(){
		
		// setup datastore service
		DatastoreService  datastore = DatastoreServiceFactory.getDatastoreService();
		
		return datastore;
	}
	  
	


}

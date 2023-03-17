package javalinproject;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.*;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javalin app = Javalin.create(config -> {
			config.staticFiles.add(staticFiles -> {
			    staticFiles.hostedPath = "/";                   // change to host files on a subpath, like '/assets'
			    staticFiles.directory = ".";              // the directory where your files are located
			    staticFiles.location = Location.CLASSPATH;      // Location.CLASSPATH (jar) or Location.EXTERNAL (file system)
			  });
        }).start(7070);	    
	}

}

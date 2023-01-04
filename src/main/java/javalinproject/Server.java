package javalinproject;
import io.javalin.Javalin;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Javalin app = Javalin.create(/*config*/)
            .get("/", ctx -> ctx.result("Hello World"))
            .start(7070);	    
	}

}

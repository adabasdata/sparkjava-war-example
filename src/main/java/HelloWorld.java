import spark.servlet.SparkApplication;

import static spark.Spark.g

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> "Hello World");
	}
}

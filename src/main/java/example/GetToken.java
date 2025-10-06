package example;

import java.io.IOException;

/**
 * Class for getting your Grade API token.
 */
public class GetToken {

    /**
     * Run to get your token after you complete the code.
     * @param args unused arguments
     */
    public static void main(String[] args) throws IOException {
        GetExample example = new GetExample();

        String gradeAPISignUpURL = "https://grade-apis.panchen.ca/signUp?username=jadensbigbutt";
        // TODO Task 1: use the run method to get your Grade API token (or obtain your token through a web browser).

=======
        String response = "{\n" +
                "  \"environment_variables\": \"token=x9Cyl1o3teSYu6wGjKW8u7VoC6TeyrA6\",\n" +
                "  \"message\": \"User signed up successfully. Please copy and paste the environment_variables into your intelij java running environment variables.\",\n" +
                "  \"status_code\": 200,\n" +
                "  \"token\": \"x9Cyl1o3teSYu6wGjKW8u7VoC6TeyrA6\"\n" +
                "}";

        // response = example.run( ...)
        System.out.println(response);
    }
}

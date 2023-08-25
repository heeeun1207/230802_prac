@Controller
public class HelloWorldController {

  @GetMapping("/")
  public String helloWorld() {
    return "index";
  }

  @GetMapping("/error")
  public String handleError() {
    return "index";
  }
}

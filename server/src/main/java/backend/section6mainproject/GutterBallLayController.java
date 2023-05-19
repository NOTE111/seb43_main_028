package backend.section6mainproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GutterBallLayController {
    @GetMapping
    public String getOurFuture() {
        return "Team 28 Gutter ball lay!";
    }
}

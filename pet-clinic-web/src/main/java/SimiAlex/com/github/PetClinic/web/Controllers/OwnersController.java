package SimiAlex.com.github.PetClinic.web.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnersController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String getOwners()
    {
        return "owners/index";
    }
    
}

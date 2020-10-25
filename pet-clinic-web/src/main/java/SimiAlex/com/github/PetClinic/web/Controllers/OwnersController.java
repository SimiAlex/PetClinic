package SimiAlex.com.github.PetClinic.web.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import SimiAlex.com.github.PetClinic.services.OwnerService;

@Controller
public class OwnersController {

    // fields
    private final OwnerService ownerService;

    // constructor
    @Autowired
    public OwnersController(OwnerService ownerService)
    {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners/find"})
    public String getOwners(Model model)
    {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}

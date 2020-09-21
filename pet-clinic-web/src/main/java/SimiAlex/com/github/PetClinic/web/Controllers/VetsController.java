package SimiAlex.com.github.PetClinic.web.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import SimiAlex.com.github.PetClinic.services.VetService;

@Controller
public class VetsController {

    private final VetService vetService;

    @Autowired
    public VetsController(VetService vetService){
        this.vetService = vetService;

    }
    
    @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
    public String getVets(Model model)
    {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}

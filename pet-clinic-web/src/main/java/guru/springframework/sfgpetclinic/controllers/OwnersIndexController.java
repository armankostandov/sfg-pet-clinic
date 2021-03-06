package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("owners")
@Controller
public class OwnersIndexController {

    private final OwnerService ownerService;

    public OwnersIndexController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String listOfOwners(Model model) {

        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}

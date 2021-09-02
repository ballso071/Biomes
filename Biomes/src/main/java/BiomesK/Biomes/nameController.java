
package BiomesK.Biomes;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class nameController {
    
    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("nameHome", "name", new name());
    }

    @RequestMapping(value = "/addname", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("name")name name, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", name.getname());
        return "nameView";
    }
    public String submit(
  @Valid @ModelAttribute("employee") Employee employee,
  BindingResult result,
  ModelMap model)
}


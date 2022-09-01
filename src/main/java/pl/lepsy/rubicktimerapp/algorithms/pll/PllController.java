package pl.lepsy.rubicktimerapp.algorithms.pll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pll")
public class PllController {

    private final PllRepository pllRepository;

    public PllController(PllRepository pllRepository) {
        this.pllRepository = pllRepository;
    }

    @GetMapping("/main")
    public String MainSitePll(Model model) {
        List<Pll> pllList = pllRepository.findAll();
        model.addAttribute("pllAll", pllList);
        return "pllSite";
    }

    @GetMapping("/add")
    public String addPll(Model model){
        model.addAttribute("pllAlg", new Pll());
        return "pllAdd";
    }
    @PostMapping("/add")
    public String save(Pll pll){
        pllRepository.save(pll);
        return "redirect:/pll/main";
    }
    @RequestMapping("/delete/{id}")
    public String deletePll(@PathVariable Long id){
        pllRepository.delete(pllRepository.getReferenceById(id));

        return "redirect:/pll/main";
    }
    @GetMapping("/update/{id}")
    public String updatePll(Model model, @PathVariable Long id){
        Pll pll = pllRepository.getReferenceById(id);
        model.addAttribute("pllAlg", pll);
        return "pllAdd";
    }
    @PostMapping("/update/{id}")
    public String updatePll (@PathVariable Long id, Pll formPll){
        Pll pll = pllRepository.getReferenceById(id);
        pll.setPllGroup(formPll.getPllGroup());
        pll.setPllName(formPll.getPllName());
        pll.setPllAlgorithm(formPll.getPllAlgorithm());
        pllRepository.save(pll);
        return "redirect:/pll/main";
    }
}
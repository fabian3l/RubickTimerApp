package pl.lepsy.rubicktimerapp.algorithms.pll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
//        pllService.deletePllAlg(id);
        return "redirect:/pll/main";
    }
    @GetMapping("/update/{id}")
    public String updatePll(Model model, @PathVariable Long id){
//        model.addAttribute("pllAlg", pllService.getPllAlgById(id));
        return "pllAdd";
    }
    @PostMapping("/update/{id}")
    public String updatePll (@PathVariable Long id, Pll formPll){
//        Optional<Pll> pllOptional = pllService.getPllAlgById(id);
//        if (pllOptional.isPresent()){
//            Pll pll = pllOptional.get();
//            pll.setPllName(formPll.getPllName());
//            pll.setPllAlgorithm(formPll.getPllAlgorithm());
//            pll.setPllGroup(formPll.getPllGroup());
//            pllService.updatePllAlg(pll);
//        }
        return "redirect:/pll/main";
    }
}
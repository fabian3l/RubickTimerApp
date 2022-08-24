package pl.lepsy.rubicktimerapp.algorithms.pll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import java.util.Optional;

public class PllConverter implements Converter<String, Pll> {

    @Autowired
    private PllService pllService;

    public Pll convert(String id) {
        Optional<Pll> pllOptional = pllService.getPllAlgById(Long.valueOf(id));

        Pll newPll = new Pll();
        if (pllOptional.isPresent()){
            Pll pll = pllOptional.get();
            return pll;
        }
        return newPll;
    }

}

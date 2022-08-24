package pl.lepsy.rubicktimerapp.algorithms.pll;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PllService {


    private final PllRepository pllRepository;

    @Autowired
    public PllService(PllRepository pllRepository) {
        this.pllRepository = pllRepository;
    }

    public List<Pll> getAll(){
        return pllRepository.findAll();
    }
    public Optional<Pll> getPllAlgById(Long id){
        return pllRepository.findById(id);
    }
    public void savePllAlg(Pll pll){
        pllRepository.save(pll);
    }
    public void updatePllAlg(Pll pll){
        pllRepository.save(pll);
    }
    public void deletePllAlg(Long id){
        pllRepository.deleteById(id);
    }
}

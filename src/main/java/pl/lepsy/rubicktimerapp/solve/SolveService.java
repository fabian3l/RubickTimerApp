package pl.lepsy.rubicktimerapp.solve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SolveService {

    private final SolveRepository solveRepository;

    @Autowired
    public SolveService(SolveRepository solveRepository) {
        this.solveRepository = solveRepository;
    }

    public List<Solve> getAll(){
        return solveRepository.findAll();
    }
    public Solve getSolveById(Long id){
        return solveRepository.getOne(id);
    }
    public void saveSolve(Solve solve){
        solveRepository.save(solve);
    }
    public void updateSolve(Solve solve){
        solveRepository.save(solve);
    }
    public void deleteSolve(Long id){
        solveRepository.deleteById(id);
    }
}

package pl.lepsy.rubicktimerapp.algorithms.pll;

import lombok.Data;
import pl.lepsy.rubicktimerapp.solve.Solve;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = Pll.TABLE_NAME)
@Data
public class Pll {

    final static String TABLE_NAME = "pllAlg";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pll_id")
    private Long pllId;
    @Column(name = "pll_name")
    private String pllName;
    @Column(name = "pll_algorithm")
    private String pllAlgorithm;
    @Column(name = "pll_group")
    private String pllGroup;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Solve> solves;

    public Pll(){

    }

    public Pll(Long pllId, String pllName, String pllAlgorithm, String pllGroup) {
        this.pllId = pllId;
        this.pllName = pllName;
        this.pllAlgorithm = pllAlgorithm;
        this.pllGroup = pllGroup;
    }

    public Long getPllId() {
        return pllId;
    }

    public void setPllId(Long pllId) {
        this.pllId = pllId;
    }

    public String getPllName() {
        return pllName;
    }

    public void setPllName(String pllName) {
        this.pllName = pllName;
    }

    public String getPllAlgorithm() {
        return pllAlgorithm;
    }

    public void setPllAlgorithm(String pllAlgorithm) {
        this.pllAlgorithm = pllAlgorithm;
    }

    public String getPllGroup() {
        return pllGroup;
    }

    public void setPllGroup(String pllGroup) {
        this.pllGroup = pllGroup;
    }
}

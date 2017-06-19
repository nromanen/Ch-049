package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class TooSets {
    private Set <String> set1;
    private Set <String> set2;

    public void setSet1(Set<String> set1) {
        this.set1 = set1;
    }

    public void setSet2(Set<String> set2) {
        this.set2 = set2;
    }

    public Set<String> getSet1() {
        return set1;
    }

    public Set<String> getSet2() {
        return set2;
    }


    public Set<String> union(){
        Set<String> res = new LinkedHashSet<>();
        res.addAll(set1);
        res.addAll(set2);
        return res;
    }

    public Set<String> intersect() {
        Set<String> res = new LinkedHashSet<>(set1);
        res.retainAll(set2);
        return res;
    }
   
}
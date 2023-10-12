import java.util.HashSet;
import java.util.Set;

public class Cat {
    private String name;
    private Set<Cat> catsSet = new HashSet<>();
    public Cat(String name){
        this.name = name;
    }

    public Cat() {
    }


}

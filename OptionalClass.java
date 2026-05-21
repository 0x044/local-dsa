import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    static void main() {
        List<String> names = Arrays.asList("Dharun", "Tharuniyaa");

        Optional<String> name = names.stream().filter(s->s.contains("aa")).findFirst();

        if(name.isPresent()){
            IO.println("Name found");
        }else {
            IO.println("No name");
        }
    }
}

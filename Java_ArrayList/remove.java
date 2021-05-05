package Java_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class remove {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("c");
        programmingLanguages.add("c++");
        programmingLanguages.add("java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("ruby");

        System.out.println("Initial list: "+ programmingLanguages);
        programmingLanguages.remove(5);
        System.out.println("After remove(5): "+ programmingLanguages);
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"):"+programmingLanguages);

        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("python");
        scriptingLanguages.add("ruby");
        scriptingLanguages.add("perl");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages) "+programmingLanguages);

        programmingLanguages.removeIf(n->(n.charAt(0)=='T'));
        System.out.println("After Removing all elements that start with \"C\": "+programmingLanguages);
        programmingLanguages.clear();
        System.out.println("after clear"+programmingLanguages);



    }
}

package GLAB_303_3_1;

import java.util.Arrays;

public class splitDemo {

    public void splitDemo() {
        String vowels = "a::b::c::d:e";

        String[] result = vowels.split("::");

        System.out.println("result = " + Arrays.toString(result));
    }



}

package utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Splitor {
    public static List<String> split(String names) {
        return Arrays.stream(names.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }
}

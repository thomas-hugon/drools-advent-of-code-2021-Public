package day15;

import common.DroolsHelper;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        DroolsHelper.execute("/day15/part1.drl", "/day15/input.txt");
        DroolsHelper.execute("/day15/part2.drl", "/day15/input.txt");
    }
}

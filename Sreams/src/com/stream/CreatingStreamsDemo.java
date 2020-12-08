package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show(){
         Stream.iterate(1, n -> n +1)
                 .limit(10)
                 .forEach(n -> System.out.println(n));

////////////////////////////////////////////////////////
//        var stream = Stream.generate(() -> Math.random());
//        stream
//                .limit(6)
//                .forEach(n -> System.out.println(n));

    }
}

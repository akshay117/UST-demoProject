package com.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show(){

        IntStream.rangeClosed(1,5)
                .forEach(System.out::println);

//        List<Movie> movies = List.of(
//                new Movie("a", 10, Genre.THRILLER), // 10
//                new Movie("c", 20, Genre.ACTION), // 10 + 20 = 30
//                new Movie("b", 30, Genre.ACTION) // 30 + 30 = 60
////                new Movie("d", 40), // 60 + 40 = 100
////                new Movie("e", 20), // 100 + 20 = 120
////                new Movie("f", 50) // 120 + 50 = 170
//        );

//        var results = movies.stream()
//                .collect(Collectors.partitioningBy(
//                        m -> m.getLikes() > 20,
//                        Collectors.mapping(Movie::getTitle,
//                                            Collectors.joining(","))));
//
//        System.out.println(results);

//        var result = movies.stream()
//                .collect(Collectors.groupingBy(
//                        Movie::getGenre,
//                        Collectors.mapping(
//                                Movie::getTitle,
//                                Collectors.joining(",")
//                        )));
                        //Movie::getGenre, Collectors.joining()));
                        //Movie::getGenre, Collectors.counting()));
                        //Movie::getGenre, Collectors.toSet()));

        //System.out.println(result);


//        var result = movies.stream()
//                .filter(m -> m.getLikes() > 10)
//                .map(Movie::getTitle)
//                .collect(Collectors.joining(","));
//                //.collect(Collectors.summarizingInt(Movie::getLikes));
                //.collect(Collectors.toMap(Movie::getTitle, Function.identity()));
//                .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));
//                .collect(Collectors.toMap(m -> m.getTitle(), m -> m.getLikes()));
                //.collect(Collectors.toSet());
                //.collect(Collectors.toList());
        //System.out.println(result);
///////////////////////////////////////////////
//       Optional<Integer> sum = Optional.ofNullable(movies.stream()
//               .map(m -> m.getLikes())
//               .reduce(0, Integer::sum));
//
//        //sum.get();
//        System.out.println(sum);




//        var result = movies.stream()
//                .allMatch(m -> m.getLikes() < 20);
//        var result = movies.stream()
//                .max(Comparator.comparing(Movie::getLikes))
//                //.findFirst()
//                .get();

//        System.out.println(result.getTitle());


//        movies.stream()
//                .filter(m -> m.getLikes() > 10)
//                .peek(m -> System.out.println("Filtered: " + m.getTitle()))
//                .map(Movie::getTitle)
//                .peek(t -> System.out.println("Mapped: " + t))
//                .forEach(System.out::println);


/////////////////////////////////////////////////////////////////////////////////
//        movies.stream()
//                .map(Movie::getLikes)
//                .distinct()
//                .forEach(System.out::println);
//                //.forEach(like -> System.out.println(like));
/////////////////////////////////////////////////////////////////////////////////
//        movies.stream()
//                //.sorted( (a, b) -> a.getTitle().compareTo(b.getTitle()))
//                //.sorted(Comparator.comparing(m -> m.getTitle()))
//                //.sorted(Comparator.comparing(Movie::getTitle))
//                .sorted(Comparator.comparing(Movie::getTitle).reversed())
//                .forEach(m -> System.out.println(m.getTitle()));

//                .sor
//                .forEach(m -> System.out.println(m.getTitle()));



// 1000 movies
        // 10 movies per page
        // 3rd page ? 20
        // skip(20) = skip( ( page -1) x pageSize)
//        movies.stream()
//                .dropWhile(m -> m.getLikes() < 30)
//                //.takeWhile(m -> m.getLikes() < 30) // till the condition is true we get the data;
//                .forEach(m -> System.out.println(m.getTitle()));



/////////////////////////////////////////////////////
//        movies.stream()
//                .skip(2)
//                //.limit(2)
//                .forEach(m -> System.out.println(m.getTitle()));

/////////////////////////////////////////////////////////////////
//        Predicate<Movie> isPopular = m -> m.getLikes() > 10;
//
//        movies.stream()
//                .filter(isPopular)
//                .forEach(m -> System.out.println(m.getTitle()));
///////////////////////////////////////////

//        movies.stream() > 10.
//                .filter(m -> m.getLikes() > 10)
//                .forEach(m -> System.out.println(m.getTitle()));
////////////////////////////////////////////////////////////
//        Stream map(Function mapper)
//        movies.stream()
//                //.mapToInt(movie -> movie.getLikes())
//                // displaying corresponding new stream
//                .map(movie -> movie.getTitle())
//                .forEach(name -> System.out.println(name));
//////////////////////////////////////////////////////////////////////
//        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
//        //stream.forEach(list -> System.out.println(list));
//
//        stream
//                .flatMap(list -> list.stream())
//                .forEach(n -> System.out.println(n));
    }
}

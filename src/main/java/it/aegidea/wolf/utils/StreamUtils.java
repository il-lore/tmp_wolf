package it.aegidea.wolf.utils;

import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamUtils {

   // ####### BATCHES #######

   public static <I> Collection<I> filterAll(Collection<I> inCollection, Predicate<I> predicate) {
      return inCollection.stream().filter(predicate).collect(Collectors.toList());
   }

   public static <I, O> Collection<O> mapAll(Collection<I> inCollection, Function<I, O> mapper) {
      return inCollection.stream().map(mapper).collect(Collectors.toList());
   }
}

package com.github.vincentk.byteme;

/**
 * This type is not as water-tight as one would like. I think though it is as tight as java permits.
 * 
 * The idea is to use this interface to indicate that we're not just looking at cursor into a {@link Countable} set,
 * but that we can traverse it both ways, i.e. we have something like a zipper [1] 
 * 
 * [1] https://en.wikipedia.org/wiki/Zipper_%28data_structure%29
 * 
 * @param <E>
 * @param <R>
 */
public interface Reversible<E extends Countable, R extends Reversible<E, R>> extends Countable{

	Reversible<E, R> reverse();
}

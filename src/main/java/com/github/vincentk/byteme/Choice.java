package com.github.vincentk.byteme;

/**
 * Something like the axiom of choice (https://en.wikipedia.org/wiki/Axiom_of_choice)
 * @param <E>
 */
public interface Choice<E extends Element> {
	E choice();
}

package com.github.vincentk.byteme;

/**
 * An Indexed Family of things.
 */
public interface Indexed<I, E extends Element> {

	E apply(I index);
}

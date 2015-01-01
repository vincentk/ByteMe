package com.github.vincentk.byteme;

/**
 * Of practical relevance in java, as (positive semi-definite) ints are used to index into arrays.
 * 
 * Higher-kinded types are starting to be sorely missing at about around here.
 */
public interface IntIndexed<F extends Finite, Z extends FZipper<F, Z>>
{
	Z get(int i);
	
	int size();
}

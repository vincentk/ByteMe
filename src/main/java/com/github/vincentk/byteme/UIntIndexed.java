package com.github.vincentk.byteme;

/**
 * Base interface for array-like data structures, where only positive ints can possibly be valid indices.
 * 
 * @param <F>
 * @param <Z>
 */
public interface UIntIndexed<F extends Finite, Z extends FZipper<F, Z>> extends IntIndexed<F, Z>, Choice<Z>  {
	
	@Override default Z choice() { return get(0); } 
}

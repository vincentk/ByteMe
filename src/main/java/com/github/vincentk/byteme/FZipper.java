package com.github.vincentk.byteme;

/**
 * Zipper over finite data structures
 */
public interface FZipper<F extends Finite, SELF extends FZipper<F, SELF>> extends Reversible<F, SELF>{

}

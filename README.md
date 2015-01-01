ByteMe
======

An Exploration of Collections of Primitive Types in Java

Recent discussions [1], [2] reminded me of a long-standing itch that I've been wanting to scratch:
* arrays of primitive types have obvious performance advantages,
* java generics and primitive types don't mesh well, and so container-like data structures tend to not support primitive types (except via the workaround of auto-boxing).

The question I'm trying to answer here is how much mileage one can get out of completely decoupling collection interfaces from the specification of the backing store.
In particular, is it possible to define operations on collections in a reasonably generic fashion while maintaining the freedom to
* implement the backing store in terms of arrays of primitives (this is where primitives really shine in terms of performance),
* avoid boxing and un-boxing during traversal?

Consider the following simple example use cases:

* What's the mean of an array of `int[]`, what's the mean of a `double[]`? Is it possible to write a function `mean` which 
does NOT generate garbage, while retaining the ability to operate on either an `int[]` or a `double[]`?
* Is it possible to write something like an `ArrayList` or an [unrolled linked list](https://en.wikipedia.org/wiki/Unrolled_linked_list) which can be backed by one or more `double[]` or `int[]`? If so, how much of the implementation could be shared?

I believe that the answer is not black and white. Indeed, I believe if one decomposes the problem into
* an abstract pointer or iterator API, which concerns itself exclusively with traversal logic,
* declarative composition rules for the above API,
* mutable pointer implementations which allow one to express that e.g. both `int` and `double` can be made to comply with `java.lang.Number`,
* concrete implementations of elementary array-based data structures for all primitive types (which is a very small set of types),
then the answer should become clear from the implementation. 

If the result is too cryptic or convoluted to be of practical use, then at least I know for sure. 
If it isn't perhaps it might be very useful to have this spelled out indeed.

[1] http://cr.openjdk.java.net/~briangoetz/valhalla/specialization.html
[2] http://mail.openjdk.java.net/pipermail/valhalla-dev/2014-December/000474.html
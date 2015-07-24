package com.ticotrack.util;

/**
*** Accumulator Long container.
*** Typically used in conditions where it is desireable to pass an accumulator
*** to an inner-class and have the value accessible from outside the inner-class.
*** (If the accumulator is to be used from different threads in a multi-threaded
*** environment, use "AtomicLong" instead).
**/

public class AccumulatorLong
{

    // ------------------------------------------------------------------------

    private long   accum     = 0L;

    /**
    *** Constructor
    **/
    public AccumulatorLong()
    {
        this(0L);
    }

    /**
    *** Constructor
    *** @param val  Initial value
    **/
    public AccumulatorLong(long val)
    {
        this.accum = val;
    }

    // ------------------------------------------------------------------------

    /**
    *** Sets the value of the accumulator
    *** @param v  The new value
    **/
    public void set(long v)
    {
        this.accum = v;
    }

    /**
    *** Gets the value of the accumulator
    *** @return The current value
    **/
    public long get()
    {
        return this.accum;
    }

    // ------------------------------------------------------------------------

    /**
    *** Adds the specified value to the accumulator
    *** @param v  The value to add
    **/
    public void add(long v)
    {
        this.accum += v;
    }

    /**
    *** Subtracts the specified value from the accumulator
    *** @param v  The value to subtract
    **/
    public void subtract(long v)
    {
        this.accum -= v;
    }

    // ------------------------------------------------------------------------

    /**
    *** Increment the value of the accumulator by 1
    **/
    public void increment()
    {
        this.accum++;
    }

    /**
    *** Decrement the value of the accumulator by 1
    **/
    public void decrement(long v)
    {
        this.accum--;
    }

    // ------------------------------------------------------------------------

    /** 
    *** Increment, and return the next value
    *** @return The next value
    **/
    public long next()
    {
        this.increment();
        return this.get();
    }

    /** 
    *** Add the specified value, and return the result
    *** @param v The value to add
    *** @return The next value
    **/
    public long next(long v)
    {
        this.add(v);
        return this.get();
    }

    // ------------------------------------------------------------------------

}


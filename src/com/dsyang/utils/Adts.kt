package com.dsyang.utils;

sealed class Operation(val n1: Int, val n2: Int) {
    class Add(n1: Int, n2: Int) : Operation(n1, n2)
    class Subtract(n1: Int, n2: Int) : Operation(n1, n2)
    class Multiply(n1: Int, n2: Int) : Operation(n1, n2)
    class Divide(n1: Int, n2: Int) : Operation(n1, n2)
}





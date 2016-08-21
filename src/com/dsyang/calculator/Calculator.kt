@file:JvmName("Calculator")

package com.dsyang.calculator

import com.dsyang.utils.Operation

fun calculate(num1: String, op: String, num2: String): String {
    return compute(parse(num1, op, num2)).toString()
}

private fun parse(num1: String, op: String, num2: String): Operation {
    val n1 = num1.toInt()
    val n2 = num2.toInt()
    return when(op) {
        "+" -> Operation.Add(n1, n2)
        "-" -> Operation.Subtract(n1, n2)
        "*" -> Operation.Multiply(n1, n2)
        "/" -> Operation.Divide(n1, n2)
        else -> throw UnsupportedOperationException("Operation $op unsupported")
    }
}

private fun compute(op: Operation): Number {
    return when (op) {
        is Operation.Add -> op.n1 + op.n2
        is Operation.Subtract -> op.n1 - op.n2
        is Operation.Multiply -> op.n1 * op.n2
        is Operation.Divide -> op.n1 / op.n2
    }
}


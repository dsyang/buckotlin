@file:JvmName("Utils")

package com.dsyang.utils

fun join(array: Array<String>, delimeter: String): String {
    return array.joinToString(separator = delimeter)
}


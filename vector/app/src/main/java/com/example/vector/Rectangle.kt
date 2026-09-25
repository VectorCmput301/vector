package com.example.vector

class Rectangle(val width: Int, val height: Int) : Shape() {
    fun area(): Int {
        return width * height
    }
}
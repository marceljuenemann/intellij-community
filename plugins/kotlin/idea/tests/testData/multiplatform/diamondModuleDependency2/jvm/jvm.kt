@file:Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
package sample

interface D : A {
    fun foo_B_1()
    fun foo_B_2()
    fun foo_C_1()
    fun foo_C_2()
    fun foo_D()
}

actual typealias <!ACTUAL_CLASSIFIER_MUST_HAVE_THE_SAME_MEMBERS_AS_NON_FINAL_EXPECT_CLASSIFIER_WARNING, LINE_MARKER("descr='Has expects in common-2-1 module'")!>B<!> = D
actual typealias <!ACTUAL_CLASSIFIER_MUST_HAVE_THE_SAME_MEMBERS_AS_NON_FINAL_EXPECT_CLASSIFIER_WARNING, LINE_MARKER("descr='Has expects in common-2-2 module'")!>C<!> = D

fun take0(x: D): Unit = null!!

fun test_1(x: D) {
    val res0: Unit = take0(x)
    <!OVERLOAD_RESOLUTION_AMBIGUITY!>take1<!>(x)
    val res2: BB = take2(x)
    val res3: BB = take3(x)
    <!OVERLOAD_RESOLUTION_AMBIGUITY!>take4<!>(x)
}

fun test_2() {
    val x = getB()
    x.foo_A()
    x.foo_A_3()
    x.foo_B_1()
    x.foo_B_2()
    x.foo_C_1()
    x.foo_C_2()
    x.foo_D()
}

fun test_3() {
    val x = getB()
    x.foo_A()
    x.foo_A_3()
    x.foo_B_1()
    x.foo_B_2()
    x.foo_C_1()
    x.foo_C_2()
    x.foo_D()
}

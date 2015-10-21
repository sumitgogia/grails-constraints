package net.zorched.test

class Foo {
    String bar
    List<String> baz

    static hasMany = [baz: String]

    static constraints = {
        bar(twoLong: true, nullable:true)
        baz(twoLong: true)
    }
}

# Kotlin Coroutines Deep Dive

This directory is for notes and exercises from the book 
Kotlin Coroutines Deep Dive by Marcin Moskala.

## Running Kotlin Files

`kotlinc <filename>.kt -include-runtime -d <jarName>.jar`
`java -jar <jarName>.jar`

OR

Using `kotlin` script to run binaries produced by kotlinc

`kotlin -classpath <jarName>.jar ClassNameKt`

^ If file name is `hello.kt` kotlinc will generate main class name of `HelloKt`


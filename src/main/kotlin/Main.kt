fun main(args: Array<String>) {
    val tree = Node(4)
    val keys = arrayOf(8, 123, 23, 4, 1, 17, 67, 90, 14, 24, 7)
    for (key in keys) {
        tree.insert(key)
    }
    println(tree.visit().joinToString { it.toString() })
}
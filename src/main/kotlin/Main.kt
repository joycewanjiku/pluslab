fun main() {
    var studentname = arrayOf("Sharon", "Marion", "Samuel")
    var age = arrayOf(21, 33, 26)
    var phoneNumbers = arrayOf(+254712398785, +254709326578, +254763459802)
    var weighKg = arrayOf(47, 53, 63)
    var citizenship: Boolean = true
    var student1 = arrayOf("studentname", age[0], phoneNumbers[0], weighKg[0], !citizenship)
    println(student1.contentDeepToString())
    var student2 = arrayOf("studentname", age[1], phoneNumbers[1], weighKg[1], citizenship)
    println(student2.contentDeepToString())

    var student3 = arrayOf("studentname", age[2], phoneNumbers[2], weighKg[2], !citizenship)
    println(student3.contentDeepToString())
}




fun main() {
    // put your code here
    var input = readln().toInt()

    while (input != 1) {
        print("$input ")
        if (input % 2 == 0) {
            input /= 2
        } else {
            input = input * 3 + 1
        }
    }
    print(input)
}
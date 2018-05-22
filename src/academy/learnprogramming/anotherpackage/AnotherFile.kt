package academy.learnprogramming.anotherpackage

import academy.learnprogramming.inheritance.CompanyCommunications as Comm
import academy.learnprogramming.inheritance.someTopLevelFunction as tp
import academy.learnprogramming.inheritance.Department.*
fun main(args: Array<String>) {
    tp("Hello from Another File")
    print(Comm.getCopyrightLine())
    print(IT.getDeptInfo())
    print(SALES.getDeptInfo())


}
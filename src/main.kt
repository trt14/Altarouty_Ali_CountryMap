fun main(){
    val Countries = mutableMapOf<String ,String>()

for(i in 0..2){
    print("Enter Country: ")
    var Country = readLine()!!
    print("Enter Capital: ")
    var Capital = readLine()!!

    Countries[Country] = Capital
}
    for (i in Countries){
        println("The Country is "+i.key+" , the Capital is :"+i.value)

    }
}
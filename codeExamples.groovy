//(1..100).each{println "${it % 3 ? '' : 'Fizz'}${it % 5 ? '' : 'Buzz'}" ?: it}
//(1..100).each{println "${it%3?'':'Fizz'}${it%5?'':'Buzz'}"?:it}
//(1..100).each{println((it%3?'':'Fizz')+(it%5?'':'Buzz')?:it)} //http://java.dzone.com/articles/fizzbuzz-without-ifs-90

//https://www.accelebrate.com/blog/call-pogo-name/

/*
import groovy.transform.Canonical
@Canonical
class GroovyTask {
    String name
    int priority
    Date startDate
    Date endDate
    boolean completed
}
*/


// http://www.nobigo.com/design-a-deck-of-playing-cards-deck-shuffling/#.VLM24c3d9hE

/*
def suits = ["HEARTS","SPADES","DIMONDS", "CLUBS"]
def faceCards = ["Jack" ,"Quean", "King", "Ace"]
def cards = []

suits.eachWithIndex{suit, value ->
    def numberCards = 2..10
    numberCards.each{card ->
        cards << [value:card, display:card, suit:suit, suitValue:value]
    }

    faceCards.eachWithIndex{card, suitValue ->
        cards << [value:suitValue+11, display:card, suit:suit, suitValue:value]
    }
}

Collections.shuffle(cards)
(1..52).each{
    println cards.pop()
}
*/



/*

@Grab('commons-codec:commons-codec:1.8')
import org.apache.commons.codec.digest.DigestUtils
//String.metaClass.sha1 << {DigestUtils.sha1Hex(delegate)}
String.metaClass.sha1 = {DigestUtils.sha1Hex(delegate)}
println DigestUtils.sha1Hex('test')
println 'test'.sha1()
println "${'test'.sha1()} = ${DigestUtils.sha1Hex('test')}"

*/


//Groovy Truth

/*
def testTruth(op){
    if(op){
        println("true $op")
    }else{
        println("false $op")
    }
}
testTruth(0)
testTruth("")
testTruth([])
testTruth([:])

testTruth(1)
testTruth([1,2,3])
testTruth([1:"one",2:"two"])
String presenter = "Tucker"
testTruth(presenter)
testTruth(presenter.equals("Tucker"))
testTruth(presenter == "Tucker")
testTruth(presenter == "Dumb Dumb")

*/

// == is .equals from java
// <=> is compareTo from java space-ship operator

/*
println 0 <=> 2
println 1 <=> 0
println 1 <=> 1

class nullTest{
    def name = "Tucker"
}
def nullInst1 = new nullTest()
def nullInst2 = null

println nullInst1?.name
println nullInst2?.name


println "ls /".execute().text
*/


//**********************************
//Groovy Strings
/*
def presenter ="Tucker"
println('string'.class)
println("string presenter".class)
println("string $presenter".class)
println('''string $presenter
'''.class)
println("""string $presenter""".class)

def stringTest = "test"
println stringTest[0..2]
println stringTest[-1..(-1*stringTest.length())]

println("""Multi
line
String""")


println('''Multi
line
String''')
*/

//**********************************
//Groovy closures

/*
//each
def list = [1,2,3,4] //arrayList
 
list << 5
 
list.each{ something ->
 
    println something
 
}

*/

//spread operator

/*

def list2 = ["one","two","three"]
println list2*.toUpperCase().join(', ')

*/

//.each with index

/*
list.eachWithIndex{ e,i ->
 
    println "index $i, element $e"
 
}

println(list[-1])
*/

//map .each

/*
def map = ["key1":"value1","key2":"value2"] //HashMap

map["key3"]= "value3"

map.each{
 
    println "$it.key : $it.value"
 
}
*/

//collect like map from other languages

/*
def lst = [1,2,3]
println("double ${lst.collect{it *2}}")
*/

//inject like reduce form other languages

/*
def value = [1, 2, 3].inject('counting: ') { str, item -> str + item }
println  value == "counting: 123"
 
value = [1, 2, 3].inject(0) { count, item -> count + item }
println value == 6

*/

//times

/*

def someIntValueInYourProgam = 5
someIntValueInYourProgam.times{
    println it
}

*/


//join

/*

def listString = "Banana Pinaple Apple Mango"
def listlist= ["Banana", "Pinaple", "Apple", "Mango"]
println listString.split(" ").join(", ")
println listlist.join(",_")

*/


//**********************************
//delegation see also traits a new construct that came in groovy 2.3

/*


class Worker {
  void doWork() {
     println "working..."
  }

  void writeReport() {
    println "writing..."
  }
}

public class Manager {
  private Worker worker = new Worker();
  
  public void schedule() {
    System.out.println("Scheduling");
  }

  public void doWork() {
    worker.doWork();
  }

  public void writeReport() {
    worker.writeReport();
  }
}


//class Manager {
//  @Delegate Worker worker = new Worker()
//  
//  void schedule() {
//    println "Scheduling"
//  }
//}


Manager BossMan = new Manager()
BossMan.schedule()
BossMan.doWork()
BossMan.writeReport()

*/

class UtilService{
    
    def process(strings, selector){

        /*
         *  lot processing code here
         */

        def selected = strings.get(0)
        strings.each{ s ->
            if(selector(s, selected)){
                selected = s
            }

        } 

        println(selected)

        /*
         *  lot processing code here
         */

    }

    def static void main(def args){
        def strings = [
            "123456",
            "1234",
            "1234",
            "12345678",
            "1",
            "12345"
        ]

        UtilService util = new UtilService()
        util.process(strings){s, selected -> s.size() > selected.size() ? true : false}
        util.process(strings){s, selected -> s.size() < selected.size() ? true : false}
    }
}
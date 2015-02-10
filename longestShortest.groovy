public class UtilService{
    
    public processForLongest(List<String> strings){

        /*
         *  lot processing code here
         */

        String longest = getLongest(strings);
        System.out.println(longest);

        /*
         *  lot processing code here
         */

    }

    public processForShortest(List<String> strings){

        /*
         *  lot processing code here
         */

        String shortest = getShortest(strings)
        System.out.println(shortest);

        /*
         *  lot processing code here
         */

    }

    public String getLongest(List<String> strings){
        String longest = strings.get(0);
        for(int x = 0 ; x < strings.size() ; x++){
            if(strings.get(x).size() > longest.size()){
                longest = strings.get(x);
            }
        }

        return longest;

    }

    public String getShortest(List<String> strings){
        String shortest = strings.get(0);
        for(int x = 0 ; x < strings.size() ; x++){
            if(strings.get(x).size() < shortest.size()){
                shortest = strings.get(x);
            }
        }

        return shortest;
    }

    public static void main(String[] args){
        List<String> strings = new ArrayList<String>();
        strings.add("123456");
        strings.add("1234");
        strings.add("1234");
        strings.add("12345678");
        strings.add("1");
        strings.add("12345");

        UtilService util = new UtilService();
        util.processForLongest(strings);
        util.processForShortest(strings);
    }
}
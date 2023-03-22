public class Quiz {


    /** 1. Write a method that returns the number of vowels in a string.
           Consider a, e, i, o, u as vowels. **/

    public int vowelNumber(String str){
        int vowelCount = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowelCount++;

            }

        }

        return vowelCount;

    }




    /** 2. Write a method called findN that finds the number of natural numbers not exceeding N
        and not divisible by any of the numbers [2, 3, 5].

        Example

        Let's take the number 5 as an example:

        1 - doesn't divide integer by 2, 3, and 5
        2 - divides integer by 2
        3 - divides integer by 3
        4 - divides integer by 2
        5 - divides integer by 5

        Answer: 1 (only one number doesn't divide integer by any of 2, 3, 5) **/

    public int findN(int N){
        int countNum = 0;
        for(int i=0; i<=N; i++){
            if(!(i%2==0 || i%3==0|| i%5==0)){
                countNum++;

            }

        }

        return countNum;

    }



    /** 3. Write a method called camelCaseMe so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should always be capitalized.

           Examples

           "the-stealth-warrior" gets converted to "theStealthWarrior"

           "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

           "The_Stealth-Warrior" gets converted to "TheStealthWarrior" **/

    public String camelCaseMe(String str){
        str = str.substring(0,1).toUpperCase()+str.substring(1);
        while(str.contains("-") || str.contains("_")){
            for(int i = 0; i<str.length(); i++){
                if(str.charAt(i)=='-' || str.charAt(i)=='_'){
                    String afterDash = str.substring(i+1,i+2).toUpperCase() + str.substring(i+2);
                    str = str.substring(0,i) + afterDash;


                }


            }

        }

        return str;

    }


}

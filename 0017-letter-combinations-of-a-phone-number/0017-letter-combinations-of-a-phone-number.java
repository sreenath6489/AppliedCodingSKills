class Solution {

    List<String> result = new ArrayList<>();

    String[] phone={
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        if(digits.length()==0)
            return result;

        makeWords(0,"",digits);

        return result;
    }

    public void makeWords(int index,
                           String current,
                           String digits)
    {
        if(index==digits.length())
        {
            result.add(current);
            return;
        }

        char digit=digits.charAt(index);

        int num=digit-'0';

        String letters=phone[num];

        for(int i=0;i<letters.length();i++)
        {
            char ch=letters.charAt(i);

            makeWords(index+1,
                      current+ch,
                      digits);
        }
    }
}


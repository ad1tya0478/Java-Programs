// Problem 395: Longest Substring with At least K Repeating Characters 

public class Question_385 {
    public static void main(String[] args) {
        System.out.println(longestSubstring("aaabb", 3));
    }
    static int longestSubstring(String s, int k){

    int ans = 0;    // this contains the answer, the length of the substring 

    for(int target = 1; target <= 26; target++){     // ye loop 26 tak isiliye chalega kyuki, isme apan ko lower case letters diye gaye hai string mai, aur here we are finding the longest substring that contains 1 unique character, then 2 unique character and then 3........... goes on till 26. And here target is Desired number of unique characters inside the current window( kitne unique characters apne ek window ke andar reh sakte hai)

        int[] freq = new int[26];  // this array stores frequency of each unique character 
        int left = 0;   // window ka left pointer 
        int right = 0;  // window ka right pointer 
        int unique = 0; // kitni unique values hai apni current window mai 
        int countatLeastK = 0; // kitne characters jinki frequency >=  k hai wo isme store honge 

        while(right < s.length()){     // ye expansion loop hai jo right pointer ko badhayega string ki length tak
            int rightChar = s.charAt(right) - 'a';   // ye current character ke liye hai, jisme s.charAt(right) agar 'a' hai toh | 'a' - 'a' = 0 | so the rightChar is at 0 index for now 

            if(freq[rightChar] == 0) unique++;  // very important line, agar freq[rightChar] == 0 the unique++, maan lo freq[rightchar] apna hai 'a' fir ye dekhega ki ye jo unique character hai wo freq array mai hai ya nhi, agar ye 0 hai toh new character aagaya unique ko + 1 kar do agar 'a' character dobara aaya hai to uski freq ko + 1 kar do bass unique++ wali condtion chalegi he nhi 
            freq[rightChar]++;  // increment kardo uss character ko jo aaya hai like if 'a' was 0 then one 'a' came then a = 1, then b came so b = 1, if another a came then unique++ wont run only this command, because this command tracks how many times the character has come, uski freq apne aap badhti rahegi  

            if(freq[rightChar] == k) countatLeastK++;  // agar jo freq[rightChar] == k, mtlb agar 'a' character k ke barabar aagaya aur iss condtion ko satisfy kar diya toh countAtleastk + 1 ho jayega, aur countatleastK means ki kitne unique characters hai jo k se bade ya equal hai, lekin is conditon mai apan bada(freq[rightChar] >= k) nhi kar sakhte kyuki wo countatleastk ko bhi bada dega jo ki apan nhi chahte kyuki wo conditon pahle ki fulfill kar chuke hai 

        while(unique > target){   // second loop, iss loop mai apan window ko shrink kar rhe hai, agar jo unique charcters hai wo bad gaye like 3 unique ho gaye lekin apan ne target mai allow sirf 2 kare the then we will reduce the window 
            int leftChar = s.charAt(left) - 'a';  // current character that is about to leave the window 
            if(freq[leftChar] == k) countatLeastK--;  // idhar apan check karte hai ki jo character apan remove kar rhe hai uski freq k ke barabar hai, agar hai toh fir baad mai wo character remove ho jayega mtlb agar "a" = 3 and k = 3, then this satisfies the condtion and we can decrement the countatleastk BECUASE that character is gonna get removed, and we check this condtion before we remove the character kyuki agar wo character humne pahle he hata diya toh wo condtion false ho jayegi dekho (a = 3 and k = 3, then u remove one character which is a, then a = 2, it doesnt qualify the condition and we wont be able to decrement the countatleastk which is not right)
            freq[leftChar]--;  // the actual removal of the character 
            if(freq[leftChar] == 0) unique--; // agar uski freq[leftChar] == 0 then decrement the unique mtlb agar wo specific character ki frequency abb bachi he nhi zero ho gayi hai toh fir wo hai he nhi array mai iska mtlb ek character puri tarah se hatt gaya toh uski unique value bhi decrement hogi 
            left++; // window getting shrink 
        }

        if(unique == target && unique == countatLeastK){  // suppose target = 3, | Target means "I'm currently looking for substrings that contain exactly 3 unique characters." | 1). We have exactly the number of unique characters we're currently targeting. 2). Every one of those unique characters has reached frequency k.
            ans = Math.max(ans, right - left + 1);
        }
        right++;

        }
    }
    return ans;
    }
}

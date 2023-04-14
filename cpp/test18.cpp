#include <string>
#include <vector>

using namespace std;
string Word[] = {"zero", "one", "two", "three", "four"
                 ,"five", "six", "seven", "eight", "nine"};
int solution(string s) {
    string result;
    for(int pos = 0 ; pos < s.size();)
    {
        if(s[pos] >= '0' && s[pos] <= '9')
        {
            result += s[pos++];
        }
        else
        {
            for(int i = 0 ; i < 10 ; i ++)
            {
                if(s.find(Word[i], pos) == pos)
                {
                    result += '0'+ i;
                    pos += Word[i].length();
                }
            }
        }
    }
    int answer = atoi(result.c_str());
    return answer;
}
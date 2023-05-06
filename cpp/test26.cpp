#include <string>
#include <vector>

using namespace std;

bool solution(string s) {
    bool answer = true;
    for(int i = 0 ; i < s.size(); i++)
    {
        if((s.size() == 4 || s.size() == 6)&& isdigit(s[i]))
        {
            answer = true;
        }
        else
        {
            answer = false;
            break;
        }
    }
    return answer;
}
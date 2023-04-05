#include <iostream>
#include <string>

using namespace std;
int solution(int n)
{
    int answer = 0;
    string s = to_string(n);
    for(int i = 0 ; i < s.size(); i++)
    {
        s[i] = s[i] - 48;
        //48대신 '0'으로 써도 된다.
        //s[i] = s[i]-'0'; 이렇게..
        
        answer += s[i];
    }
    return answer;
}
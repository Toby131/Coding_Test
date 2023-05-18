#include <string>
#include <vector>

using namespace std;

vector<int> solution(long long n) {
    vector<int> answer;
    string s = to_string(n);
    
    for(int i = s.size() ; i > 0 ; i--)
    {
        answer.push_back(s[i-1]-'0');
        // answer.push_back(s[i-1]-48); 도 가능
    }
    return answer;
}
